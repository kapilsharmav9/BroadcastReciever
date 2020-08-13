package com.example.broadcastreciever;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class DBHelper extends SQLiteOpenHelper {
    static final String DBNAME = "BroadcastReciever";
    static final String TABLE_1 = "CONTACTS";
    static final String COL_1 = "NAME";
    static final String COL_2 = "NUMBER";

    public DBHelper(Context context) {
        super(context, DBNAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE TABLE_1(_ID INTEGER PRIMARY KEY AUTOINCREMENT,COL_1 VARCHAR(100),COL_2 VARCHAR(100))";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean InsertEMP(String id, String name) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_1, "raaj");
        cv.put(COL_2, "12345");

        long l = db.insert(TABLE_1,null,cv);
        if (l > 0) {
            return true;
        } else {
            return false;


        }

    }
}
