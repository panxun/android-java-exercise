package com.panxun.artauto;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Toast.makeText(MainActivity.this,"测试",0).show();
		AlertDialog.Builder tc=new AlertDialog.Builder(MainActivity.this);
		tc.setTitle("标题");
		tc.setMessage("内容");
		tc.setPositiveButton("确定",null);
		tc.show();
	
    }
	public boolean ceshi(Context c)
	{
		return false;
	}
	
}
