package com.itwork.mvp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.itwork.mvp.R;
import com.itwork.mvp.login.view.LoginActivity;


/**
 * Created by yuanzhenxing on 2018/8/15
 *  启动页
 */

public class SplashActivity extends AppCompatActivity{

    //延迟时间
    private static final int SPLASH_DISPLAY_LENGTH = 2500;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
//        ImmersedStatusbarUtils.initStatusBar(this,null);
        setContentView(R.layout.activity_splash);

        initMain();
    }

    private void initMain() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_DISPLAY_LENGTH);
    }
}
