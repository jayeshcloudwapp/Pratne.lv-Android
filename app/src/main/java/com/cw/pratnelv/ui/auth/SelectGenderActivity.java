package com.cw.pratnelv.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.cw.pratnelv.R;
import com.cw.pratnelv.custom.UiUtils;
import com.google.android.material.card.MaterialCardView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SelectGenderActivity extends AppCompatActivity {

    private Context context;
    @BindView(R.id.iv_player)
    ImageView ivPlayer;
    @BindView(R.id.iv_player2)
    ImageView iv_player2;
    @BindView(R.id.materialCardView5)
    MaterialCardView materialCardView5;
    @BindView(R.id.materialCardView2)
    MaterialCardView materialCardView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekect_gender);
        initView();
    }

    private void initView() {
        context = SelectGenderActivity.this;
        ButterKnife.bind(this);
    }

    @OnClick({R.id.iv_player, R.id.iv_player2, R.id.iv_info, R.id.materialCardView2})
    void clickButton(View v) {
        switch (v.getId()) {
            case R.id.iv_player:
                viewVisibleInvisible();
                break;
            case R.id.iv_player2:
                viewVisibleInvisible();
                break;
            case R.id.iv_info:
                startActivity(new Intent(context, InfoActivity.class));
                break;
            case R.id.materialCardView2:
                startActivity(new Intent(context, LoginActivity.class));
                break;
        }
    }

    private void viewVisibleInvisible() {
        if (materialCardView5.getVisibility() == View.GONE) {
            UiUtils.animateFadeShow(context, materialCardView5);
        } else {
            UiUtils.animateFadeHide(context, materialCardView5);
        }
    }
}