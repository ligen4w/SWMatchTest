package com.lg.swmatchtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

import com.lg.swmatchtest.util.ScreenUtil;

public class MainActivity extends AppCompatActivity {

    private TextView tv_density, tv_screen_width, tv_screen_height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_density = (TextView) findViewById(R.id.tv_density);
        tv_screen_width = (TextView) findViewById(R.id.tv_screen_width);
        tv_screen_height = (TextView) findViewById(R.id.tv_small_width);

        int[] screenSize = ScreenUtil.getScreenSize(this);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float density = displayMetrics.density;
        tv_density.setText("像素密度：" + density);
        tv_screen_width.setText("屏幕宽度：" + screenSize[0]);
        tv_screen_height.setText("smallWidth = " + screenSize[0]/density);
    }
}
