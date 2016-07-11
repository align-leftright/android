package org.weaver.alr.android.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sec on 2016-06-22.
 */
public class DBManager extends SQLiteOpenHelper{

    public static final int DATABASE_VERSION = 3;
    public static final String DATABASE_NAME = "notification.db";



    public DBManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Notification.Entry.TABLE_ELB + " ( " + Notification.Entry.COLUMN_NAME_ID
                    + " INTEGER PRIMARY KEY," + Notification.Entry.COLUMN_NAME_NOTIFICATION + " TEXT" + ")");

        db.execSQL("CREATE TABLE " + Notification.Entry.TABLE_EC2 + " ( " + Notification.Entry.COLUMN_NAME_ID
                    + " INTEGER PRIMARY KEY," + Notification.Entry.COLUMN_NAME_NOTIFICATION + " TEXT" + ")");

        db.execSQL("CREATE TABLE " + Notification.Entry.TABLE_RDS + " ( " + Notification.Entry.COLUMN_NAME_ID
                + " INTEGER PRIMARY KEY," + Notification.Entry.COLUMN_NAME_NOTIFICATION + " TEXT" + ")");

        db.execSQL("CREATE TABLE " + Notification.Entry.TABLE_REPORT + " ( " + Notification.Entry.COLUMN_NAME_ID
                + " INTEGER PRIMARY KEY," + Notification.Entry.COLUMN_NAME_NOTIFICATION + " TEXT" + ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Notification.Entry.TABLE_ELB);
        db.execSQL("DROP TABLE IF EXISTS " + Notification.Entry.TABLE_EC2);
        db.execSQL("DROP TABLE IF EXISTS " + Notification.Entry.TABLE_RDS);
        db.execSQL("DROP TABLE IF EXISTS " + Notification.Entry.TABLE_REPORT);
        onCreate(db);
    }
}
