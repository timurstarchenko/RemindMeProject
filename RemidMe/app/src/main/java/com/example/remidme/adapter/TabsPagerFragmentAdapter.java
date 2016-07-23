package com.example.remidme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.remidme.R;
import com.example.remidme.fragment.AbstractTabFragment;
import com.example.remidme.fragment.BirthdayFragment;
import com.example.remidme.fragment.HistoryFragment;
import com.example.remidme.fragment.IdeasFragment;
import com.example.remidme.fragment.TODOFragment;

import java.util.HashMap;
import java.util.Map;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{
    private Map<Integer,AbstractTabFragment> tabs;
    private Context context;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TODOFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }
}
