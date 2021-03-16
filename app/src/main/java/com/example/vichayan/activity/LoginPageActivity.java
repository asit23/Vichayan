package com.example.vichayan.activity;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.vichayan.R;
import com.thekhaeng.pushdownanim.PushDownAnim;


public class LoginPageActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;
    private Button infosignin;
    private Button infosignup;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        init();
        clickers();
    }

    private void init() {
        this.infosignin = (Button) findViewById(R.id.SignIN);
        this.infosignup = (Button) findViewById(R.id.Signup);
    }

    private void clickers() {
        PushDownAnim.setPushDownAnimTo(this.infosignin, this.infosignup).setScale(PushDownAnim.MODE_SCALE, 0.97f).setDurationPush(50).setDurationRelease(125).setInterpolatorPush(PushDownAnim.DEFAULT_INTERPOLATOR).setInterpolatorRelease(PushDownAnim.DEFAULT_INTERPOLATOR).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int id = view.getId();
                if (id == R.id.SignIN) {
                    LoginPageActivity.this.startActivity(new Intent(LoginPageActivity.this, SignInActivity.class));
                } else if (id == R.id.Signup) {
                    LoginPageActivity.this.startActivity(new Intent(LoginPageActivity.this, SignUpActivity.class));
                }
            }
        });
    }

    public void onBackPressed() {
        if (this.doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this,"Please click BACK again to exit", Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                LoginPageActivity.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}

