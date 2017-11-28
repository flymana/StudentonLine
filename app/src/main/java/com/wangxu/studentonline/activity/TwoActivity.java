package com.wangxu.studentonline.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.wangxu.studentonline.R;
import com.wangxu.studentonline.adapter.ViewpagerAdapter;
import com.wangxu.studentonline.base.BaseActivity;
import com.wangxu.studentonline.fragment.ForeFragment;
import com.wangxu.studentonline.fragment.OneFragment;
import com.wangxu.studentonline.fragment.ThreeFragment;
import com.wangxu.studentonline.fragment.TwoFragment;

import java.util.ArrayList;
import java.util.List;

public class TwoActivity extends BaseActivity {


    private TabLayout tablayout;
    private ViewPager viewpager;
    private List<String> list;
    private List<Fragment> listfragment;

    @Override
    protected int intLayoutId() {
        return R.layout.activity_two;

    }

    @Override
    protected void initData() {
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);


    }

    @Override
    protected void LoadData() {
        list = new ArrayList<>();
        listfragment = new ArrayList<>();
        list.add("头条");
        list.add("校园");
        list.add("就业");
        list.add("个人");
        listfragment.add(new OneFragment());
        listfragment.add(new TwoFragment());
        listfragment.add(new ThreeFragment());
        listfragment.add(new ForeFragment());
        ViewpagerAdapter adapter=new ViewpagerAdapter(getSupportFragmentManager(),list,listfragment);
        viewpager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewpager);



    }
}
