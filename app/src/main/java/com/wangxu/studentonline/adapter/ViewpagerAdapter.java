package com.wangxu.studentonline.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.List;

/**
 * Created by dell on 2017/11/28.
 */

public class ViewpagerAdapter extends FragmentPagerAdapter{
    private List<String> list;
    private List<Fragment> listfragment;

    public ViewpagerAdapter(FragmentManager fm, List<String> list, List<Fragment> listfragment) {
        super(fm);
        this.list = list;
        this.listfragment = listfragment;
    }

    @Override
    public Fragment getItem(int position) {
        return listfragment.get(position);
    }

    @Override
    public int getCount() {
        return listfragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
