package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import org.jsoup.*;
import com.liulishuo.filedownloader.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		//Jsoup js=new Jsoup();
		FileDownloader.setup(getApplicationContext());
		//BaseDownloadTask task=
		FileDownloader.getImpl().create("https://panxun.top/test.png").setPath("/storage/emulated/0/tse.png")
			.setListener(new FileDownloadListener(){

				@Override
				protected void pending(BaseDownloadTask p1, int p2, int p3)
				{
					// TODO: Implement this method
				}

				@Override
				protected void progress(BaseDownloadTask p1, int p2, int p3)
				{
					// TODO: Implement this method
				}

				@Override
				protected void completed(BaseDownloadTask p1)
				{
					// TODO: Implement this method
				
					Toast.makeText(MainActivity.this,"成功",0).show();
				}

				@Override
				protected void paused(BaseDownloadTask p1, int p2, int p3)
				{
					// TODO: Implement this method
				}

				@Override
				protected void error(BaseDownloadTask p1, Throwable p2)
				{
					// TODO: Implement this method
				}

				@Override
				protected void warn(BaseDownloadTask p1)
				{
					// TODO: Implement this method
				}
			});
    }
}
