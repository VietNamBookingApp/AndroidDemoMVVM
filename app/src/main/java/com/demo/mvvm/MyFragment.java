package com.demo.mvvm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import com.demo.mvvm.databinding.LayoutMyfragmentBinding;

//public class MyFragment extends Fragment {
//
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//
//
//
//        View viewRoot = LayoutInflater.from(getContext()).inflate(R.layout.layout_myfragment, container, false);
//        LayoutMyfragmentBinding binding = LayoutMyfragmentBinding.bind(viewRoot);
//
//        binding.setHelloFragment("Fragment ne !!!!");
//
//        return binding.getRoot();
//    }
//}


@ActivityFragmentAnnoation(contentId = R.layout.layout_myfragment)
public class MyFragment extends  BaseFragment<LayoutMyfragmentBinding> {

    @Override
    protected void initFragmentImpl() {

    }
}
