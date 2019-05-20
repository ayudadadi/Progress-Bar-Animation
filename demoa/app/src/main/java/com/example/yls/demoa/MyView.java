package com.example.yls.demoa;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yls on 2019/5/13.
 */

public class MyView extends View{
    private Paint paint = new Paint();
    private int center;
    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setDither(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(center,center,50,paint);
    }
    public void setCenter(int center){
        this.center = center;
        invalidate();
    }
}
