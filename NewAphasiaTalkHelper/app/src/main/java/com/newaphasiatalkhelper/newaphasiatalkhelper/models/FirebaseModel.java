package com.newaphasiatalkhelper.newaphasiatalkhelper.models;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.telephony.TelephonyManager;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tum on 2/25/2018 AD.
 */


public class FirebaseModel {
    private Context mContext;
    private DatabaseReference db = FirebaseDatabase.getInstance().getReference();
    String id = "TumIMEI";


    public FirebaseModel(Context mContext) {
        this.mContext = mContext;
    }

    public void init() {
        TelephonyManager manager = (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);
        if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {

            String IMEI = manager.getDeviceId();
            id = IMEI;
            Log.i("aaa", "IMEI = " + IMEI);
            return;
        }
    }

    public void enterItemActivity(String sentence){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","เลือกข้อความ");
        data.put("sentence","เลือกข้อความ: "+sentence);
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }

    public String getCurrentTime(){
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        return s.format(now);
    }

    public void speechItemActivity(String sentence){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","ออกเสียงข้อความที่เลือก");
        data.put("sentence","ออกเสียงข้อความที่เลือก: "+sentence);
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }

    public void addfavItemActivity(String sentence){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","เพิ่มข้อความที่เลือกไปยังรายการโปรด");
        data.put("sentence","เพิ่มข้อความที่เลือกไปยังรายการโปรด: "+sentence);
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }

    public void deletefavItemActivity(String sentence){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","ลบข้อความที่เลือกออกจากรายการโปรด");
        data.put("sentence","ลบข้อความที่เลือกออกจากรายการโปรด: "+sentence);
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }

    public void backhomeActivity(){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","กลับหน้าหลัก");
        data.put("sentence","");
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }

    public void enterTypeTextActivity(){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","พิมข้อความ");
        data.put("sentence","");
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }

    public void clearTypeTextActivity(){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","ลบข้อความที่พิมทั้งหมด");
        data.put("sentence","");
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }

    public void speechTypeTextActivity(String sentence){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","ออกเสียงข้อความที่พิม");
        data.put("sentence","ออกเสียงข้อความที่พิม: "+sentence);
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }
    public void addfavTypeTextActivity(String sentence){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","เพิ่มข้อความที่เลือกไปยังรายการโปรด");
        data.put("sentence","เพิ่มข้อความที่เลือกไปยังรายการโปรด: "+sentence);
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }

    public void speechfavoriteActivity(String sentence){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","ออกเสียงข้อความจากรายการโปรด");
        data.put("sentence","ออกเสียงข้อความจากรายการโปรด: "+sentence);
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }

    public void deletefavoriteActivity(String sentence){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","ลบข้อความในรายการโปรด");
        data.put("sentence","ลบข้อความในรายการโปรด: "+sentence);
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }

    public void sosActivity(){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","sos button");
        data.put("sentence","");
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }
    public void userhomeActivity(){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","user profile button");
        data.put("sentence","");
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }
    public void logoaphasiaActivity(){
        if (id == null){
            return;
        }

        Map<String,Object> data = new HashMap<>();
        data.put("action","logo aphasia button");
        data.put("sentence","");
        data.put("at",getCurrentTime());

        DatabaseReference ref = db.child("user_stat").child(id).push();
        //Map<String,Object> newRow = new HashMap<>();
        //newRow.put(ref.getKey(),data);
        Log.i("aaa", data.toString());
        ref.updateChildren(data);
    }
}
