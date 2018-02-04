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
 * Created by Tum on 11/19/2017 AD. datalayer
 */

public class WantListModel extends ListModel{

    private static WantListModel instance;

    public WantListModel(Context context) {
        super(context);
    }

    public static WantListModel getInstance(){
        if (instance==null){
            instance = new WantListModel(MainApplication.context);
        }
        return instance;
    }


    {
        data = new ItemDao[]{
                new ItemDao(1, "กิน", R.mipmap.want_eat,1001),
                new ItemDao(2, "ไป", R.mipmap.want_go,1002),
                new ItemDao(3, "ดื่ม", R.mipmap.want_drink,1003),
                new ItemDao(4, "นอน", R.mipmap.want_sleep).speech("ฉันต้องการ"+"\n"+"นอน"),
                new ItemDao(5, "เข้าห้องน้ำ", R.mipmap.want_toilet).speech("ฉันต้องการ"+"\n"+"เข้าห้องน้ำ"),
                new ItemDao(6, "แปรงฟัน", R.mipmap.want_teethbrush).speech("ฉันต้องการ"+"\n"+"แปรงฟัน"),
                new ItemDao(7, "อาบน้ำ", R.mipmap.want_shower).speech("ฉันต้องการ"+"\n"+"อาบน้ำ"),
                new ItemDao(8, "สระผม", R.mipmap.want_hairwash).speech("ฉันต้องการ"+"\n"+"สระผม"),
                new ItemDao(9, "ยา", R.mipmap.want_medicine).speech("ฉันต้องการ"+"\n"+"ยา"),
                new ItemDao(10, "นั่ง", R.mipmap.want_sit).speech("ฉันต้องการ"+"\n"+"นั่ง"),
                new ItemDao(11, "เดิน", R.mipmap.want_walk).speech("ฉันต้องการ"+"\n"+"เดิน"),
                new ItemDao(12, "พูดคุย", R.mipmap.want_talk).speech("ฉันต้องการ"+"\n"+"พูดคุย"),
                new ItemDao(13, "ซื้อของ", R.mipmap.want_shopping).speech("ฉันต้องการ"+"\n"+"ซื้อของ"),
                new ItemDao(14, "ดูทีวี", R.mipmap.want_watchtv).speech("ฉันต้องการ"+"\n"+"ดูทีวี"),
                new ItemDao(15, "อ่านหนังสือ", R.mipmap.want_read).speech("ฉันต้องการ"+"\n"+"อ่านหนังสือ"),
                new ItemDao(16, "ออกกำลังกาย", R.mipmap.want_exercise).speech("ฉันต้องการ"+"\n"+"ออกกำลังกาย"),
                new ItemDao(17, "ฟังเพลง", R.mipmap.want_listenmusic).speech("ฉันต้องการ"+"\n"+"ฟังเพลง"),
                new ItemDao(18, "ไม้เท้า", R.mipmap.want_maitow).speech("ฉันต้องการ"+"\n"+"ไม้เท้า"),
                new ItemDao(19, "นั่งรถเข็น", R.mipmap.want_wheelchair).speech("ฉันต้องการ"+"\n"+"นั่งรถเข็น"),
                new ItemDao(20, "ตัดเล็บ", R.mipmap.want_nailcut).speech("ฉันต้องการ"+"\n"+"ตัดเล็บ"),
                new ItemDao(21, "หวีผม", R.mipmap.want_comb).speech("ฉันต้องการ"+"\n"+"หวีผม"),
                new ItemDao(22, null, null),
                new ItemDao(23, "ประแป้ง", R.mipmap.want_powder).speech("ฉันต้องการ"+"\n"+"ประแป้ง"),
                new ItemDao(24, null, null),
        };
        dataSub.put(1001,new ItemDao[]{
                new ItemDao(100101, "จานหลัก", R.mipmap.want_eat_main,1001001),
                new ItemDao(100102, "ผลไม้", R.mipmap.want_eat_fruit,1001002),
                new ItemDao(100103, "ขนมหวาน", R.mipmap.want_eat_sweet,1001003),
                new ItemDao(100104, null, null),});

            dataSub.put(1001001,new ItemDao[]{
                    new ItemDao(100100101, "บะหมี่หมูแดง", R.mipmap.want_eat_main_bamheemhoodang).speech("ฉันต้องการกิน"+"\n"+"บะหมี่หมูแดง"),
                    new ItemDao(100100102, "สเต็กเนื้อ", R.mipmap.want_eat_main_beefsteak).speech("ฉันต้องการกิน"+"\n"+"สเต็กเนื้อ"),
                    new ItemDao(100100103, "ไก่ทอด", R.mipmap.want_eat_main_friedchic).speech("ฉันต้องการกิน"+"\n"+"ไก่ทอด"),
                    new ItemDao(100100104, "ไก่ผัดขิง", R.mipmap.want_eat_main_kaipadking).speech("ฉันต้องการกินไก่ผัดขิง"),
                    new ItemDao(100100105, "แกงเขียวหวาน", R.mipmap.want_eat_main_kangkeawwhan).speech("ฉันต้องการกินแกงเขียวหวาน"),
                    new ItemDao(100100106, "แกงมะระ", R.mipmap.want_eat_main_kangmara).speech("ฉันต้องการกินแกงมะระ"),
                    new ItemDao(100100107, "แกงส้มชะอม", R.mipmap.want_eat_main_kangsonchaom).speech("ฉันต้องการกินแกงส้มชะอม"),
                    new ItemDao(100100108, "ขนมจีน", R.mipmap.want_eat_main_kanomjeen).speech("ฉันต้องการกินขนมจีน"),
                    new ItemDao(100100109, "ข้าวไข่เจียว", R.mipmap.want_eat_main_kaokaijeaw).speech("ฉันต้องการกินข้าวไข่เจียว"),
                    new ItemDao(100100110, "ข้าวขาหมู", R.mipmap.want_eat_main_kaokhamhoo).speech("ฉันต้องการกินข้าวขาหมู"),
                    new ItemDao(100100111, "ข้าวคลุกกะปิ", R.mipmap.want_eat_main_kaokukkapi).speech("ฉันต้องการกินข้าวคลุกกะปิ"),
                    new ItemDao(100100112, "ข้าวมันไก่", R.mipmap.want_eat_main_kaomunkai).speech("ฉันต้องการกินข้าวมันไก่"),
                    new ItemDao(100100113, "ข้าวผัดหมู", R.mipmap.want_eat_main_kaopadmhoo).speech("ฉันต้องการกินข้าวผัดหมู"),
                    new ItemDao(100100114, "ข้าวผัดปู", R.mipmap.want_eat_main_kaopadpoo).speech("ฉันต้องการกินข้าวผัดปู"),
                    new ItemDao(100100115, "ข้าวต้มปลา", R.mipmap.want_eat_main_kaotompla).speech("ฉันต้องการกินข้าวต้มปลา"),
                    new ItemDao(100100116, "ไข่พะโล้", R.mipmap.want_eat_main_khaipalo).speech("ฉันต้องการกินไข่พะโล้"),
                    new ItemDao(100100117, "กะเพราไก่", R.mipmap.want_eat_main_krapaokai).speech("ฉันต้องการกินกะเพราไก่"),
                    new ItemDao(100100118, "ลาบหมู", R.mipmap.want_eat_main_labmhoo).speech("ฉันต้องการกินลาบหมู"),
                    new ItemDao(100100119, "มัสมั่น", R.mipmap.want_eat_main_masaman).speech("ฉันต้องการกินมัสมั่นไก่"),
                    new ItemDao(100100120, "ซุปเห็ด", R.mipmap.want_eat_main_mushroomsoup).speech("ฉันต้องการกินซุปเห็ด"),
                    new ItemDao(100100121, "น้ำพริกกะปิ", R.mipmap.want_eat_main_namprikkapi).speech("ฉันต้องการกินน้ำพริกกะปิ"),
                    new ItemDao(100100122, "น้ำพริกปลาทู", R.mipmap.want_eat_main_namprikplatoo).speech("ฉันต้องการกินน้ำพริกปลาทู"),
                    new ItemDao(100100123, "ผัดผัก", R.mipmap.want_eat_main_padpuk).speech("ฉันต้องการกินผัดผัก"),
                    new ItemDao(100100124, "ผัดผักบุ้ง", R.mipmap.want_eat_main_padpukbung).speech("ฉันต้องการกินผัดผักบุ้ง"),
                    new ItemDao(100100125, "ผัดซีอิ๊ว", R.mipmap.want_eat_main_padseeeiw).speech("ฉันต้องการกินผัดซีอิ๊ว"),
                    new ItemDao(100100126, "ผัดไท", R.mipmap.want_eat_main_padthai).speech("ฉันต้องการกินผัดไท"),
                    new ItemDao(100100127, "ผัดไทกุ้งสด", R.mipmap.want_eat_main_padthaikungsod).speech("ฉันต้องการกินผัดไทกุ้งสด"),
                    new ItemDao(100100128, "พะแนงหมู", R.mipmap.want_eat_main_panangmhoo).speech("ฉันต้องการกินพะแนงหมู"),
                    new ItemDao(100100129, "พิซซ่า", R.mipmap.want_eat_main_pizza).speech("ฉันต้องการกินพิซซ่า"),
                    new ItemDao(100100130, "ส้มตำ", R.mipmap.want_eat_main_somtam).speech("ฉันต้องการกินส้มตำ"),
                    new ItemDao(100100131, "ส้มตำปลาร้า", R.mipmap.want_eat_main_somtamplara).speech("ฉันต้องการกินส้มตำปลาร้า"),
                    new ItemDao(100100132, "สปาเก็ตตี้ซอสแดง", R.mipmap.want_eat_main_spaghetti).speech("ฉันต้องการกินสปาเก็ตตี้ซอสแดง"),
                    new ItemDao(100100133, "ทอดมัน", R.mipmap.want_eat_main_todmun).speech("ฉันต้องการกินทอดมัน"),
                    new ItemDao(100100134, null, null),
                    new ItemDao(100100135, "ต้มยำกุ้ง", R.mipmap.want_eat_main_tomyamkung).speech("ฉันต้องการกินต้มยำกุ้ง"),
                    new ItemDao(100100136, null, null),});

            dataSub.put(1001002,new ItemDao[]{
                    new ItemDao(100100201, "แอปเปิ้ล", R.mipmap.want_eat_fruit_apple).speech("ฉันต้องการกินแอปเปิ้ล"),
                    new ItemDao(100100202, "แคนตาลูป", R.mipmap.want_eat_fruit_cantaloop).speech("ฉันต้องการกินแคนตาลูป"),
                    new ItemDao(100100203, "ชมพู่", R.mipmap.want_eat_fruit_chompoo).speech("ฉันต้องการกินชมพู่"),
                    new ItemDao(100100204, "แก้วมังกร", R.mipmap.want_eat_fruit_dragonfruit).speech("ฉันต้องการกินแก้วมังกร"),
                    new ItemDao(100100205, "ทุเรียน", R.mipmap.want_eat_fruit_durian).speech("ฉันต้องการกินทุเรียน"),
                    new ItemDao(100100206, "ฝรั่ง", R.mipmap.want_eat_fruit_farang).speech("ฉันต้องการกินฝรั่ง"),
                    new ItemDao(100100207, "ฟักทอง", R.mipmap.want_eat_fruit_fucktong).speech("ฉันต้องการกินฟักทอง"),
                    new ItemDao(100100208, "องุ่น", R.mipmap.want_eat_fruit_grape).speech("ฉันต้องการกินองุ่น"),
                    new ItemDao(100100209, "ขนุน", R.mipmap.want_eat_fruit_kanun).speech("ฉันต้องการกินขนุน"),
                    new ItemDao(100100210, "กล้วย", R.mipmap.want_eat_fruit_kuy).speech("ฉันต้องการกินกล้วย"),
                    new ItemDao(100100211, "ลำไย", R.mipmap.want_eat_fruit_lamyai).speech("ฉันต้องการกินลำไย"),
                    new ItemDao(100100212, "ลิ้นจี่", R.mipmap.want_eat_fruit_linji).speech("ฉันต้องการกินลิ้นจี่"),
                    new ItemDao(100100213, "ลองกอง", R.mipmap.want_eat_fruit_longgong).speech("ฉันต้องการกินลองกอง"),
                    new ItemDao(100100214, "มะละกอ", R.mipmap.want_eat_fruit_malako).speech("ฉันต้องการกินมะละกอ"),
                    new ItemDao(100100215, "มะม่วง", R.mipmap.want_eat_fruit_mango).speech("ฉันต้องการกินมะม่วง"),
                    new ItemDao(100100216, "มังคุด", R.mipmap.want_eat_fruit_mungkud).speech("ฉันต้องการกินมังคุด"),
                    new ItemDao(100100217, "เงาะ", R.mipmap.want_eat_fruit_ngo).speech("ฉันต้องการกินเงาะ"),
                    new ItemDao(100100218, "น้อยหน่า", R.mipmap.want_eat_fruit_nhoina).speech("ฉันต้องการกินน้อยหน่า"),
                    new ItemDao(100100219, "สับปะรด", R.mipmap.want_eat_fruit_pineapple).speech("ฉันต้องการกินสับปะรด"),
                    new ItemDao(100100220, "ส้ม", R.mipmap.want_eat_fruit_som).speech("ฉันต้องการกินส้ม"),
                    new ItemDao(100100221, "สตรอเบอร์รี่", R.mipmap.want_eat_fruit_strawberry).speech("ฉันต้องการกินสตรอเบอร์รี่"),
                    new ItemDao(100100222, "มะขาม", R.mipmap.want_eat_fruit_tamarind).speech("ฉันต้องการกินมะขาม"),
                    new ItemDao(100100223, "แตงโม", R.mipmap.want_eat_fruit_tangmo).speech("ฉันต้องการกินแตงโม"),
                    new ItemDao(100100224, "เผือก", R.mipmap.want_eat_fruit_taro).speech("ฉันต้องการกินเผือก"),});

            dataSub.put(1001003,new ItemDao[]{
                    new ItemDao(100100301, "บัวลอย", R.mipmap.want_eat_sweet_bualoy).speech("ฉันต้องการกินบัวลอย"),
                    new ItemDao(100100302, "เฉาก๊วย", R.mipmap.want_eat_sweet_chaokuay).speech("ฉันต้องการกินเฉาก๊วย"),
                    new ItemDao(100100303, "ขนมกล้วย", R.mipmap.want_eat_sweet_kanomkuy).speech("ฉันต้องการกินขนมกล้วย"),
                    new ItemDao(100100304, "ขนมถ้วย", R.mipmap.want_eat_sweet_kanomtuy).speech("ฉันต้องการกินขนมถ้วย"),
                    new ItemDao(100100305, "ข้าวเหนียวมะม่วง", R.mipmap.want_eat_sweet_kaoneawmamuang).speech("ฉันต้องการกินข้าวเหนียวมะม่วง"),
                    new ItemDao(100100306, "กล้วยบวดชี", R.mipmap.want_eat_sweet_kuybuadchee).speech("ฉันต้องการกินกล้วยบวดชี"),
                    new ItemDao(100100307, "ลอดช่อง", R.mipmap.want_eat_sweet_lodchong).speech("ฉันต้องการกินลอดช่อง"),
                    new ItemDao(100100308, "แตงไทยกะทิ", R.mipmap.want_eat_sweet_melonkati).speech("ฉันต้องการกินแตงไทยกะทิ"),
                    new ItemDao(100100309, "รวมมิตร", R.mipmap.want_eat_sweet_mixedthaidessert).speech("ฉันต้องการกินรวมมิตร"),
                    new ItemDao(100100310, "ซ่าหริ่ม", R.mipmap.want_eat_sweet_salim).speech("ฉันต้องการกินซ่าหริ่ม"),
                    new ItemDao(100100311, "บวดเผือก", R.mipmap.want_eat_sweet_tarobuad).speech("ฉันต้องการกินบวดเผือก"),
                    new ItemDao(100100312, "ถั่วเขียว", R.mipmap.want_eat_sweet_tuakeaw).speech("ฉันต้องการกินถั่วเขียว"),
                    new ItemDao(100100313, "ทับทิมกรอบ", R.mipmap.want_eat_sweet_tubtimkrob).speech("ฉันต้องการกินทับทิมกรอบ"),
                    new ItemDao(100100314, null, null),
                    new ItemDao(100100315, null, null),
                    new ItemDao(100100316, null, null),});


        dataSub.put(1003,new ItemDao[]{
                new ItemDao(100301, "เครื่องดื่มร้อน", R.mipmap.want_drink_hot,1003001),
                new ItemDao(100302, "เครื่องดื่มปั่น", R.mipmap.want_drink_frappe,1003002),
                new ItemDao(100303, "เครื่องดื่มเย็น", R.mipmap.want_drink_cold,1003003),
                new ItemDao(100304, null, null),});

            dataSub.put(1003001,new ItemDao[]{
                    new ItemDao(100300101, "น้ำอุ่น", R.mipmap.want_drink_hot_namplao).speech("ฉันต้องการดื่ม"+"\n"+"น้ำอุ่น"),
                    new ItemDao(100300102, "กาแฟร้อน", R.mipmap.want_drink_hot_kafaeron).speech("ฉันต้องการดื่ม"+"\n"+"กาแฟร้อน"),
                    new ItemDao(100300103, "เก๊กฮวยร้อน", R.mipmap.want_drink_hot_kekhuy).speech("ฉันต้องการดื่ม"+"\n"+"เก๊กฮวยร้อน"),
                    new ItemDao(100300104, "น้ำมะนาวร้อน", R.mipmap.want_drink_hot_manowron).speech("ฉันต้องการดื่ม"+"\n"+"น้ำมะนาวร้อน"),
                    new ItemDao(100300105, "น้ำใบเตยร้อน", R.mipmap.want_drink_hot_nambaitoey).speech("ฉันต้องการดื่ม"+"\n"+"น้ำใบเตยร้อน"),
                    new ItemDao(100300106, "น้ำชาร้อน", R.mipmap.want_drink_hot_namcha).speech("ฉันต้องการดื่ม"+"\n"+"น้ำชาร้อน"),
                    new ItemDao(100300107, "ชาเขียวร้อน", R.mipmap.want_drink_hot_chakeawron).speech("ฉันต้องการดื่ม"+"\n"+"ชาเขียวร้อน"),
                    new ItemDao(100300108, "น้ำเต้าหู้", R.mipmap.want_drink_hot_namtaohuu).speech("ฉันต้องการดื่ม"+"\n"+"น้ำเต้าหู้"),});



            dataSub.put(1003002,new ItemDao[]{
                    new ItemDao(100300201, "แอปเปิ้ลปั่น", R.mipmap.want_drink_frappe_applefrappe).speech("ฉันต้องการดื่ม"+"\n"+"แอปเปิ้ลปั่น"),
                    new ItemDao(100300202, "กล้วยปั่น", R.mipmap.want_drink_frappe_bananfrappe).speech("ฉันต้องการดื่ม"+"\n"+"กล้วยปั่น"),
                    new ItemDao(100300203, "ชาเขียวปั่น", R.mipmap.want_drink_frappe_chakeawpun).speech("ฉันต้องการดื่ม"+"\n"+"ชาเขียวปั่น"),
                    new ItemDao(100300204, "โกโก้ปั่น", R.mipmap.want_drink_frappe_cocoafrappe).speech("ฉันต้องการดื่ม"+"\n"+"โกโก้ปั่น"),
                    new ItemDao(100300205, "กาแฟปั่น", R.mipmap.want_drink_frappe_coffeefrappe).speech("ฉันต้องการดื่ม"+"\n"+"กาแฟปั่น"),
                    new ItemDao(100300206, "นมปั่น", R.mipmap.want_drink_frappe_milkshake).speech("ฉันต้องการดื่ม"+"\n"+"นมปั่น"),
                    new ItemDao(100300207, "ผลไม้รวมปั่น", R.mipmap.want_drink_frappe_mixfruitfrappe).speech("ฉันต้องการดื่ม"+"\n"+"ผลไม้รวมปั่น"),
                    new ItemDao(100300208, "สับปะรดปั่น", R.mipmap.want_drink_frappe_pineapplefrappe).speech("ฉันต้องการดื่ม"+"\n"+"สับปะรดปั่น"),
                    new ItemDao(100300209, "สตรอเบอร์รี่ปั่น", R.mipmap.want_drink_frappe_strawberrypun).speech("ฉันต้องการดื่ม"+"\n"+"สตรอเบอร์รี่ปั่น"),
                    new ItemDao(100300210, "แตงโมปั่น", R.mipmap.want_drink_frappe_tangmopun).speech("ฉันต้องการดื่ม"+"\n"+"แตงโมปั่น"),
                    new ItemDao(100300211, "ชานมปั่น", R.mipmap.want_drink_frappe_thaiteafrappe).speech("ฉันต้องการดื่ม"+"\n"+"ชานมปั่น"),
                    new ItemDao(100300212, "ผักรวมปั่น", R.mipmap.want_drink_frappe_vegetablefrappe).speech("ฉันต้องการดื่ม"+"\n"+"ผักรวมปั่น"),});

            dataSub.put(1003003,new ItemDao[]{
                    new ItemDao(100300301, "น้ำเย็น", R.mipmap.want_drink_cold_namplao).speech("ฉันต้องการดื่ม"+"\n"+"น้ำเย็น"),
                    new ItemDao(100300302, "ชาเขียวเย็น", R.mipmap.want_drink_cold_chakeawyen).speech("ฉันต้องการดื่ม"+"\n"+"ชาเขียวเย็น"),
                    new ItemDao(100300303, "น้ำอัดลม", R.mipmap.want_drink_cold_coke).speech("ฉันต้องการดื่ม"+"\n"+"น้ำอัดลม"),
                    new ItemDao(100300304, "กาแฟเย็น", R.mipmap.want_drink_cold_kafaeyen).speech("ฉันต้องการดื่ม"+"\n"+"กาแฟเย็น"),
                    new ItemDao(100300305, "เก็กฮวยเย็น", R.mipmap.want_drink_cold_kekhuy).speech("ฉันต้องการดื่ม"+"\n"+"เก็กฮวยเย็น"),
                    new ItemDao(100300306, "น้ำใบบัวบก", R.mipmap.want_drink_cold_nambaibuabok).speech("ฉันต้องการดื่ม"+"\n"+"น้ำใบบัวบก"),
                    new ItemDao(100300307, "น้ำกระเจี๊ยบ", R.mipmap.want_drink_cold_namkrajeab).speech("ฉันต้องการดื่ม"+"\n"+"น้ำกระเจี๊ยบ"),
                    new ItemDao(100300308, "น้ำมะนาวเย็น", R.mipmap.want_drink_cold_nammanow).speech("ฉันต้องการดื่ม"+"\n"+"น้ำมะนาวเย็น"),
                    new ItemDao(100300309, "น้ำมะพร้าว", R.mipmap.want_drink_cold_nammaprao).speech("ฉันต้องการดื่ม"+"\n"+"น้ำมะพร้าว"),
                    new ItemDao(100300310, "น้ำผึ้งมะนาว", R.mipmap.want_drink_cold_nampungmanow).speech("ฉันต้องการดื่ม"+"\n"+"น้ำผึ้งมะนาว"),
                    new ItemDao(100300311, "น้ำส้ม", R.mipmap.want_drink_cold_namsom).speech("ฉันต้องการดื่ม"+"\n"+"น้ำส้ม"),
                    new ItemDao(100300312, "นมเย็น", R.mipmap.want_drink_cold_nomyen).speech("ฉันต้องการดื่ม"+"\n"+"นมเย็น"),
                    new ItemDao(100300313, "โอเลี้ยง", R.mipmap.want_drink_cold_oleang).speech("ฉันต้องการดื่ม"+"\n"+"โอเลี้ยง"),
                    new ItemDao(100300314, null, null),
                    new ItemDao(100300315, "ชาเย็น", R.mipmap.want_drink_cold_chayen).speech("ฉันต้องการดื่ม"+"\n"+"ชาเย็น"),
                    new ItemDao(100300316, null, null),});

        dataSub.put(1002,new ItemDao[]{
                new ItemDao(100201, "โรงพยาบาล", R.mipmap.want_go_hospital).speech("ฉันต้องการไป"+"\n"+"โรงพยาบาล"),
                new ItemDao(100202, "ห้างสรรพสินค้า", R.mipmap.want_go_mall).speech("ฉันต้องการไป"+"\n"+"ห้างสรรพสินค้า"),
                new ItemDao(100203, "ตลาด", R.mipmap.want_go_market).speech("ฉันต้องการไป"+"\n"+"ตลาด"),
                new ItemDao(100204, "สวนสาธารณะ", R.mipmap.want_go_park).speech("ฉันต้องการไป"+"\n"+"สวนสาธารณะ"),
                new ItemDao(100205, "เซเว่น", R.mipmap.want_go_seven).speech("ฉันต้องการไป"+"\n"+"เซเว่น"),
                new ItemDao(100206, null, null),
                new ItemDao(100207, "วัด", R.mipmap.want_go_temple).speech("ฉันต้องการไป"+"\n"+"วัด"),
                new ItemDao(100208, null, null),});
    }


}
