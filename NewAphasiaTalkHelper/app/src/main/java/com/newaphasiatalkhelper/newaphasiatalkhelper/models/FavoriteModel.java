package com.newaphasiatalkhelper.newaphasiatalkhelper.models;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.FavoriteDao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by blinkblinkk on 1/2/2018 AD.
 */

public class FavoriteModel {

    public FavoriteDb db ;

    public FavoriteModel(Context context) {
        db = new FavoriteDb(context);

    }

    public FavoriteDao[] getAll(){

        List<FavoriteDao> list = db.getAll();
        FavoriteDao[] arr = new FavoriteDao[list.size()];

        return list.toArray(arr);
      //  return new FavoriteDao[]{
       //        new FavoriteDao("ใช่", 1, 1),
        //       new FavoriteDao("ไม่ใช่", 2, 2)
      //  };


    }

    public void add(String sentence){

       db.add(sentence);
    }
    public  void incrementFreq(int id){
        db.incrementFreq(id);
    }
    public FavoriteDao search(String sentence){
        return db.search(sentence);
    }

    public  void remove(int id){
        db.remove(id);
    }

    class FavoriteDb extends SQLiteOpenHelper{

        public FavoriteDb(Context context) {
            super(context, "AphasiaTalk", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE FavoriteDb (id INTEGER PRIMARY KEY, sentence TEXT, freq INTEGER)");
            db.execSQL("INSERT INTO FavoriteDb VALUES(1,'ใช่',1)");
            db.execSQL("INSERT INTO FavoriteDb VALUES(2,'ไม่ใช่',1)");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }

        public List<FavoriteDao> getAll(){
            SQLiteDatabase db = getWritableDatabase();
            Cursor cursor = db.query("FavoriteDb", null, null, null,null,null,"id");
            List<FavoriteDao> list = new ArrayList<>();

            if(cursor!= null){
                cursor.moveToFirst();
                while(!cursor.isAfterLast()){
                    FavoriteDao item = new FavoriteDao();
                    item.id = cursor.getInt(0);
                    item.sentence = cursor.getString(1);
                    item.freq = cursor.getInt(2);
                    list.add(item);

                    cursor.moveToNext();
                }
            }
            db.close();
            return list;
        }

        public void add(String sentence){
            sentence = sentence.replace("\n", "");
            SQLiteDatabase db = getWritableDatabase();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            int id = (int)(timestamp.getTime() % 100000);
            Log.i("aaa", "INSERT INTO FavoriteDb VALUES("+id+",'" + sentence + "',1)");
            db.execSQL("INSERT INTO FavoriteDb VALUES("+id+",'" + sentence + "',1)");
        }
        public  void incrementFreq(int id){
            SQLiteDatabase db = getWritableDatabase();
            db.execSQL("UPDATE FavoriteDb SET freq = freq+1 WHERE id = " +id);
        }
        public FavoriteDao search(String sentence){
            sentence = sentence.replace("\n", "");
            for(FavoriteDao item: getAll()){
                if(item.sentence.equals(sentence)){
                    return item;
                }
            }
            return null;
        }

        public  void remove(int id){
            SQLiteDatabase db = getWritableDatabase();
            Log.i("aaa", "DELETE FROM FavoriteDb where id = " + id);
            db.execSQL("DELETE FROM FavoriteDb where id = " + id);
        }
    }

}
