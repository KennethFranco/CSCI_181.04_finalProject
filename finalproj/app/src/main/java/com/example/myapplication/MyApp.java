package com.example.myapplication;

import android.app.Application;

import com.example.myapplication.shops.Products;

import io.realm.Realm;

public class MyApp extends Application {

    public void onCreate(){
        super.onCreate();
        Realm.init(this);


    }
}
