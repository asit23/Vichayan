package com.example.vichayan.activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.example.vichayan.R;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView loader;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.activity_main);
        this.loader = (LottieAnimationView) findViewById(R.id.loader);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                MainActivity.this.showLoadingAnimation();
            }
        }, 1000);
    }

    /* access modifiers changed from: private */
    public void showLoadingAnimation() {
        this.loader.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            public void run() {
             /*   if (PreferncesUtlis.getToken(MainActivity.this.getApplicationContext()) != null) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this, C1415HomePage.class).setFlags(268468224));
                    MainActivity.this.finish();
                    return;
                }*/
                MainActivity.this.startActivity(new Intent(MainActivity.this, LoginPageActivity.class));
                MainActivity.this.finish();
            }
        }, 1650);
    }
}
/*
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}*/
