package com.example.animationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button one,two,three;
    private View holderbg,dynamicbg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.button);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        holderbg = (View) findViewById(R.id.holderbg);
        dynamicbg = (View)findViewById(R.id.dynamicbg);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                two.animate().scaleX(1).setDuration(350).start();
                two.animate().scaleY(1).setDuration(350).start();
                three.animate().scaleX(1).setDuration(350).start();
                three.animate().scaleY(1).setDuration(350).start();
                one.animate().scaleX(1.2f).setDuration(800).start();
                one.animate().scaleY(1.2f).setDuration(800).start();
                dynamicbg.setBackgroundResource(R.drawable.holder_one);
                dynamicbg.animate().scaleY(3).setDuration(800).start();
                dynamicbg.animate().scaleX(3).setDuration(800).start();

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        holderbg.setScaleX(3);
                        holderbg.setScaleY(3);
                        holderbg.setBackgroundResource(R.drawable.holder_one);
                        dynamicbg.setScaleX(0);
                        dynamicbg.setScaleY(0);
                    }
                },850);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                two.animate().scaleX(1).setDuration(350).start();
                two.animate().scaleY(1).setDuration(350).start();
                one.animate().scaleX(1).setDuration(350).start();
                one.animate().scaleY(1).setDuration(350).start();
                dynamicbg.setBackgroundResource(R.drawable.holder_three);
                dynamicbg.animate().scaleY(3).setDuration(800).start();
                dynamicbg.animate().scaleX(3).setDuration(800).start();
                three.animate().scaleX(1.2f).setDuration(800).start();
                three.animate().scaleY(1.2f).setDuration(800).start();
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        holderbg.setScaleX(3);
                        holderbg.setScaleY(3);
                        holderbg.setBackgroundResource(R.drawable.holder_three);
                        dynamicbg.setScaleX(0);
                        dynamicbg.setScaleY(0);
                    }
                },850);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                one.animate().scaleX(1).setDuration(350).start();
                one.animate().scaleY(1).setDuration(350).start();
                three.animate().scaleX(1).setDuration(350).start();
                three.animate().scaleY(1).setDuration(350).start();
                dynamicbg.setBackgroundResource(R.drawable.holder_two);
                dynamicbg.animate().scaleY(3).setDuration(800).start();
                dynamicbg.animate().scaleX(3).setDuration(800).start();
                two.animate().scaleX(1.2f).setDuration(800).start();
                two.animate().scaleY(1.2f).setDuration(800).start();

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        holderbg.setScaleX(3);
                        holderbg.setScaleY(3);
                        holderbg.setBackgroundResource(R.drawable.holder_two);
                        dynamicbg.setScaleX(0);
                        dynamicbg.setScaleY(0);
                    }
                },850);
            }
        });
    }
}