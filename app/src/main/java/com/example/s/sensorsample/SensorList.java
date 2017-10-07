package com.example.s.sensorsample;

import android.hardware.Sensor;

public class SensorList {

    private SensorList(){}

    public static int sensorID[] = {
            //加速度センサー：三軸の加速度
            Sensor.TYPE_ACCELEROMETER,
            //周囲温度センサー：端末周辺の温度
            Sensor.TYPE_AMBIENT_TEMPERATURE,
            //
            Sensor.TYPE_DEVICE_PRIVATE_BASE,
            //回転ベクトルセンサー（地磁気を除く）：回転ベクトルセンサー．方位が不要なゲームに適する
            Sensor.TYPE_GAME_ROTATION_VECTOR,
            //地磁気回転ベクトルセンサー：地磁気センサーを使った回転ベクトルセンサー．屋外使用に適する
            Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR,
            //重力センサー：重力加速度の計測
            Sensor.TYPE_GRAVITY,
            //ジャイロセンサー：三軸の回転速度，角速度
            Sensor.TYPE_GYROSCOPE,
            //ジャイロセンサー（生データ）：ジャイロドリフトなどを補正しない生データ
            Sensor.TYPE_GYROSCOPE_UNCALIBRATED,
            //心拍検知
            Sensor.TYPE_HEART_BEAT,
            //心拍数：一分間の心拍数
            Sensor.TYPE_HEART_RATE,
            //照度センサー：周囲の明るさを計測
            Sensor.TYPE_LIGHT,
            //加速度センサー（重力除く）：三軸加速度から重力加速度を差し引いた値
            Sensor.TYPE_LINEAR_ACCELERATION,
            //地磁気センサー：三軸方向の磁気の強さを計測
            Sensor.TYPE_MAGNETIC_FIELD,
            //地磁気センサー（生データ）：キャリブレーション無しの地磁気生データ
            Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED,
            //動作継続検出：動きが5秒，10秒継続かどうか検出
            Sensor.TYPE_MOTION_DETECT,
            //傾きセンサー（非推奨）：端末の方位角と傾斜角と回転により傾きを検出
            Sensor.TYPE_ORIENTATION,
            //回転ベクトルセンサーをさらに拡張してきたもので，ARなどに使用を想定される
            Sensor.TYPE_POSE_6DOF,
            //気圧センサー：hPaを計測
            Sensor.TYPE_PRESSURE,
            //近接センサー：端末スクリーンとの距離，あるいは近い・遠い
            Sensor.TYPE_PROXIMITY,
            //相対湿度センサー：周囲の温度とともに周囲の湿度を計測
            Sensor.TYPE_RELATIVE_HUMIDITY,
            //回転ベクトルセンサー：傾き計測，傾きセンサーよりも精度が高い
            Sensor.TYPE_ROTATION_VECTOR,
            //動作検出センサー：静から動きを検出するウェイクアップセンサー
            Sensor.TYPE_SIGNIFICANT_MOTION,
            //歩行センサー：歩数をカウント
            Sensor.TYPE_STEP_COUNTER,
            //歩行センサー：歩行でトリガーがかかる
            Sensor.TYPE_STEP_DETECTOR,
            //温度センサー（非推奨）
            Sensor.TYPE_TEMPERATURE
    };

    public static String functionList[] = {
            "ACCELEROMETER",
            "AMBIENT_TEMPERATURE",
            "DEVICE_PRIVATE_BASE",
            "GAME_ROTATION_VECTOR",
            "GEOMAGNETIC_ROTATION_VECTOR",
            "GRAVITY",
            "GYROSCOPE",
            "GYROSCOPE_UNCALIBRATED",
            "HEART_BEAT",
            "HEART_RATE",
            "LIGHT",
            "LINEAR_ACCELERATION",
            "MAGNETIC_FIELD",
            "MAGNETIC_FIELD_UNCALIBRATED",
            "MOTION_DETECT",
            "ORIENTATION",
            "POSE_6DOF",
            "PRESSURE",
            "PROXIMITY",
            "RELATIVE_HUMIDITY",
            "ROTATION_VECTOR",
            "SIGNIFICANT_MOTION",
            "STEP_COUNTER",
            "STEP_DETECTOR",
            "TEMPERATURE"
    };
}
