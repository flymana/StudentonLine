package com.wangxu.studentonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wangxu.studentonline.activity.TwoActivity;
import com.wangxu.studentonline.base.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    protected int intLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {


        Intent intent=new Intent(this,TwoActivity.class);
        startActivity(intent);


    }

    @Override
    protected void LoadData() {



    }
}
