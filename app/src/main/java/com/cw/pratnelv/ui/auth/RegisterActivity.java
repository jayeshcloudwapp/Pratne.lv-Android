package com.cw.pratnelv.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cw.pratnelv.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {

    private Context context;
    @BindView(R.id.iv_info)
    ImageView ivInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initView();

    }

    private void initView() {
        context = RegisterActivity.this;
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_info})
    void onclickbutton(View view) {
        startActivity(new Intent(context, InfoActivity.class));
    }
}