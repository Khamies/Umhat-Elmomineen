package com.wordpress.waleeddaud.Chapter_one;

import android.app.ActivityOptions;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.WindowManager;
import android.widget.TextView;

import com.wordpress.waleeddaud.R;
import com.wordpress.waleeddaud.Umahat.Eight;
import com.wordpress.waleeddaud.Umahat.Eleven;
import com.wordpress.waleeddaud.Umahat.Five;
import com.wordpress.waleeddaud.Umahat.Four;
import com.wordpress.waleeddaud.Umahat.Nine;
import com.wordpress.waleeddaud.Umahat.One;
import com.wordpress.waleeddaud.Umahat.Seven;
import com.wordpress.waleeddaud.Umahat.Six;
import com.wordpress.waleeddaud.Umahat.Ten;
import com.wordpress.waleeddaud.Umahat.Three;
import com.wordpress.waleeddaud.Umahat.Two;
import com.wordpress.waleeddaud.z_Conculsion.Caller;

import java.util.ArrayList;
import java.util.Calendar;


public class Begining extends ActionBarActivity {


       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begining);
        ////////////////////////////////////////////////
           this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

           Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                Intent intent=new Intent(Begining.this,Mothers.class);
                Bundle transition = ActivityOptions.makeCustomAnimation(Begining.this, R.animator.slide_in_top
                        , R.animator.slide_out_top).toBundle();

                startActivity(intent, transition);
            }
        }, 2000);



    }


    public  void alarm()
    {

        Intent intent=new Intent(this, Caller.class);
        PendingIntent pend=PendingIntent.getBroadcast(this,0,intent,0);
        AlarmManager alarmManager=(AlarmManager) getSystemService(ALARM_SERVICE);
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK,Calendar.FRIDAY);
        calendar.set(Calendar.HOUR_OF_DAY,17);
        calendar.set(Calendar.MINUTE,0);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY*7, pend);

    }


    @Override
    protected void onStart(){
        super.onStart();
        String MY_PREFERENCES = "my_preferences";
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean previouslyStarted = prefs.getBoolean(MY_PREFERENCES, false);
        if(!previouslyStarted) {
            SharedPreferences.Editor edit = prefs.edit();
            edit.putBoolean(MY_PREFERENCES, Boolean.TRUE);
            edit.apply();
            alarm();
        }

    }
}
