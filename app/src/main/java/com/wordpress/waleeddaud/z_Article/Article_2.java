package com.wordpress.waleeddaud.z_Article;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import com.wordpress.waleeddaud.R;

public class Article_2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_2);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Bundle bundle=getIntent().getExtras();
        int selector=bundle.getInt("selector");
        String Before_mirage_1=bundle.getString("khadija");
        /////////////////////////////////////////
        String Before_mirage_2=bundle.getString("sawda");
        String Before_mirage_3=bundle.getString("Isha");
        String Before_mirage_4=bundle.getString("Hafsa");
        String Before_mirage_5=bundle.getString("Zainab_1");
        String Before_mirage_6=bundle.getString("Umsalama");
        String Before_mirage_7=bundle.getString("Zainab_2");
        String Before_mirage_8=bundle.getString("Gawiria");
        String Before_mirage_9=bundle.getString("Safiia");
        String Before_mirage_10=bundle.getString("Rammla");
        String Before_mirage_11=bundle.getString("Mimona");

        switch (selector){
            case 1:
                TextView textView=(TextView)findViewById(R.id.introduction_2);
                textView.setText(Before_mirage_1);
                Typeface face=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView.setTypeface(face);
                break;
            case  2:
                TextView textView2=(TextView)findViewById(R.id.introduction_2);
                textView2.setText(Before_mirage_2);
                Typeface face2=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView2.setTypeface(face2);
                break;
            case 3:
                TextView textView3=(TextView)findViewById(R.id.introduction_2);
                textView3.setText(Before_mirage_3);
                Typeface face3=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView3.setTypeface(face3);
                break;
            case 4:
                TextView textView4=(TextView)findViewById(R.id.introduction_2);
                textView4.setText(Before_mirage_4);
                Typeface face4=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView4.setTypeface(face4);
                break;
            case 5:
                TextView textView5=(TextView)findViewById(R.id.introduction_2);
                textView5.setText(Before_mirage_5);
                Typeface face5=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView5.setTypeface(face5);
                break;
            case 6:
                TextView textView6=(TextView)findViewById(R.id.introduction_2);
                textView6.setText(Before_mirage_6);
                Typeface face6=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView6.setTypeface(face6);
                break;
            case 7:
                TextView textView7=(TextView)findViewById(R.id.introduction_2);
                textView7.setText(Before_mirage_7);
                Typeface face7=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView7.setTypeface(face7);
                break;
            case 8:
                TextView textView8=(TextView)findViewById(R.id.introduction_2);
                textView8.setText(Before_mirage_8);
                Typeface face8=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView8.setTypeface(face8);
                break;
            case 9:
                TextView textView9=(TextView)findViewById(R.id.introduction_2);
                textView9.setText(Before_mirage_9);
                Typeface face9=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView9.setTypeface(face9);
                break;
            case 10:
                TextView textView10=(TextView)findViewById(R.id.introduction_2);
                textView10.setText(Before_mirage_10);
                Typeface face10=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView10.setTypeface(face10);
                break;
            case 11:
                TextView textView11=(TextView)findViewById(R.id.introduction_2);
                textView11.setText(Before_mirage_11);
                Typeface face11=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView11.setTypeface(face11);
                break;
        }
    }


    @Override
    public void finish() {
        super.finish();

        overridePendingTransition(R.animator.slide_in_right,R.animator.slide_out_right);
    }



}
