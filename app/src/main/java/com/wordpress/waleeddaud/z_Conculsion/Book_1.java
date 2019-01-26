package com.wordpress.waleeddaud.z_Conculsion;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;

import com.wordpress.waleeddaud.R;

public class Book_1 extends ActionBarActivity {
    WebView webView;
    ProgressBar progressbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_1);

        finish();
        Intent intent = new Intent(Book_1.this, Check_Connection.class);
        intent.putExtra("selector", 12);
        intent.putExtra("Site1", "https://drive.google.com/file/d/0B5Xo5KW4cZZNM2VCTldGOWxHUzA/view?usp=sharing");
        startActivity(intent);

    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }






}
