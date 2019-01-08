package com.panxun.demo01;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		//Toast t=new Toast(getApplicationContext());
		//t.setText("test");
		//t.show();
		Toast.makeText(MainActivity.this,"测试状态栏是不是沉浸的",0).show();
		System.out.println("test");
		j
		
    }
}
