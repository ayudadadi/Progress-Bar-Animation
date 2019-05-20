package com.example.yls.demoa;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
/*    private MyView myView;*/
    private CircleProgressView circleProgressView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* myView = findViewById(R.id.myView);
        ValueAnimator valueAnimator= ValueAnimator.ofInt(100,500);
        valueAnimator.setDuration(5000);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int value = (int) valueAnimator.getAnimatedValue();
                myView.setCenter(value);
            }
        });
        valueAnimator.start();*/
       circleProgressView = findViewById(R.id.cp_progress);
       ValueAnimator valueAnimator = ValueAnimator.ofInt(0,25);
       valueAnimator.setDuration(2000);
       valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
           @Override
           public void onAnimationUpdate(ValueAnimator valueAnimator) {
               int value = (int) valueAnimator.getAnimatedValue();
               circleProgressView.setProgress(value);
           }
       });
       valueAnimator.start();
    }
}
