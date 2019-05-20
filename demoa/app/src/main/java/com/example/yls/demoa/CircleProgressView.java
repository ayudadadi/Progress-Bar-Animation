package com.example.yls.demoa;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yls on 2019/5/13.
 */

public class CircleProgressView extends View {
    private Paint paint = new Paint();
    private int progress =88;
    public CircleProgressView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint.setAntiAlias(true);
        paint.setDither(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        canvas.drawCircle(360,400,250,paint);

        paint.setStrokeWidth(15);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(110,150,610,650,270,
                360*progress/100,false,paint);

        paint.setColor(Color.BLUE);
        paint.setTextSize(50);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("运动消耗",250,300,paint);
        canvas.drawText(""+progress+"%",300,400,paint);
    }
    public void setProgress(int progress){
        this.progress = progress;
        invalidate();
    }
}




















