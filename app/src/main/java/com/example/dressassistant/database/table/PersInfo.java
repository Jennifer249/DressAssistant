package com.example.dressassistant.database.table;

import android.database.sqlite.SQLiteDatabase;

import com.example.dressassistant.database.DataBaseHelper;

/**
 * Created by lyh on 2017-12-17.
 */

public class PersInfo implements DataBaseHelper.TableCreateInterface{
    //表名
    public static String TABLENAME="PersInfo";

    //表的各域名
    public static String _id="_id";//_id是SQLite中自动生成的主键，用于标识唯一的记录，为了方便使用，此处定义对应字段名
    public static String PERS_USID="pers_UsID";
    public static String PERS_USNA="pers_UsNa";
    public static String PERS_PASSWORD="pers_Password";
    public static String PERS_PHONE="pers_Phone";
    public static String PERS_HEPI="pers_hepi";//头像图片
    public static String PERS_BIRTHDAY="pers_Birthday";
    public static String PERS_FILID="pers_FILID";//身材信息列表
    public static String PERS_FLID="pers_FLID";//足迹列表ID
    public static String PERS_FAID="pers_FaID";//收藏夹ID
    public static String PERS_CUID="pers_CUID";//被关注用户ID
    public static String PERS_PIID="pers_PIID";//计划ID
    public static String PERS_FEID="pers_FEID";//好友列表ID
    public static String PERS_GDUID="pers_GDUID";//评论点赞记录ID
    public static String PERS_MYME="pers_MyMe";//我的说说
    public static String PERS_CPLID="pers_CPLID";//关注的人列表ID
    public static String PERS_FCID="pers_FCID";//朋友圈ID

    //返回表的实例进行创建与更新
    private static PersInfo persInfo = new PersInfo();

    public static PersInfo getInstance(){
        return PersInfo.persInfo;
    }

    //创建数据表
    public void onCreate(SQLiteDatabase db){
        String sql="CREATE TABLE"
                +PersInfo.TABLENAME
                +"("
                +"_id integer primary key autoincrement,"
                +PersInfo.PERS_USID+"INTEGER,"
                +PersInfo.PERS_USNA+"TEXT,"
                +PersInfo.PERS_PASSWORD+"TEXT,"
                +PersInfo.PERS_PHONE+"TEXT,"
                +PersInfo.PERS_HEPI+"TEXT,"
                +PersInfo.PERS_BIRTHDAY+"TEXT,"
                +PersInfo.PERS_FILID+"INTEGER,"
                +PersInfo.PERS_FLID+"INTEGER,"
                +PersInfo.PERS_FAID+"INTEGER,"
                +PersInfo.PERS_CUID+"INTEGER,"
                +PersInfo.PERS_PIID+"INTEGER,"
                +PersInfo.PERS_FEID+"INTEGER,"
                +PersInfo.PERS_GDUID+"INTEGER,"
                +PersInfo.PERS_MYME+"TEXT,"
                +PersInfo.PERS_CPLID+"INTEGER,"
                +PersInfo.PERS_FCID+"INTEGER"
                +");";
        //执行创建语句
        db.execSQL(sql);
    }
    //更新数据表，当我们需要更新数据库或者升级应用程序时要对数据库进行更新判断
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        if(oldVersion < newVersion){
            String sql = "DROP TABLE IF EXISTS "+ PersInfo.TABLENAME;
            db.execSQL(sql);
            this.onCreate(db);
        }
    }
}
