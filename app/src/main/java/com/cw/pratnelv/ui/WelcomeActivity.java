package com.cw.pratnelv.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cw.pratnelv.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WelcomeActivity extends AppCompatActivity {

     @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.btn_gender)
    MaterialButton btn_register;
    @BindView(R.id.tv_text1)
    MaterialTextView tvText1;
    private MyViewPagerAdapter myViewPagerAdapter;
    private int[] layouts;
    private Context context;
    TabLayout indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initView();
    }

    private void initView() {
        context = WelcomeActivity.this;
        ButterKnife.bind(this);

        layouts = new int[]{
                R.layout.welcome_slide1,
                R.layout.welcome_slide2,
                R.layout.welcome_slide3,
                R.layout.welcome_slide4};
        myViewPagerAdapter = new MyViewPagerAdapter();
        viewPager.setAdapter(myViewPagerAdapter);
        indicator = (TabLayout) findViewById(R.id.indicator);
        indicator.setupWithViewPager(viewPager, true);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);
        setMargin(0);
    }


    public void setMargin(int pos) {
        for (int i = 0; i < indicator.getTabCount(); i++) {
            View tab = ((ViewGroup) indicator.getChildAt(0)).getChildAt(i);
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) tab.getLayoutParams();
            p.setMargins(0, 0, 5, 0);
            if (pos != i) {
                p.width = 25;
            } else {
                p.width = 40;
            }
            tab.requestLayout();
        }
    }

    //  viewpager change listener
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            setMargin(position);

            switch (position) {
                case 0:
                    tvText1.setVisibility(View.VISIBLE);
                    btn_register.setVisibility(View.GONE);
                    break;
                case 1:
                    tvText1.setVisibility(View.VISIBLE);
                    btn_register.setVisibility(View.GONE);
                    break;
                case 2:
                    tvText1.setVisibility(View.VISIBLE);
                    btn_register.setVisibility(View.GONE);
                    break;
                case 3:
                    tvText1.setVisibility(View.GONE);
                    btn_register.setVisibility(View.VISIBLE);
                    break;
            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };


    @OnClick(R.id.btn_gender)
    void register() {
        // startActivity(new Intent(context, SelectGenderActivity.class));
        startActivity(new Intent(context, WebActivity.class));
        finish();
    }

    @OnClick(R.id.tv_text1)
    void skip() {
        // startActivity(new Intent(context, SelectGenderActivity.class));
        startActivity(new Intent(context, WebActivity.class));
        finish();
    }

    public class MyViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public MyViewPagerAdapter() {
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = layoutInflater.inflate(layouts[position], container, false);
            container.addView(view);
            return view;
        }


        @Override
        public int getCount() {
            return layouts.length;
        }


        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }

}