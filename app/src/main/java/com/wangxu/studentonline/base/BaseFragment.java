package com.wangxu.studentonline.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wangxu.studentonline.R;

/**
 * Created by dell on 2017/11/28.
 */

public abstract class BaseFragment extends Fragment{
    private Bundle bundle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), null);

        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init(view);
        loadData();
    }

    /**
     *
     * 用于加载Activity布局
     * @return
     */
    protected abstract int getLayoutId();
    /**
     * 统一管理数据的初始化
     */
    protected abstract void init(View view);

    /**
     * 统一做数据加载
     */
    protected abstract void loadData();


    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden){
            onHide();
        }{
            onShow();
        }


    }
    //隐藏方法
    protected void onHide(){};

    //显示方法
    protected void onShow(){};

    public Bundle getBundle() {
        return bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
