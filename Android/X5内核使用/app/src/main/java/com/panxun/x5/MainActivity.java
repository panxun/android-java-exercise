package com.panxun.x5;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.tencent.smtt.sdk.*;

public class MainActivity extends Activity 
{
	X5WebView x5w,x5;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		X5WebView x5=(X5WebView) findViewById(R.id.maincom_panxun_x5_X5WebView);
		if(TbsVideo.canUseTbsPlayer(this))
		{
			//TbsVideo.openVideo(this,"http://api.51ckm.com/jx.php?url=https://v.qq.com/x/cover/0l53gsan0bh75pk.html");
			Toast.makeText(MainActivity.this,"可以",0).show();
		}
		x5w=new X5WebView(this,null);
		x5.loadUrl("https://baidu.com");
		//x5.loadUrl("http://api.51ckm.com/jx.php?url=https://v.qq.com/x/cover/0l53gsan0bh75pk.html");
    }
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK) {
			if (x5!= null && x5.canGoBack()) {
				x5.goBack();
				if (Integer.parseInt(android.os.Build.VERSION.SDK) >= 16)
					//changGoForwardButton(mWebView);
				return true;
			} else
				return super.onKeyDown(keyCode, event);
		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this method
		menu.add(1,1,1,"获取链接");
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// TODO: Implement this method
		if(item.getItemId()==1)
		{
			//x5.getUrl();
			Toast.makeText(MainActivity.this,x5.getUrl(),0).show();
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
