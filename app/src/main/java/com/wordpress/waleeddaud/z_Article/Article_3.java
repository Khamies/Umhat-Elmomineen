package com.wordpress.waleeddaud.z_Article;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.TextView;

import com.wordpress.waleeddaud.R;

public class Article_3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.article_3);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Bundle bundle=getIntent().getExtras();
        int selector=bundle.getInt("selector");
        String mirage_story_1=bundle.getString("khadija");
        /////////////////////////////////////////
        String mirage_story_2=bundle.getString("sawda");
        String mirage_story_3=bundle.getString("Isha");
        String mirage_story_4=bundle.getString("Hafsa");
        String mirage_story_5=bundle.getString("Zainab_1");
        String mirage_story_6=bundle.getString("Umsalama");
        String mirage_story_7=bundle.getString("Zainab_2");
        String mirage_story_8=bundle.getString("Gawiria");
        String mirage_story_9=bundle.getString("Safiia");
        String mirage_story_10=bundle.getString("Rammla");
        String mirage_story_11=bundle.getString("Mimona");

        switch (selector){
            case 1:
                TextView textView=(TextView)findViewById(R.id.mirage_story);
                textView.setText(mirage_story_1);
                Typeface face=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView.setTypeface(face);
                break;
            case  2:
                TextView textView2=(TextView)findViewById(R.id.mirage_story);
                textView2.setText(mirage_story_2);
                Typeface face2=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView2.setTypeface(face2);
                break;
            case 3:
                TextView textView3=(TextView)findViewById(R.id.mirage_story);
                textView3.setText(mirage_story_3);
                Typeface face3=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView3.setTypeface(face3);
                break;
            case 4:
                TextView textView4=(TextView)findViewById(R.id.mirage_story);
                textView4.setText(mirage_story_4);
                Typeface face4=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView4.setTypeface(face4);
                break;
            case 5:
                TextView textView5=(TextView)findViewById(R.id.mirage_story);
                textView5.setText(mirage_story_5);
                Typeface face5=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView5.setTypeface(face5);
                break;
            case 6:
                TextView textView6=(TextView)findViewById(R.id.mirage_story);
                textView6.setText(mirage_story_6);
                Typeface face6=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView6.setTypeface(face6);
                break;
            case 7:
                TextView textView7=(TextView)findViewById(R.id.mirage_story);
                textView7.setText(mirage_story_7);
                Typeface face7=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView7.setTypeface(face7);
                break;
            case 8:
                TextView textView8=(TextView)findViewById(R.id.mirage_story);
                textView8.setText(mirage_story_8);
                Typeface face8=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView8.setTypeface(face8);
                break;
            case 9:
                TextView textView9=(TextView)findViewById(R.id.mirage_story);
                textView9.setText(mirage_story_9);
                Typeface face9=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView9.setTypeface(face9);
                break;
            case 10:
                TextView textView10=(TextView)findViewById(R.id.mirage_story);
                textView10.setText(mirage_story_10);
                Typeface face10=Typeface.createFromAsset(getAssets(), "fonts/stc.otf");
                textView10.setTypeface(face10);
                break;
            case 11:
                TextView textView11=(TextView)findViewById(R.id.mirage_story);
                textView11.setText(mirage_story_11);
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
