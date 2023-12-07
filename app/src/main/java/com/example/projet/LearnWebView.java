package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.webkit.WebViewClient;

public class LearnWebView extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_web_view);

        Bundle bundle = getIntent().getExtras();
        String page = bundle.getString("page");

        WebView webView = findViewById(R. id.webview);

        if (page.equals("lists")) {
            webView.loadUrl("https://www.w3schools.com/python/python_lists.asp");
        }else if(page.equals("forLoop")) {
            webView.loadUrl("https://www.w3schools.com/python/python_for_loops.asp");
        }else if(page.equals("arrays")) {
            webView.loadUrl("https://www.w3schools.com/python/python_arrays.asp");
        }else if(page.equals("functions")) {
            webView.loadUrl("https://www.w3schools.com/python/python_functions.asp");
        }

        Button returnBtn = (Button) findViewById(R.id.returnBtn);
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), learn.class));
            }
        });
    }
}