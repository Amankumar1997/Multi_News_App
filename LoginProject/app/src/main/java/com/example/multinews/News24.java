package com.example.multinews;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class News24 extends AppCompatActivity {
WebView webView;
ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news24);
        webView=findViewById(R.id.webview);
        pd=new ProgressDialog(this);
        pd.setMessage("News24 Loading ");
        WebSettings ws=webView.getSettings();
        ws.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient()
        {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                pd.show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                pd.dismiss();
            }
        });



        webView.loadUrl("https://www.zee5.com/channels/details/news24/0-9-206?utm_source=GoogleSearch&utm_medium=mark_cpc&utm_campaign=Mark_CPC-GoogleSearch-India-AVOD_EquinoxIndia-All-Perf-Hindi_News-all-brand-em-oct-video_view&utm_content=hindi-news-live_tv-news24-em&utm_term=news24%20live&dekey=Z5G016&keyword=news24%20live&matchtype=e.&gclid=CjwKCAiAz4b_BRBbEiwA5XlVVop58f_NtKN_7rxstm1jaipbct-j3-DeL55r3HI_UO5mSF3q5wSj0BoCo0QQAvD_BwE");


    }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}