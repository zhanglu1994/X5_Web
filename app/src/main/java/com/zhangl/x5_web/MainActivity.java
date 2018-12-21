package com.zhangl.x5_web;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        webview = findViewById(R.id.webview);
        WebSettings settings = webview.getSettings();
        settings.setJavaScriptEnabled(true);// 表示支持js
        settings.setBuiltInZoomControls(false);// 显示放大缩小按钮
        settings.setGeolocationEnabled(true);       //地理位置
        settings.setUseWideViewPort(true);// 支持双击缩放
        settings.setAppCacheEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);//允许DCOM


        webview.setWebChromeClient(new WebChromeClient());

        webview.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView webView, String s) {
                return false;
            }
        });


        webview.loadUrl("http://soft.imtt.qq.com/browser/tes/feedback.html");

    }
}
