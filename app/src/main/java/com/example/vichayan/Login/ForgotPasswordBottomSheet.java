package com.example.vichayan.Login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.dpizarro.pinview.library.PinView;
import com.example.vichayan.R;
import com.example.vichayan.retrofit.API;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class ForgotPasswordBottomSheet extends BottomSheetDialogFragment {
    API api;
    private Button generate_otp;
    /* access modifiers changed from: private */
    public String otp;
    private EditText phone_number;
    private PinView pinView;
    private TextView resend_OTP;
    /* access modifiers changed from: private */
    public Button verify_otp;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.forgot_password_bottomsheet, container, false);
        this.phone_number = (EditText) view.findViewById(R.id.forgot_Phone);
        this.generate_otp = (Button) view.findViewById(R.id.generate_otp_Phone);
        this.verify_otp = (Button) view.findViewById(R.id.verify_Phone);
        this.pinView = (PinView) view.findViewById(R.id.pinview_Password);
        this.resend_OTP = (TextView) view.findViewById(R.id.resend_OTP);
        this.pinView.setOnCompleteListener(new PinView.OnCompleteListener() {
            public void onComplete(boolean completed, String pinResults) {
                if (completed) {
                    String unused = ForgotPasswordBottomSheet.this.otp = pinResults;
                    ForgotPasswordBottomSheet.this.verify_otp.setVisibility(View.VISIBLE);
                }
            }
        });
        this.resend_OTP.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ForgotPasswordBottomSheet.this.resendOTP();
            }
        });
        this.generate_otp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ForgotPasswordBottomSheet.this.genearteOTP();
            }
        });
        this.verify_otp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ForgotPasswordBottomSheet.this.verifyOTP();
            }
        });
        return view;
    }

    /* access modifiers changed from: private */
    public void verifyOTP() {
    }

    /* access modifiers changed from: private */
    public void genearteOTP() {
    }

    /* access modifiers changed from: private */
    public void resendOTP() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(STYLE_NORMAL, R.style.MyBottomSheetDialogTheme);
    }
}
