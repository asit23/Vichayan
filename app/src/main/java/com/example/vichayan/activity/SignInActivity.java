package com.example.vichayan.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.example.vichayan.APIModel.User;
import com.example.vichayan.APIModel.UserModel;
import com.example.vichayan.Login.ForgotPasswordBottomSheet;
import com.example.vichayan.Prefernces.PreferncesUtlis;
import com.example.vichayan.R;
import com.example.vichayan.retrofit.API;
import com.example.vichayan.retrofit.RetrofitClient;
import com.thekhaeng.pushdownanim.PushDownAnim;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignInActivity extends AppCompatActivity {

    private API api;
    private ImageView backfromlogin;
    private TextView forgotpasswprd;
    /* access modifiers changed from: private */
    public Button loginSignIn;
    private AwesomeValidation loginawesomevalidation;
    private EditText logincontact;
    private EditText loginpassword;
    /* access modifiers changed from: private */
    public ProgressBar signinbar;
    private TextView signupagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        init();
        clickers();
        AwesomeValidation awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        loginawesomevalidation = awesomeValidation;
        awesomeValidation.addValidation(this, R.id.contactedittext, Patterns.PHONE, R.string.errorcontact);
        api = RetrofitClient.getRetrofit().create(API.class);
    }

    private void clickers() {
        PushDownAnim.setPushDownAnimTo(this.loginSignIn, this.signupagain, this.backfromlogin, this.forgotpasswprd).setScale(PushDownAnim.MODE_SCALE, 0.97f).setDurationPush(50).setDurationRelease(125).setInterpolatorPush(PushDownAnim.DEFAULT_INTERPOLATOR).setInterpolatorRelease(PushDownAnim.DEFAULT_INTERPOLATOR).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.Signinuser /*2131361808*/:
                        SignInActivity.this.validatesignINUser();
                        return;
                    case R.id.backtointro /*2131361899*/:
                        SignInActivity.this.startActivity(new Intent(SignInActivity.this, LoginPageActivity.class));
                        SignInActivity.this.clearSignINCache();
                        finish();
                        return;
                    case R.id.forgotpass /*2131362040*/:
                        new ForgotPasswordBottomSheet().show(SignInActivity.this.getSupportFragmentManager(), "forgot_password");
                        return;
                    case R.id.signupagain /*2131362295*/:
                         SignInActivity.this.startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
                        SignInActivity.this.clearSignINCache();
                        finish();
                        return;
                    default:
                        return;
                }
            }
        });
    }

    private void init() {
        this.logincontact = (EditText) findViewById(R.id.contactedittext);
        this.loginpassword = (EditText) findViewById(R.id.passwordedittext);
        this.backfromlogin = (ImageView) findViewById(R.id.backtointro);
        this.forgotpasswprd = (TextView) findViewById(R.id.forgotpass);
        this.signupagain = (TextView) findViewById(R.id.signupagain);
        this.loginSignIn = (Button) findViewById(R.id.Signinuser);
        this.signinbar = (ProgressBar) findViewById(R.id.signinProgree);
        this.forgotpasswprd.setVisibility(View.VISIBLE);
    }

    /* access modifiers changed from: private */
    public void clearSignINCache() {
        this.logincontact.setText("");
        this.loginpassword.setText("");
    }

    /* access modifiers changed from: private */
    public void validatesignINUser() {
        if (!this.loginawesomevalidation.validate()) {
            Toast.makeText(this, "Enter credentials properly", Toast.LENGTH_LONG).show();
        } else if (TextUtils.isEmpty(this.loginpassword.getText().toString())) {
            Toast.makeText(this, (CharSequence) "Enter the Password", Toast.LENGTH_LONG).show();
            this.loginpassword.setFocusable(true);
        } else {
            signINandAuthenticateUser();
        }
    }

    private void signINandAuthenticateUser() {
        loginSignIn.setVisibility(View.INVISIBLE);
        signinbar.setVisibility(View.VISIBLE);
        api.Login(new UserModel(this.loginpassword.getText().toString().trim(), this.logincontact.getText().toString().trim())).enqueue(new Callback<UserModel>() {
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                if (response.isSuccessful()) {
                    PreferncesUtlis.saveToken(response.body().getToken(), SignInActivity.this.getApplicationContext());
                    SignInActivity.this.getUserData(response.body().getToken());
                    return;
                }
                Toast.makeText(SignInActivity.this, "Error Occured !try again\nCode: " + response.code(), Toast.LENGTH_SHORT).show();
                SignInActivity.this.loginSignIn.setVisibility(View.VISIBLE);
                SignInActivity.this.signinbar.setVisibility(View.INVISIBLE);
            }

            public void onFailure(Call<UserModel> call, Throwable t) {
                SignInActivity.this.loginSignIn.setVisibility(View.VISIBLE);
                SignInActivity.this.signinbar.setVisibility(View.INVISIBLE);
                Log.d("error Login", t.toString());
                Toast.makeText(SignInActivity.this, (CharSequence) "Something went Wrong" + t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    /* access modifiers changed from: private */
    public void getUserData(String token) {
        this.api.getUserData("Bearer " + token).enqueue(new Callback<User>() {
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()) {
                    User user = response.body();
                    PreferncesUtlis.saveName(user.getFirstname() + " " + user.getLastname(), SignInActivity.this.getApplicationContext());
                    if (PreferncesUtlis.getPicUrl(SignInActivity.this.getApplicationContext()) == null) {
                        PreferncesUtlis.savePictureURl(user.getActiveProfileImage(), SignInActivity.this.getApplicationContext());
                    }
                    SignInActivity.this.clearSignINCache();
                    SignInActivity.this.loginSignIn.setVisibility(View.VISIBLE);
                    SignInActivity.this.signinbar.setVisibility(View.INVISIBLE);
                    // SignInActivity.this.startActivity(new Intent(SignInActivity.this, HomePage.class));
                    return;
                }
                Toast.makeText(SignInActivity.this, "Invalid Phone Number or password !\nError " + response.code(), Toast.LENGTH_SHORT).show();
                SignInActivity.this.loginSignIn.setVisibility(View.VISIBLE);
                SignInActivity.this.signinbar.setVisibility(View.INVISIBLE);
            }

            public void onFailure(Call<User> call, Throwable t) {
                Log.d("error user", t.toString());
                Toast.makeText(SignInActivity.this, "Some Error Occured" + t.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}