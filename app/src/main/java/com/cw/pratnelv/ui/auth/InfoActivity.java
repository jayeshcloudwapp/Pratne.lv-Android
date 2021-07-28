package com.cw.pratnelv.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.cw.pratnelv.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class InfoActivity extends AppCompatActivity {

    private Context context;
    @BindView(R.id.iv_back)
    ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        initView();
    }

    private void initView() {
        context = InfoActivity.this;
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_back})
    void back() {
        onBackPressed();
    }
}