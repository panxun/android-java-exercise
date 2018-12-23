package com.panxun.webview;

import android.app.*;
import android.os.*;
import android.webkit.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends Activity 
{
	WebView wv;
	Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		wv=(WebView) findViewById(R.id.mainWebView1);
		bt=(Button) findViewById(R.id.mainButton1);
		wv.loadUrl("https://baidu.com");
		wv.setWebViewClient(new WebViewClient());
		bt.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					// TODO: Implement this method
					Toast.makeText(getApplicationContext(),wv.getUrl(),Toast.LENGTH_LONG).show();
				}
			});
    }
}
