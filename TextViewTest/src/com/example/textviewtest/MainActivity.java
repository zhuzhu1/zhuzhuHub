package com.example.textviewtest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {

	ToggleButton toggle;
	Switch switcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        toggle = (ToggleButton)findViewById(R.id.toggle);
        switcher = (Switch)findViewById(R.id.switcher);
        final LinearLayout test = (LinearLayout)findViewById(R.id.test);
        OnCheckedChangeListener listener = new OnCheckedChangeListener()
        {

			@Override
			public void onCheckedChanged(CompoundButton button, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked)
				{
					//设置LinearLayout垂直布局
					test.setOrientation(1);
				}
				else
				{
					//设置LinearLayout水平布局
					test.setOrientation(0);
				}
			}

        	
        };
        toggle.setOnCheckedChangeListener(listener);
        switcher.setOnCheckedChangeListener(listener);
        
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
