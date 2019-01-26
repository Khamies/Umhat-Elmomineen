package com.wordpress.waleeddaud.z_Article;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import com.wordpress.waleeddaud.R;

public class Article_5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_5);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Bundle bundle=getIntent().getExtras();
        int selector=bundle.getInt("selector");
        String Die_1=bundle.getString("khadija");
        /////////////////////////////////////////
        String Die_2=bundle.getString("sawda");
        String Die_3=bundle.getString("Isha");
        String Die_4=bundle.getString("Hafsa");
        String Die_5=bundle.getString("Zainab_1");
        String Die_6=bundle.getString("Umsalama");
        String Die_7=bundle.getString("Zainab_2");
        String Die_8=bundle.getString("Gawiria");
        String Die_9=bundle.getString("Safiia");
        String Die_10=bundle.getString("Rammla");
        String Die_11=bundle.getString("Mimona");




        switch (selector){
            case 1:
                TextView textView=(TextView)findViewById(R.id.Dying);
                textView.setText(Die_1);
                Typeface face=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView.setTypeface(face);
                break;
            case  2:
                TextView textView2=(TextView)findViewById(R.id.Dying);
                textView2.setText(Die_2);
                Typeface face2=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView2.setTypeface(face2);
                break;
            case 3:
                TextView textView3=(TextView)findViewById(R.id.Dying);
                textView3.setText(Die_3);
                Typeface face3=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView3.setTypeface(face3);
                break;
            case 4:
                TextView textView4=(TextView)findViewById(R.id.Dying);
                textView4.setText(Die_4);
                Typeface face4=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView4.setTypeface(face4);
                break;
            case 5:
                TextView textView5=(TextView)findViewById(R.id.Dying);
                textView5.setText(Die_5);
                Typeface face5=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView5.setTypeface(face5);
                break;
            case 6:
                TextView textView6=(TextView)findViewById(R.id.Dying);
                textView6.setText(Die_6);
                Typeface face6=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView6.setTypeface(face6);
                break;
            case 7:
                TextView textView7=(TextView)findViewById(R.id.Dying);
                textView7.setText(Die_7);
                Typeface face7=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView7.setTypeface(face7);
                break;
            case 8:
                TextView textView8=(TextView)findViewById(R.id.Dying);
                textView8.setText(Die_8);
                Typeface face8=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView8.setTypeface(face8);
                break;
            case 9:
                TextView textView9=(TextView)findViewById(R.id.Dying);
                textView9.setText(Die_9);
                Typeface face9=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView9.setTypeface(face9);
                break;
            case 10:
                TextView textView10=(TextView)findViewById(R.id.Dying);
                textView10.setText(Die_10);
                Typeface face10=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView10.setTypeface(face10);
                break;
            case 11:
                TextView textView11=(TextView)findViewById(R.id.Dying);
                textView11.setText(Die_11);
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
