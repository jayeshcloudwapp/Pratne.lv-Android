package com.cw.pratnelv.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.cw.pratnelv.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class SetPasswordActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_password);
        initView();
    }

    private void initView() {
        context = SetPasswordActivity.this;
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_back})
    void click(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                onBackPressed();
                break;

        }
    }
}