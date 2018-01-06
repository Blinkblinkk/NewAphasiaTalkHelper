package com.newaphasiatalkhelper.newaphasiatalkhelper.models;

import android.content.Context;

import com.newaphasiatalkhelper.newaphasiatalkhelper.MainApplication;
import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.ItemDao;

/**
 * Created by Tum on 11/19/2017 AD.
 */

public class FeelListModel extends ListModel{

    private static FeelListModel instance;

    public FeelListModel(Context context) {
        super(context);
    }

    public static FeelListModel getInstance(){
        if (instance==null){
            instance = new FeelListModel(MainApplication.context);
        }
        return instance;
    }


    {
        data = new ItemDao[]{
                new ItemDao(1, "ปวด", R.mipmap.feel_pain,2001),
                new ItemDao(2, "ปวดอึ", R.mipmap.feel_khee).speech("ฉันรู้สึกปวดอึ"),
                new ItemDao(3, "ปวดฉี่", R.mipmap.feel_pee).speech("ฉันรู้สึกปวดฉี่"),
                new ItemDao(4, "หิว", R.mipmap.feel_hungry).speech("ฉันรู้สึกหิว"),
                new ItemDao(5, "เหนื่อย", R.mipmap.feel_tired).speech("ฉันรู้สึกเหนื่อย"),
                new ItemDao(6, "ร้อน", R.mipmap.feel_hot).speech("ฉันรู้สึกร้อน"),
                new ItemDao(7, "หนาว", R.mipmap.feel_cold).speech("ฉันรู้สึกหนาว"),
                new ItemDao(8, "เครียด", R.mipmap.feel_stress).speech("ฉันรู้สึกเครียด"),
                new ItemDao(9, "ง่วง", R.mipmap.feel_sleepy).speech("ฉันรู้สึกง่วง"),
                new ItemDao(10, "มีความสุข", R.mipmap.feel_happy).speech("ฉันรู้สึกมีความสุข"),
                new ItemDao(11, "เศร้า", R.mipmap.feel_sad).speech("ฉันรู้สึกเศร้า"),
                new ItemDao(12, "กลัว", R.mipmap.feel_scare).speech("ฉันรู้สึกกลัว"),
                new ItemDao(13, "โกรธ", R.mipmap.feel_angry).speech("ฉันรู้สึกโกรธ"),
                new ItemDao(14, "คัน", R.mipmap.feel_scratch).speech("ฉันรู้สึกคัน"),

        };


        dataSub.put(2001,new ItemDao[]{
                new ItemDao(200101, "หัว", R.mipmap.feel_pain_head).speech("ฉันรู้สึกปวดหัว"),
                new ItemDao(200102, "ตา", R.mipmap.feel_pain_eye).speech("ฉันรู้สึกปวดตา"),
                new ItemDao(200103, "หู", R.mipmap.feel_pain_ear).speech("ฉันรู้สึกปวดหู"),
                new ItemDao(200104, "จมูก", R.mipmap.feel_pain_nose).speech("ฉันรู้สึกปวดจมูก"),
                new ItemDao(200105, "ฟัน", R.mipmap.feel_pain_teeth).speech("ฉันรู้สึกปวดฟัน"),
                new ItemDao(200106, "คอ", R.mipmap.feel_pain_neck).speech("ฉันรู้สึกปวดคอ"),
                new ItemDao(200107, "หน้าอก", R.mipmap.feel_pain_chest).speech("ฉันรู้สึกปวดหน้าอก"),
                new ItemDao(200108, "ไหล่", R.mipmap.feel_pain_shoulder).speech("ฉันรู้สึกปวดไหล่"),
                new ItemDao(200109, "หลัง", R.mipmap.feel_pain_back).speech("ฉันรู้สึกปวดหลัง"),
                new ItemDao(200110, "แขน", R.mipmap.feel_pain_arm).speech("ฉันรู้สึกปวดแขน"),
                new ItemDao(200111, "ข้อศอก", R.mipmap.feel_pain_elbow).speech("ฉันรู้สึกปวดข้อศอก"),
                new ItemDao(200112, "มือ", R.mipmap.feel_pain_hand).speech("ฉันรู้สึกปวดมือ"),
                new ItemDao(200113, "ท้อง", R.mipmap.feel_pain_stomach).speech("ฉันรู้สึกปวดท้อง"),
                new ItemDao(200114, "เอว", R.mipmap.feel_pain_waist).speech("ฉันรู้สึกปวดเอว"),
                new ItemDao(200115, "สะโพก", R.mipmap.feel_pain_sapoke).speech("ฉันรู้สึกปวดสะโพก"),
                new ItemDao(200116, "ก้น", R.mipmap.feel_pain_bottom).speech("ฉันรู้สึกปวดก้น"),
                new ItemDao(200117, "ขา", R.mipmap.feel_pain_leg).speech("ฉันรู้สึกปวดขา"),
                new ItemDao(200118, "หัวเข่า", R.mipmap.feel_pain_knee).speech("ฉันรู้สึกปวดหัวเข่า"),
                new ItemDao(200119, "เท้า", R.mipmap.feel_pain_feet).speech("ฉันรู้สึกปวดเท้า"),
                new ItemDao(200120, null, null),});
    }


}
