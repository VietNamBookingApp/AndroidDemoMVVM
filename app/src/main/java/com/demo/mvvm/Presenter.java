package com.demo.mvvm;

import android.util.Log;
import android.view.View;

import androidx.appcompat.widget.AppCompatTextView;

public class Presenter {

    View mContainer;
    public Presenter(View container) {
        mContainer  = container;
    }

    public void saveUser(View view, User user) {
//        AppCompatTextView txtTitle = mContainer.findViewById(R.id.txtTitle);
//        txtTitle.setText("Make Some Noise !!!!!");

        user.setEmail("Make Some Noise !!!!!");

//        Log.d("saveUser", user.getEmail());
    }
}
