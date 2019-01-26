package com.wordpress.waleeddaud.z_Conculsion;

import android.graphics.Bitmap;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.wordpress.waleeddaud.R;

public class Nablsi_website extends ActionBarActivity {

    public WebView webView;
    public ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nablsi_website);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Bundle bundle=getIntent().getExtras();
        int selector=bundle.getInt("selector");
        String web_1=bundle.getString("khadija");
        /////////////////////////////////////////
        String web_2=bundle.getString("sawda");
        String web_3=bundle.getString("Isha");
        String web_4=bundle.getString("Hafsa");
        String web_5=bundle.getString("Zainab_1");
        String web_6=bundle.getString("Umsalama");
        String web_7=bundle.getString("Zainab_2");
        String web_8=bundle.getString("Gawiria");
        String web_9=bundle.getString("Safiia");
        String web_10=bundle.getString("Rammla");
        String web_11=bundle.getString("Mimona");
        String web_12=bundle.getString("Site1");
        String web_13=bundle.getString("Site2");
        String web_14=bundle.getString("Site3");




        switch (selector){
            case 1:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_1);

                break;
            case  2:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_2);
                break;
            case 3:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_3);
                break;
            case 4:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_4);
                break;
            case 5:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_5);
                break;
            case 6:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_6);
                break;
            case 7:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_7);
                break;
            case 8:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_8);
                break;
            case 9:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_9);
                break;
            case 10:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_10);
                break;
            case 11:
                webView=(WebView) findViewById(R.id.webViewOfAll);
                progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
                webView.setWebViewClient(new My_web());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setUseWideViewPort(true);
                webView.getSettings().setLoadWithOverviewMode(true);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setDisplayZoomControls(false);
                webView.loadUrl(web_11);
                break;


            case 12:

        webView=(WebView) findViewById(R.id.webViewOfAll);
        progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
        webView.setWebViewClient(new My_web());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.loadUrl(web_12);
                break;
            case 13:

        webView=(WebView) findViewById(R.id.webViewOfAll);
        progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
        webView.setWebViewClient(new My_web());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.loadUrl(web_13);
                break;
            case 14:
        webView=(WebView) findViewById(R.id.webViewOfAll);
        progressbar=(ProgressBar) findViewById(R.id.progressBarOfAll);
        webView.setWebViewClient(new My_web());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.loadUrl(web_14);
                break;
        }
    }


    public class My_web extends WebViewClient {


        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressbar.setVisibility(view.GONE);

        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);

        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }


    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public void finish() {
        super.finish();

        overridePendingTransition(R.animator.slide_in_right,R.animator.slide_out_right);
    }
}
