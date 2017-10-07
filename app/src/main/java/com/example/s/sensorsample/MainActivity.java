package com.example.s.sensorsample;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;
    private Sensor sensor;

    int position=0;

    private boolean showDeviceFlag = true;
    private TextView dataText;
    private TextView listText;
    private Spinner dataSpinner;

    public int[] sensorID = SensorList.sensorID;
    private String[] functionList = SensorList.functionList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);

        dataText = (TextView)findViewById(R.id.data_text);
        listText = (TextView)findViewById(R.id.list_text);

        dataSpinner = (Spinner) findViewById(R.id.data_spinner);
        dataSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //TODO:spinnerをいじるとセンサーが切り替わる
                //dataText.setText((String) dataSpinner.getSelectedItem());
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        findViewById(R.id.button_list).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                showList();
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_UI);
        showList();
    }
    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        dataText.setText(
                String.valueOf(event.values[0]) +"\n"+ String.valueOf(event.values[1]) +"\n"+
                        String.valueOf(event.values[2]) +"\n"
        );
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    private void showList(){
        // 表示の切り替え
        if(showDeviceFlag){
            // 端末で使用できるセンサーを表示
            checkDeviceName();
        }
        else{
            // センサーリストから使用可能かどうかの表示
            checkFunction();
        }
        showDeviceFlag=!showDeviceFlag;
    }

    private void checkDeviceName(){
        List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        String strTmp = "";
        int count = 0;
        for(Sensor sensor : sensors) {
            count++;
            strTmp += String.valueOf(count)+": "+ sensor.getName() + "\n";
        }

        listText.setText(strTmp);
    }

    private void checkFunction(){
        String strTmp = "";
        for(int i=0; i < functionList.length; i++){
            Sensor sensor = sensorManager.getDefaultSensor(sensorID[i]);

            if(sensor !=null){
                strTmp += String.valueOf(i+1)+": "+ functionList[i] + ": 使用可能\n";
            }
            else{
                strTmp += String.valueOf(i+1)+": "+ functionList[i] + ": X\n";
            }
        }
        listText.setText(strTmp);
    }
}