package com.wangxu.studentonline.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.wangxu.studentonline.R;
import com.wangxu.studentonline.base.BaseFragment;

/**
 * Created by dell on 2017/11/28.
 */

public class OneFragment extends BaseFragment{
    @Override
    protected int getLayoutId() {
        return R.layout.onefragment;
    }

    @Override
    protected void init(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerivew);

    }

    @Override
    protected void loadData() {

    }
}
