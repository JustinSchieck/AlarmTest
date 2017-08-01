package com.example.justin.alarmclocktest;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Context context;
    int hour, min;
    int startId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onStartCommand(Intent intent, int startId) {
        Calendar cal = Calendar.getInstance();
        startId = 0;

        Lunchtime();
        dinnerTime();

    }

    public void dinnerTime(){
        Calendar cal = Calendar.getInstance();
        Intent activate = new Intent(context, Alarm.class);
        AlarmManager alarms ;
        PendingIntent alarmIntent = PendingIntent.getBroadcast(context, 0, activate, 0);
        hour = 6;
        min = 35;
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, min);
        cal.set(Calendar.SECOND, 00);
        cal.set(Calendar.AM_PM, Calendar.PM);
        alarms = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        if(startId == 0){
            alarms.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), alarmIntent);
        }else{
            Toast.makeText(getApplicationContext(), "I am already running!", Toast.LENGTH_SHORT).show();
        }
    }


    public void Lunchtime() {
        Calendar cal = Calendar.getInstance();
        Intent activate = new Intent(context, Alarm.class);
        AlarmManager alarms ;
        PendingIntent alarmIntent = PendingIntent.getBroadcast(context, 0, activate, 0);
        hour = 12;
        min = 01;
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, min);
        cal.set(Calendar.SECOND, 00);
        cal.set(Calendar.AM_PM, Calendar.PM);
        alarms = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        if(startId == 0){
            alarms.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), alarmIntent);
        }else{
            Toast.makeText(getApplicationContext(), "I am already running!", Toast.LENGTH_SHORT).show();
        }
    }

    public void Breakfesttime() {
        Calendar cal = Calendar.getInstance();
        Intent activate = new Intent(context, Alarm.class);
        AlarmManager alarms ;
        PendingIntent alarmIntent = PendingIntent.getBroadcast(context, 0, activate, 0);
        hour = 8;
        min = 01;
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, min);
        cal.set(Calendar.SECOND, 00);
        cal.set(Calendar.AM_PM, Calendar.PM);
        alarms = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        if(startId == 0){
            alarms.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), alarmIntent);
        }else{
            Toast.makeText(getApplicationContext(), "I am already running!", Toast.LENGTH_SHORT).show();
        }
    }
}
