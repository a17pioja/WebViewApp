package com.example.brom.webviewapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    // Create a private member variable that can hold our WebView
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* This code is run when the App is created. Include code that creates your WebView */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // 1. Create a WebView element in the layout file content_main.xml
        // -- Commit and push to your github fork
        // 2. Give the WebView element created in step 1 ID "my_webview"
        // Enter your code that creates your WebView here...
            //webView = findViewById(R.id.my_webview);
        // -- Commit and push to your github fork
        // 3. Locate the WebView element created in step 1 using the ID created in step 2
        webView = (WebView) findViewById(R.id.my_webview);
        // 4. Create a new WebViewClient to attach to our WebView. This allows us to
        //    browse the web inside our app.
            //setContentView(webView);
        // -- Commit and push to your github fork
        // 5. Enter the url to load in our WebView
        webView.loadUrl("http://wwwlab.iit.his.se/a17pioja/Mobilapplikationsdesign/App%20Prototyp/html/lottery.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        
        if (id == R.id.action_settings) {
            webView.loadUrl("file:///android_asset/html/file.html");
            return true;
        }
        else if(id==R.id.action_ext_url) {
            webView.loadUrl("http://wwwlab.iit.his.se/a17pioja/Mobilapplikationsdesign/App%20Prototyp/html/lottery.html");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
