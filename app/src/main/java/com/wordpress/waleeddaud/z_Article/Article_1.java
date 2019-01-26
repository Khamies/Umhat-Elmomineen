package com.wordpress.waleeddaud.z_Article;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import com.wordpress.waleeddaud.R;

public class Article_1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_1);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Bundle bundle=getIntent().getExtras();
        int selector=bundle.getInt("selector");
        String introduction_1=bundle.getString("khadija");
        /////////////////////////////////////////
        String introduction_2=bundle.getString("sawda");
        String introduction_3=bundle.getString("Isha");
        String introduction_4=bundle.getString("Hafsa");
        String introduction_5=bundle.getString("Zainab_1");
        String introduction_6=bundle.getString("Umsalama");
        String introduction_7=bundle.getString("Zainab_2");
        String introduction_8=bundle.getString("Gawiria");
        String introduction_9=bundle.getString("Safiia");
        String introduction_10=bundle.getString("Rammla");
        String introduction_11=bundle.getString("Mimona");




        switch (selector){
            case 1:
            TextView textView=(TextView)findViewById(R.id.introduction);
            textView.setText(introduction_1);
                Typeface face=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView.setTypeface(face);
                break;
            case  2:
                TextView textView2=(TextView)findViewById(R.id.introduction);
                textView2.setText(introduction_2);
                Typeface face2=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView2.setTypeface(face2);
                break;
            case 3:
                TextView textView3=(TextView)findViewById(R.id.introduction);
                textView3.setText(introduction_3);
                Typeface face3=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView3.setTypeface(face3);
                break;
            case 4:
                TextView textView4=(TextView)findViewById(R.id.introduction);
                textView4.setText(introduction_4);
                Typeface face4=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView4.setTypeface(face4);
                break;
            case 5:
                TextView textView5=(TextView)findViewById(R.id.introduction);
                textView5.setText(introduction_5);
                Typeface face5=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView5.setTypeface(face5);
                break;
            case 6:
                TextView textView6=(TextView)findViewById(R.id.introduction);
                textView6.setText(introduction_6);
                Typeface face6=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView6.setTypeface(face6);
                break;
            case 7:
                TextView textView7=(TextView)findViewById(R.id.introduction);
                textView7.setText(introduction_7);
                Typeface face7=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView7.setTypeface(face7);
                break;
            case 8:
                TextView textView8=(TextView)findViewById(R.id.introduction);
                textView8.setText(introduction_8);
                Typeface face8=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView8.setTypeface(face8);
                break;
            case 9:
                TextView textView9=(TextView)findViewById(R.id.introduction);
                textView9.setText(introduction_9);
                Typeface face9=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView9.setTypeface(face9);
                break;
            case 10:
                TextView textView10=(TextView)findViewById(R.id.introduction);
                textView10.setText(introduction_10);
                Typeface face10=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView10.setTypeface(face10);
                break;
            case 11:
                TextView textView11=(TextView)findViewById(R.id.introduction);
                textView11.setText(introduction_11);
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
