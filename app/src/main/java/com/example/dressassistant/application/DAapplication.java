package com.example.dressassistant.application;

import android.app.Application;

import com.example.dressassistant.database.DataBaseHelper;

/**
 * Created by lyh on 2017-12-17.
 */
//数据库的初始化
public class DAapplication extends Application {

    private DataBaseHelper databaseHelper;

    public void onCreate(){
        super.onCreate();
        this.databaseHelper = new DataBaseHelper(
          this.getApplicationContext(),
                "DressAssistant.db",
                null,
                1);
    }
}
