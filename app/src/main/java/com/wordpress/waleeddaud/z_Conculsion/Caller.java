package com.wordpress.waleeddaud.z_Conculsion;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;

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

import java.util.ArrayList;

/**
 * Created by root on 15/10/15.
 */
public class Caller extends BroadcastReceiver {

     public static int conrol=0;
     public static  int control2=0;
    public static Class next_class=null;
     public ArrayList<Class<?>> Notificaton_Classes;
    public  ArrayList<String> texts;
    public static String message;


    @Override
    public void onReceive(Context context, Intent intent) {
        Notificaton_Classes=new ArrayList<>();
        Notificaton_Classes.add(One.class);
        Notificaton_Classes.add(Two.class);
        Notificaton_Classes.add(Three.class);
        Notificaton_Classes.add(Four.class);
        Notificaton_Classes.add(Five.class);
        Notificaton_Classes.add(Six.class);
        Notificaton_Classes.add(Seven.class);
        Notificaton_Classes.add(Eight.class);
        Notificaton_Classes.add(Nine.class);
        Notificaton_Classes.add(Ten.class);
        Notificaton_Classes.add(Eleven.class);

        texts=new ArrayList<>();
        texts.add("ماذا تعرف عن أمنا الحبيبة خديجة !");
        texts.add("ماذا تعرف عن أمنا الحبيبة سودة!");
        texts.add("ماذا تعرف عن أمنا الحبيبة عائشة!");
        texts.add("ماذا تعرف عن أمنا الحبيبة حفصة !");
        texts.add("ماذا تعرف عن أمنا الحبيبة زينب الخزيمية!");
        texts.add("ماذا تعرف عن أمنا الحبيبة أم سلمة !");
        texts.add("ماذا تعرف عن أمنا الحبيبة زينب بنت جحش !");
        texts.add("ماذا تعرف عن أمنا الحبيبة جويرية!");
        texts.add("ماذا تعرف عن أمنا الحبيبة صفية!");
        texts.add("ماذا تعرف عن أمنا الحبيبة رملة!");
        texts.add("ماذا تعرف عن أمنا الحبيبة ميمونة!");


        Class next=Controll_clasess();
        String message=Text();
        Intent intent1=new Intent(context,next);
        NotificationCompat.Builder build=new NotificationCompat.Builder(context);
        build.setSmallIcon(R.mipmap.notify);
        build.setContentTitle("أمهات المؤمنين");
        build.setTicker("ماذا تعرف عن أمنا الحبيبة");
        build.setContentText(message);
        build.setAutoCancel(true);
        build.setDefaults(Notification.DEFAULT_SOUND |Notification.DEFAULT_LIGHTS);

        TaskStackBuilder stackBuilder=TaskStackBuilder.create(context);
        stackBuilder.addParentStack(next);
        stackBuilder.addNextIntent(intent1);

        PendingIntent pend=stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        build.setContentIntent(pend);

        NotificationManager mynotify= (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mynotify.notify(12000,build.build());

        }


    public Class<?> Controll_clasess()
    {
        if (conrol==Notificaton_Classes.size()){
        conrol=0;}
        for (int i=conrol;i<Notificaton_Classes.size();i++){

            next_class=Notificaton_Classes.get(i);
            conrol++;
            break;
        }


        return next_class;
    }

    public  String Text()
    {
        if (control2==texts.size()){
            control2=0;}
        for (int i=control2;i<texts.size();i++){

            message=texts.get(i);
            control2++;
            break;
        }

        return message;}


}
