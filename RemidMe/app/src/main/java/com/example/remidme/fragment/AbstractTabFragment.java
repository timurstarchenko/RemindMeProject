package com.example.remidme.fragment;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

public class AbstractTabFragment extends Fragment {
    protected View view;

    protected String title;
    protected Context context;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

