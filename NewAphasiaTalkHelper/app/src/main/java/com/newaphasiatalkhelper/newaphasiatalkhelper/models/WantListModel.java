package com.newaphasiatalkhelper.newaphasiatalkhelper.models;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.ItemDao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tum on 11/19/2017 AD.
 */

public class WantListModel {

    WantListDb helper;
    ItemDao[] data = new ItemDao[]{
            new ItemDao(1,"ดื่ม", R.mipmap.drink_female),
            new ItemDao(2,"กิน", R.mipmap.eat_female),
            new ItemDao(3,"สระผม", R.mipmap.hairwash_female),
            new ItemDao(4,"ฟังเพลง", R.mipmap.listenmusic_female),
            new ItemDao(5,"กินยา", R.mipmap.medicine),
            new ItemDao(6,"ออกกำลังกาย", R.mipmap.exercise_female),
            new ItemDao(7,null, null),
            new ItemDao(8,null, null),
            new ItemDao(9,"ดื่ม", R.mipmap.drink_female),
            new ItemDao(10,"กิน", R.mipmap.eat_female),
            new ItemDao(11,"สระผม", R.mipmap.hairwash_female),
            new ItemDao(12,"ฟังเพลง", R.mipmap.listenmusic_female),
            new ItemDao(13,"กินยา", R.mipmap.medicine),
            new ItemDao(14,"ออกกำลังกาย", R.mipmap.exercise_female),
            new ItemDao(15,null, null),
            new ItemDao(16,null, null)

    };

    public WantListModel(Context context){
        helper = new WantListDb(context );
        Map<Integer,Integer> f = helper.getAllIdAndFrequency();
        for (ItemDao item : data){
            item.freq = f.get(item.id);
        }
        Arrays.sort(data);
    }

    public ItemDao[] getAll(){
        return data;
    }
    //Cont.
    public void IncrementFrequency(ItemDao item){

    }

    //DatabaseWantList
    public class WantListDb extends SQLiteOpenHelper{

        public WantListDb(Context context) {
            super(context, null, null, 1);
        }

        //CreateTableForWantList

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE WantListDb (id INTERGER PRIMARY KEY, freq INTERGER)");
            for (ItemDao item : getAll()){
                db.execSQL("INSERT INTO WantListDb VALUES(" + item.id + ", 0)");
            }

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS WantListDb");
            onCreate(db);

        }

        public Map<Integer,Integer> getAllIdAndFrequency(){
            SQLiteDatabase db = getWritableDatabase();

            Cursor cursor = db.query("WantListDb", null, null, null, null, null, "freq");

            Map<Integer,Integer> ids = new HashMap<>();

            if (cursor != null){
                cursor.moveToFirst();
            }

            while(!cursor.isAfterLast()){

                int id = cursor.getInt(0);
                int freq = cursor.getInt(1);
                ids.put(id, freq);
                cursor.moveToNext();
            }
            db.close();

            return ids;
        }
    }
}
