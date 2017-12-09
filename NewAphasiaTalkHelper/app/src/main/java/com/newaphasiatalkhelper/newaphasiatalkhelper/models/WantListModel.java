package com.newaphasiatalkhelper.newaphasiatalkhelper.models;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.newaphasiatalkhelper.newaphasiatalkhelper.MainApplication;
import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.ItemDao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tum on 11/19/2017 AD.
 */

public class WantListModel {

    private static WantListModel instance;
    public static WantListModel getInstance(){
        if (instance==null){
            instance = new WantListModel(MainApplication.context);
        }
        return instance;
    }

    WantListDb helper;
    ItemDao[] data;
    Map<Integer, ItemDao[]> dataSub= new HashMap<>();

    {
        data = new ItemDao[]{
                new ItemDao(1, "กิน", R.mipmap.want_eat,1001),
                new ItemDao(2, "ดื่ม", R.mipmap.want_drink,1002),
                new ItemDao(3, "ไป", R.mipmap.want_go),
                new ItemDao(4, "นอน", R.mipmap.want_sleep),
                new ItemDao(5, "เข้าห้องน้ำ", R.mipmap.want_toilet),
                new ItemDao(6, "แปรงฟัน", R.mipmap.want_teethbrush),
                new ItemDao(7, "อาบน้ำ", R.mipmap.want_shower),
                new ItemDao(8, "สระผม", R.mipmap.want_hairwash),
                new ItemDao(9, "ยา", R.mipmap.want_medicine),
                new ItemDao(10, "นั่ง", R.mipmap.want_sit),
                new ItemDao(11, "เดิน", R.mipmap.want_walk),
                new ItemDao(12, "พูดคุย", R.mipmap.want_talk),
                new ItemDao(13, "ซื้อของ", R.mipmap.want_shopping),
                new ItemDao(14, "ดูทีวี", R.mipmap.want_watchtv),
                new ItemDao(15, "อ่านหนังสือ", R.mipmap.want_read),
                new ItemDao(16, "ออกกำลังกาย", R.mipmap.want_exercise),
                new ItemDao(17, "ฟังเพลง", R.mipmap.want_listenmusic),
                new ItemDao(18, "ไม้เท้า", R.mipmap.want_maitow),
                new ItemDao(19, "นั่งรถเข็น", R.mipmap.want_wheelchair),
                new ItemDao(20, "ตัดเล็บ", R.mipmap.want_nailcut),
                new ItemDao(21, "หวีผม", R.mipmap.want_comb),
                new ItemDao(22, null, null),
                new ItemDao(23, "ประแป้ง", R.mipmap.want_powder),
                new ItemDao(24, null, null),
        };
        dataSub.put(1001,new ItemDao[]{
                new ItemDao(100101, "จานหลัก", R.mipmap.want_eat_main),
                new ItemDao(100102, "ขนมหวาน", R.mipmap.want_eat_sweet),
                new ItemDao(100103, null, null),
                new ItemDao(100104, "ผลไม้", R.mipmap.want_eat_fruit),});

        dataSub.put(1002,new ItemDao[]{
                new ItemDao(100201, "เครื่องดื่มร้อน", R.mipmap.want_drink_hot),
                new ItemDao(100202, "เครื่องดื่มเย็น", R.mipmap.want_drink_cold),
                new ItemDao(100203, null, null),
                new ItemDao(100204, "เครื่องดื่มปั่น", R.mipmap.want_drink_frappe),});
    }

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

    public ItemDao get(int index){
        return data[index];
    }

    public ItemDao[] getSubAll(int subId){
        return dataSub.get(subId);
    }

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
