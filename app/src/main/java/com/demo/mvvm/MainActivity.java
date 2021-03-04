package com.demo.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.demo.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    AppCompatTextView mTxtTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        mTxtTitle = findViewById(R.id.txtTitle);

        User user = new User();

        user.setEmail("Alibaba");

        activityMainBinding.setUser(user);

        LinearLayoutCompat container = findViewById(R.id.container);
        Presenter presenter = new Presenter(container);

        //activityMainBinding.setPresenterMainActivity(this);

        activityMainBinding.setPresenter(presenter);

//
//        FragmentTransaction  fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.add(R.id.container, new MyFragment());
//        fragmentTransaction.commit();


    }


    public void saveUser(View view, User user) {
        mTxtTitle.setText("Ronaldo !!!");
       // Log.d("saveUser", user.getEmail());
    }
}