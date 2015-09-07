package com.example.snake;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //去掉窗口标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //全屏显示
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        		WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.activity_main);
        DisplayMetrics metric = getResources().getDisplayMetrics();
        int width = metric.widthPixels;  // 屏幕宽度（像素）
        int col_len = width/15;
        int height = metric.heightPixels;  // 屏幕高度（像素）
        int row_len = height/25;
        GridLayout gridLayout = (GridLayout)findViewById(R.id.root);
        //gridLayout.setBackgroundColor(#999966);
        for(int i=0;i<25;i++)
        {
        	for(int j=0;j<15;j++)
        	{
	        	TextView tv = new TextView(this);
	        	//tv.setTextSize(15);
	        	//tv.setText(i+"");
	        	tv.setWidth(col_len);
	        	tv.setHeight(row_len);
	        	if(i == 0 || i == 24 || j == 0 || j == 14)
	        	{
	        		((View) tv).setBackgroundResource(R.drawable.bg_framestyle);
	        	}
	        	else
	        	{
	        		((View) tv).setBackgroundResource(R.drawable.bg_gridstyle);
	        	}
	        	
	        	GridLayout.Spec rowSpec = GridLayout.spec(i);
	        	GridLayout.Spec colSpec = GridLayout.spec(j);
	        	GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,colSpec);
	        	params.setGravity(Gravity.FILL);
	        	gridLayout.addView(tv,params);
        	}
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
