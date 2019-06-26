package com.example.qiaolulu.qiaofragment.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qiaolulu.qiaofragment.R;

/**
 * @author:qiaolulu
 * @date:2019/06/26
 * @function:fragment子界面
 */
public class FirstPage extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.firstpage,null);
        return view;
    }
}
