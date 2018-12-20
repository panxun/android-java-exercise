package com.panxun.tuoke;

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
		Toast.makeText(getApplicationContext(),"小潘网络工作室",0).show();
    }
}
