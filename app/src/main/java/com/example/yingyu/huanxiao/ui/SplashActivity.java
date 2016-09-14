package com.example.yingyu.huanxiao.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.yingyu.huanxiao.R;
import com.example.yingyu.huanxiao.utils.PrefUtils;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        jump();
    }
    private void jump() {
        boolean userGuide = PrefUtils.getBoolean(this, "is_user_guide_showed",
                false);
        if (!userGuide) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(SplashActivity.this, GuideActivity.class));
                    finish();
                }
            },1500);

        } else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                    finish();
                }
            },1500);
        }
    }
}