package com.example.vichayan.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.example.vichayan.APIModel.UserModel;
import com.example.vichayan.Prefernces.PreferncesUtlis;
import com.example.vichayan.R;
import com.example.vichayan.retrofit.API;
import com.example.vichayan.retrofit.RetrofitClient;
import com.thekhaeng.pushdownanim.PushDownAnim;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity {

    private EditText DOB;
    private API api;
    private AwesomeValidation awesomeValidation;
    private ImageView backfromregister;
    private EditText confirmpassword;
    private EditText contact;
    private EditText email;
    private EditText firstname;
    private EditText lastname;
    /* access modifiers changed from: private */
    public Calendar myCalendar;
    private EditText password;
    /* access modifiers changed from: private */
    public Button registerSignUP;
    private TextView signinagain;
    /* access modifiers changed from: private */
    public ProgressBar signupbar;

    /* access modifiers changed from: protected */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
        clickers();
        AwesomeValidation awesomeValidation2 = new AwesomeValidation(ValidationStyle.BASIC);
        this.awesomeValidation = awesomeValidation2;
        awesomeValidation2.addValidation(this, R.id.firstname, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",R.string.nameerror);
        this.awesomeValidation.addValidation(this,R.id.lastname, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
        this.awesomeValidation.addValidation(this,R.id.emailsignupedittext, Patterns.EMAIL_ADDRESS,R.string.emailerror);
        this.awesomeValidation.addValidation(this,R.id.contactsignupedittext, Patterns.PHONE,R.string.errorcontact);
        this.awesomeValidation.addValidation( this,R.id.passwordsignupedittext, "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])(?=.*[~`!@#\\$%\\^&\\*\\(\\)\\-_\\+=\\{\\}\\[\\]\\|\\;:\"<>,./\\?]).{8,}", R.string.password);
        this.awesomeValidation.addValidation( this,R.id.confirmpasswordtext, "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])(?=.*[~`!@#\\$%\\^&\\*\\(\\)\\-_\\+=\\{\\}\\[\\]\\|\\;:\"<>,./\\?]).{8,}", R.string.confirm_pasword);
        this.myCalendar = Calendar.getInstance();
        final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                SignUpActivity.this.myCalendar.set(1, year);
                SignUpActivity.this.myCalendar.set(2, monthOfYear);
                SignUpActivity.this.myCalendar.set(5, dayOfMonth);
                SignUpActivity.this.showCalendarPIcker();
            }
        };
        this.DOB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SignUpActivity signUpActivity = SignUpActivity.this;
                new DatePickerDialog(signUpActivity, date, signUpActivity.myCalendar.get(1), SignUpActivity.this.myCalendar.get(2), SignUpActivity.this.myCalendar.get(5)).show();
            }
        });
        this.api = (API) RetrofitClient.getRetrofit().create(API.class);
    }

    private void clickers() {
        PushDownAnim.setPushDownAnimTo(this.registerSignUP, this.signinagain, this.backfromregister, this.DOB).setScale(PushDownAnim.MODE_SCALE, 0.97f).setDurationPush(50).setDurationRelease(125).setInterpolatorPush(PushDownAnim.DEFAULT_INTERPOLATOR).setInterpolatorRelease(PushDownAnim.DEFAULT_INTERPOLATOR).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int id = view.getId();
                if (id == R.id.Signupuser) {
                    SignUpActivity.this.validateUserSignUp();
                } else if (id == R.id.backchal) {
                    SignUpActivity.this.startActivity(new Intent(SignUpActivity.this, LoginPageActivity.class));
                    finish();
                } else if (id == R.id.signinback) {
                    SignUpActivity.this.startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                    finish();
                }
            }
        });
    }

    private void init() {
        this.firstname = (EditText) findViewById(R.id.firstname);
        this.lastname = (EditText) findViewById(R.id.lastname);
        this.contact = (EditText) findViewById(R.id.contactsignupedittext);
        this.email = (EditText) findViewById(R.id.emailsignupedittext);
        this.password = (EditText) findViewById(R.id.passwordsignupedittext);
        this.confirmpassword = (EditText) findViewById(R.id.confirmpasswordtext);
        this.DOB = (EditText) findViewById(R.id.dobsignup);
        this.signupbar = (ProgressBar) findViewById(R.id.signupProgree);
        this.backfromregister = (ImageView) findViewById(R.id.backchal);
        this.signinagain = (TextView) findViewById(R.id.signinback);
        this.registerSignUP = (Button) findViewById(R.id.Signupuser);
    }

    /* access modifiers changed from: private */
    public void validateUserSignUp() {
        if (!this.awesomeValidation.validate()) {
            Toast.makeText(this,"Enter all fields properly", Toast.LENGTH_SHORT).show();
        } else {
            signUpandRegisterUser();
        }
    }

    private void signUpandRegisterUser() {
        this.registerSignUP.setVisibility(View.INVISIBLE);
        this.signupbar.setVisibility(View.VISIBLE);
        if (this.password.getText().toString().equals(this.confirmpassword.getText().toString())) {
            this.api.SignUp(new UserModel(this.firstname.getText().toString().trim(), this.lastname.getText().toString().trim(), this.password.getText().toString().trim(), this.confirmpassword.getText().toString().trim(), this.email.getText().toString().trim(), this.DOB.getText().toString().trim(), this.contact.getText().toString().trim())).enqueue(new Callback<UserModel>() {
                public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                    if (response.isSuccessful()) {
                        PreferncesUtlis.saveToken(response.body().getToken(), SignUpActivity.this.getApplicationContext());
                        SignUpActivity.this.clearSignUPCache();
                        SignUpActivity.this.startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
                        return;
                    }
                    Toast.makeText(SignUpActivity.this,"Email ID or Phone Number Already Registered \nTry Again with new Email or Phone ", Toast.LENGTH_LONG).show();
                    SignUpActivity.this.registerSignUP.setVisibility(View.VISIBLE);
                    SignUpActivity.this.signupbar.setVisibility(View.INVISIBLE);
                }

                public void onFailure(Call<UserModel> call, Throwable t) {
                    SignUpActivity.this.registerSignUP.setVisibility(View.VISIBLE);
                    SignUpActivity.this.signupbar.setVisibility(View.INVISIBLE);
                    Log.d("error SignUp", t.toString());
                    Toast.makeText(SignUpActivity.this, (CharSequence) "Something went Wrong" + t.toString(), Toast.LENGTH_SHORT).show();
                }
            });
            return;
        }
        this.registerSignUP.setVisibility(View.VISIBLE);
        this.signupbar.setVisibility(View.INVISIBLE);
        Toast.makeText(this, (CharSequence) "password doesn't match", Toast.LENGTH_SHORT).show();
        this.password.setFocusable(true);
    }

    /* access modifiers changed from: private */
    public void clearSignUPCache() {
        this.firstname.setText("");
        this.lastname.setText("");
        this.email.setText("");
        this.password.setText("");
        this.contact.setText("");
        this.DOB.setText("");
        this.confirmpassword.setText("");
    }

    /* access modifiers changed from: private */
    public void showCalendarPIcker() {
        this.DOB.setText(new SimpleDateFormat("dd/MM/yy").format(this.myCalendar.getTime()));
    }
}