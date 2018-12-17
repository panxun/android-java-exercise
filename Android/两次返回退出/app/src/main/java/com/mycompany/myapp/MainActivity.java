package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.mycompany.myapp.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		// TODO: Implement this method
		if(keyCode==KeyEvent.KEYCODE_BACK)
		{
			//long fir=System.currentTimeMillis();
//			long waitTime = 2000;
//			long touchTime = 0;
//			if((System.currentTimeMillis()-touchTime)>=2000)
//			{
//				Toast.makeText(MainActivity.this,"再按一次退出",0).show();
//				touchTime=System.currentTimeMillis();
//			}
//			long firstTime=0;
//			if(System.currentTimeMillis()-firstTime>2000)
//				
//			{
//				firstTime=System.currentTimeMillis();
//			}
//			else
//			{
//				finish();
//			}
//			long currentTime = System.currentTimeMillis();
//			long waitTime=2000;
//			long touchTime=0;
//        if ((currentTime - touchTime) >= waitTime) {
//            //Toast.makeText(this, R.string.exit, Toast.LENGTH_SHORT).show();
//            touchTime = currentTime;
//        } else {
//            finish();
//        }
	long exitTime=0;
			
			if ((System.currentTimeMillis()-exitTime)>800)
			{
				Toast.makeText(MainActivity.this,"再一次退出",Toast.LENGTH_LONG).show();
				exitTime = System.currentTimeMillis();
			}
			else
			{
				finish();
				//关闭java虚拟机

				System.exit(0);
			}
			
	}
		return false;
	}
	
}
