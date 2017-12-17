package com.example.dressassistant.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

import com.example.dressassistant.database.table.PersInfo;

/**
 * Created by lyh on 2017-12-17.
 */


public class DataBaseHelper extends SQLiteOpenHelper {
    /**
     *构造方法，创建数据库
     * @param context
     * @param name 数据库名称
     * @param  factory 游标类
     * @param version 数据库版本
     */
    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory,int version)
    {
        super(context,name,factory,version);
    }
    /**
     * 创建接口
     * 实现各表的创建
     */
    public static interface TableCreateInterface{

        public void onCreate(SQLiteDatabase db);

        public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion);
    }
    public void onCreate(SQLiteDatabase db){
        //创建个人信息表
        PersInfo.getInstance().onCreate(db);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        if( oldVersion >= newVersion ){
            return;
        }
        //更新个人信息表
        PersInfo.getInstance().onUpgrade(db,oldVersion,newVersion);
    }
}
