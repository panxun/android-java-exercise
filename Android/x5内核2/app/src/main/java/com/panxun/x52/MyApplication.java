package com.panxun.x52;

import android.app.*;
import com.tencent.smtt.sdk.*;

public class MyApplication extends Application
{

	@Override
	public void onCreate()
	{
		// TODO: Implement this method
		super.onCreate();
		QbSdk.PreInitCallback cb=new QbSdk.PreInitCallback(){

			@Override
			public void onCoreInitFinished()
			{
				// TODO: Implement this method
			}

			@Override
			public void onViewInitFinished(boolean p1)
			{
				// TODO: Implement this method
			}
		};
		
		QbSdk.initX5Environment(getApplicationContext(),cb);
		
	}
	
}
