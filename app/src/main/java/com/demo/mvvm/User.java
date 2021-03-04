package com.demo.mvvm;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;
import androidx.databinding.library.baseAdapters.BR;

//public class User {
//
//    public ObservableField<String> email = new ObservableField<>();
//
//
//
//
//}

public class User extends BaseObservable {
    private String email;


    @Bindable
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }


}

