package com.cw.pratnelv.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.cw.pratnelv.R;
import com.cw.pratnelv.ui.MainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    private Context context;
    @BindView(R.id.iv_info)
    ImageView ivInfo;
    @BindView(R.id.tv_register)
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initInfo();
    }

    private void initInfo() {
        context = LoginActivity.this;
        ButterKnife.bind(this);
    }

    @OnClick(R.id.iv_info)
    void info() {
        startActivity(new Intent(context, InfoActivity.class));
    }

    @OnClick(R.id.tv_register)
    void gotoregister() {
        startActivity(new Intent(context, RegisterActivity.class));
    }

    @OnClick(R.id.tv_forgot_password)
    void resetpage() {
        startActivity(new Intent(context, ResetPasswordActivity.class));
    }

    @OnClick(R.id.btn_login)
    void gotomain() {
        startActivity(new Intent(context, MainActivity.class));
    }
}