package com.panxun.x52;

import android.app.*;
import android.os.*;
import com.tencent.smtt.sdk.*;
import android.view.*;

public class MainActivity extends Activity 
{
	WebView x5w;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		//x5w=new X5WebView(this,null);
		x5w=(WebView) findViewById(R.id.mainWebView1);
		x5w.setWebViewClient(new WebViewClient());
		//x5w.loadUrl("https://ie.icoa.cn");
		//x5w.loadUrl("https://baidu.com");
		x5w.loadUrl("http://api.51ckm.com/jx.php?url=https://v.qq.com/x/cover/0l53gsan0bh75pk.html");
		//x5w.loadUrl("https://tool.lu/useragent");
		WebSettings wss=x5w.getSettings();
		wss.setSupportZoom(true);
    }

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		// TODO: Implement this method
		if(keyCode==KeyEvent.KEYCODE_BACK)
		{
			x5w.goBack();
		}
		return super.onKeyDown(keyCode, event);
	}
	
}
