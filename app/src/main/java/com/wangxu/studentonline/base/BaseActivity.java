package com.wangxu.studentonline.base;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.wangxu.studentonline.app.App;

/**
 * Created by dell on 2017/11/28.
 */

public abstract class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(intLayoutId());
        App.App=this;

        initData();

        LoadData();

    }

    protected abstract int  intLayoutId();

    protected abstract  void initData();

    protected abstract  void LoadData();
}
