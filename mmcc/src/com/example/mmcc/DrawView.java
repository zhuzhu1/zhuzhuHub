package com.example.mmcc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class DrawView extends View{

	public float currentX=40;
	public float currentY=50;
	
	public DrawView(Context context)
	{
		super(context);
	}
	public DrawView(Context context,AttributeSet set)
	{
		super(context,set);
	}
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Paint p = new Paint();
		p.setColor(Color.RED);
		canvas.drawCircle(currentX, currentY, 15, p);
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		currentX = event.getX();
		currentY = event.getY();
		invalidate();
		//return super.onTouchEvent(event);
		return true;//返回true表明该处理方法已经处理该事件。
					//若用上面的return，则不会跟随手指。
	}
	
}
