package com.example.logindbapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

    private static final String DB_NAME = "logindb";
    private static final int DB_VERSION = 1;
    private static final String TABLE_NAME = "logindtl";
    private static final String ID_COL = "id";
    private static final String NAME_COL = "username";
    private static final String PASS_COL = "password";

    public DBHandler(MainActivity context) {
        super(context, DB_NAME, null,DB_VERSION);
    }


    @Override

    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE" + TABLE_NAME + "(" + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT," + NAME_COL + "TEXT," + PASS_COL + "TEXT)";
        db.execSQL(query);

    }
    public void addNewCourse (String username,String password){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(NAME_COL, username);
        values.put(PASS_COL, password);

        db.insert(TABLE_NAME, null, values);
        db.close();

    }
    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }


}
