package com.demo.mvvm;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

public abstract class BaseFragment<T extends ViewDataBinding> extends Fragment {

    private int contentId;
    protected Bundle bundle;
    protected Activity a;
    protected T binding;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (contentId == 0){
            bundle = getArguments();
            contentId = ActivityFragmentAnnoationManager.check(this);
            a = activity;
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (binding == null){
            binding = DataBindingUtil.inflate(inflater, contentId, container, false);
            initFragmentImpl();
        }
        return binding.getRoot();
    }

    protected abstract void initFragmentImpl();
}
