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
                new ItemDao(100101, "จานหลัก", R.mipmap.want_eat_main,1001001),
                new ItemDao(100102, "ผลไม้", R.mipmap.want_eat_fruit,1001002),
                new ItemDao(100103, "ขนมหวาน", R.mipmap.want_eat_sweet,1001003),
                new ItemDao(100104, null, null),});

            dataSub.put(1001001,new ItemDao[]{
                    new ItemDao(100100101, "บะหมี่หมูแดง", R.mipmap.want_eat_main_bamheemhoodang).speech("ฉันต้องการกินบะหมี่หมูแดง"),
                    new ItemDao(100100102, "สเต็กเนื้อ", R.mipmap.want_eat_main_beefsteak).speech("ฉันต้องการกินสเต็กเนื้อ"),
                    new ItemDao(100100103, "ไก่ทอด", R.mipmap.want_eat_main_friedchic),
                    new ItemDao(100100104, "ไก่ผัดขิง", R.mipmap.want_eat_main_kaipadking),
                    new ItemDao(100100105, "แกงเขียวหวาน", R.mipmap.want_eat_main_kangkeawwhan),
                    new ItemDao(100100106, "แกงมะระ", R.mipmap.want_eat_main_kangmara),
                    new ItemDao(100100107, "แกงส้มชะอม", R.mipmap.want_eat_main_kangsonchaom),
                    new ItemDao(100100108, "ขนมจีน", R.mipmap.want_eat_main_kanomjeen),
                    new ItemDao(100100109, "ข้าวไข่เจียว", R.mipmap.want_eat_main_kaokaijeaw),
                    new ItemDao(100100110, "ข้าวขาหมู", R.mipmap.want_eat_main_kaokhamhoo),
                    new ItemDao(100100111, "ข้าวคลุกกะปิ", R.mipmap.want_eat_main_kaokukkapi),
                    new ItemDao(100100112, "ข้าวมันไก่", R.mipmap.want_eat_main_kaomunkai),
                    new ItemDao(100100113, "ข้าวผัดหมู", R.mipmap.want_eat_main_kaopadmhoo),
                    new ItemDao(100100114, "ข้าวผัดปู", R.mipmap.want_eat_main_kaopadpoo),
                    new ItemDao(100100115, "ข้าวต้มปลา", R.mipmap.want_eat_main_kaotompla),
                    new ItemDao(100100116, "ไข่พะโล้", R.mipmap.want_eat_main_khaipalo),
                    new ItemDao(100100117, "กะเพราไก่", R.mipmap.want_eat_main_krapaokai),
                    new ItemDao(100100118, "ลาบหมู", R.mipmap.want_eat_main_labmhoo),
                    new ItemDao(100100119, "มัสมั่น", R.mipmap.want_eat_main_masaman),
                    new ItemDao(100100120, "ซุปเห็ด", R.mipmap.want_eat_main_mushroomsoup),
                    new ItemDao(100100121, "น้ำพริกกะปิ", R.mipmap.want_eat_main_namprikkapi),
                    new ItemDao(100100122, "น้ำพริกปลาทู", R.mipmap.want_eat_main_namprikplatoo),
                    new ItemDao(100100123, "ผัดผัก", R.mipmap.want_eat_main_padpuk),
                    new ItemDao(100100124, "ผัดผักบุ้ง", R.mipmap.want_eat_main_padpukbung),
                    new ItemDao(100100125, "ผัดซีอิ๊ว", R.mipmap.want_eat_main_padseeeiw),
                    new ItemDao(100100126, "ผัดไท", R.mipmap.want_eat_main_padthai),
                    new ItemDao(100100127, "ผัดไทกุ้งสด", R.mipmap.want_eat_main_padthaikungsod),
                    new ItemDao(100100128, "แพนงหมู", R.mipmap.want_eat_main_panangmhoo),
                    new ItemDao(100100129, "พิซซ่า", R.mipmap.want_eat_main_pizza),
                    new ItemDao(100100130, "ส้มตำ", R.mipmap.want_eat_main_somtam),
                    new ItemDao(100100131, "สัมตำปลาร้า", R.mipmap.want_eat_main_somtamplara),
                    new ItemDao(100100132, "สปาเก็ตตี้ซอสแดง", R.mipmap.want_eat_main_spaghetti),
                    new ItemDao(100100133, "ทอดมัน", R.mipmap.want_eat_main_todmun),
                    new ItemDao(100100134, null, null),
                    new ItemDao(100100135, "ต้มยำกุ้ง", R.mipmap.want_eat_main_tomyamkung),
                    new ItemDao(100100136, null, null),});

            dataSub.put(1001002,new ItemDao[]{
                    new ItemDao(100100201, "แอปเปิ้ล", R.mipmap.want_eat_fruit_apple),
                    new ItemDao(100100202, "แคนตาลูป", R.mipmap.want_eat_fruit_cantaloop),
                    new ItemDao(100100203, "ชมพู่", R.mipmap.want_eat_fruit_chompoo),
                    new ItemDao(100100204, "แก้วมังกร", R.mipmap.want_eat_fruit_dragonfruit),
                    new ItemDao(100100205, "ทุเรียน", R.mipmap.want_eat_fruit_durian),
                    new ItemDao(100100206, "ฝรั่ง", R.mipmap.want_eat_fruit_farang),
                    new ItemDao(100100207, "ฟักทอง", R.mipmap.want_eat_fruit_fucktong),
                    new ItemDao(100100208, "องุ่น", R.mipmap.want_eat_fruit_grape),
                    new ItemDao(100100209, "ขนุน", R.mipmap.want_eat_fruit_kanun),
                    new ItemDao(100100210, "กล้วย", R.mipmap.want_eat_fruit_kuy),
                    new ItemDao(100100211, "ลำไย", R.mipmap.want_eat_fruit_lamyai),
                    new ItemDao(100100212, "ลิ้นจี่", R.mipmap.want_eat_fruit_linji),
                    new ItemDao(100100213, "ลองกอง", R.mipmap.want_eat_fruit_longgong),
                    new ItemDao(100100214, "มะละกอ", R.mipmap.want_eat_fruit_malako),
                    new ItemDao(100100215, "มะม่วง", R.mipmap.want_eat_fruit_mango),
                    new ItemDao(100100216, "มังคุด", R.mipmap.want_eat_fruit_mungkud),
                    new ItemDao(100100217, "เงาะ", R.mipmap.want_eat_fruit_ngo),
                    new ItemDao(100100218, "น้อยหน่า", R.mipmap.want_eat_fruit_nhoina),
                    new ItemDao(100100219, "สับปะรด", R.mipmap.want_eat_fruit_pineapple),
                    new ItemDao(100100220, "ส้ม", R.mipmap.want_eat_fruit_som),
                    new ItemDao(100100221, "สตรอว์เบอร์รี่", R.mipmap.want_eat_fruit_strawberry),
                    new ItemDao(100100222, "มะขาม", R.mipmap.want_eat_fruit_tamarind),
                    new ItemDao(100100223, "แตงโม", R.mipmap.want_eat_fruit_tangmo),
                    new ItemDao(100100224, "เผือก", R.mipmap.want_eat_fruit_taro),});

            dataSub.put(1001003,new ItemDao[]{
                    new ItemDao(100100301, "บัวลอย", R.mipmap.want_eat_sweet_bualoy),
                    new ItemDao(100100302, "เฉาก๊วย", R.mipmap.want_eat_sweet_chaokuay),
                    new ItemDao(100100303, "ขนมกล้วย", R.mipmap.want_eat_sweet_kanomkuy),
                    new ItemDao(100100304, "ขนมถ้วย", R.mipmap.want_eat_sweet_kanomtuy),
                    new ItemDao(100100305, "ข้าวเหนียวมะม่วง", R.mipmap.want_eat_sweet_kaoneawmamuang),
                    new ItemDao(100100306, "กลัวยบวดชี", R.mipmap.want_eat_sweet_kuybuadchee),
                    new ItemDao(100100307, "ลอดช่อง", R.mipmap.want_eat_sweet_lodchong),
                    new ItemDao(100100308, "แตงไทยกะทิ", R.mipmap.want_eat_sweet_melonkati),
                    new ItemDao(100100309, "รวมมิตร", R.mipmap.want_eat_sweet_mixedthaidessert),
                    new ItemDao(100100310, "ซาหริ่ม", R.mipmap.want_eat_sweet_salim),
                    new ItemDao(100100311, "บวดเผือก", R.mipmap.want_eat_sweet_tarobuad),
                    new ItemDao(100100312, "ถั่วเขียว", R.mipmap.want_eat_sweet_tuakeaw),
                    new ItemDao(100100313, "ทับทิมกรอบ", R.mipmap.want_eat_sweet_tubtimkrob),
                    new ItemDao(100100314, null, null),
                    new ItemDao(100100315, null, null),
                    new ItemDao(100100316, null, null),});


        dataSub.put(1003,new ItemDao[]{
                new ItemDao(100301, "เครื่องดื่มร้อน", R.mipmap.want_drink_hot,1003001),
                new ItemDao(100302, "เครื่องดื่มปั่น", R.mipmap.want_drink_frappe,1003002),
                new ItemDao(100303, "เครื่องดื่มเย็น", R.mipmap.want_drink_cold,1003003),
                new ItemDao(100304, null, null),});

            dataSub.put(1003001,new ItemDao[]{
                    new ItemDao(100300101, "น้ำอุ่น", R.mipmap.want_drink_hot_namplao),
                    new ItemDao(100300102, "กาแฟร้อน", R.mipmap.want_drink_hot_kafaeron),
                    new ItemDao(100300103, "เก๊กฮวยร้อน", R.mipmap.want_drink_hot_kekhuy),
                    new ItemDao(100300104, "น้ำมะนาวร้อน", R.mipmap.want_drink_hot_manowron),
                    new ItemDao(100300105, "น้ำใบเตยร้อน", R.mipmap.want_drink_hot_nambaitoey),
                    new ItemDao(100300106, "น้ำชาร้อน", R.mipmap.want_drink_hot_namcha),
                    new ItemDao(100300107, "ชาเขียวร้อน", R.mipmap.want_drink_hot_chakeawron),
                    new ItemDao(100300108, "น้ำเต้าหู้", R.mipmap.want_drink_hot_namtaohuu),});



            dataSub.put(1003002,new ItemDao[]{
                    new ItemDao(100300201, "แอปเปิ้ลปั่น", R.mipmap.want_drink_frappe_applefrappe),
                    new ItemDao(100300202, "กล้วยปั่น", R.mipmap.want_drink_frappe_bananfrappe),
                    new ItemDao(100300203, "ชาเขียวปั่น", R.mipmap.want_drink_frappe_chakeawpun),
                    new ItemDao(100300204, "โกโก้ปั่น", R.mipmap.want_drink_frappe_cocoafrappe),
                    new ItemDao(100300205, "กาแฟปั่น", R.mipmap.want_drink_frappe_coffeefrappe),
                    new ItemDao(100300206, "นมปั่น", R.mipmap.want_drink_frappe_milkshake),
                    new ItemDao(100300207, "ผลไม้รวมปั่น", R.mipmap.want_drink_frappe_mixfruitfrappe),
                    new ItemDao(100300208, "สับปะรดปั่น", R.mipmap.want_drink_frappe_pineapplefrappe),
                    new ItemDao(100300209, "สตรอว์เบอร์รี่ปั่น", R.mipmap.want_drink_frappe_strawberrypun),
                    new ItemDao(100300210, "แตงโมปั่น", R.mipmap.want_drink_frappe_tangmopun),
                    new ItemDao(100300211, "ชานมปั่น", R.mipmap.want_drink_frappe_thaiteafrappe),
                    new ItemDao(100300212, "ผักรวมปั่น", R.mipmap.want_drink_frappe_vegetablefrappe),});

            dataSub.put(1003003,new ItemDao[]{
                    new ItemDao(100300301, "น้ำเย็น", R.mipmap.want_drink_cold_namplao),
                    new ItemDao(100300302, "ชาเขียวเย็น", R.mipmap.want_drink_cold_chakeawyen),
                    new ItemDao(100300303, "น้ำอัดลม", R.mipmap.want_drink_cold_coke),
                    new ItemDao(100300304, "กาแฟเย็น", R.mipmap.want_drink_cold_kafaeyen),
                    new ItemDao(100300305, "เก็กฮวยเย็น", R.mipmap.want_drink_cold_kekhuy),
                    new ItemDao(100300306, "น้ำใบบัวบก", R.mipmap.want_drink_cold_nambaibuabok),
                    new ItemDao(100300307, "น้ำกระเจี๊ยบ", R.mipmap.want_drink_cold_namkrajeab),
                    new ItemDao(100300308, "น้ำมะนาวเย็น", R.mipmap.want_drink_cold_nammanow),
                    new ItemDao(100300309, "น้ำมะพร้าว", R.mipmap.want_drink_cold_nammaprao),
                    new ItemDao(100300310, "น้ำผึ้งมะนาว", R.mipmap.want_drink_cold_nampungmanow),
                    new ItemDao(100300311, "น้ำส้ม", R.mipmap.want_drink_cold_namsom),
                    new ItemDao(100300312, "นมเย็น", R.mipmap.want_drink_cold_nomyen),
                    new ItemDao(100300313, "โอเลี้ยง", R.mipmap.want_drink_cold_oleang),
                    new ItemDao(100300314, null, null),
                    new ItemDao(100300315, "ชาเย็น", R.mipmap.want_drink_cold_chayen),
                    new ItemDao(100300316, null, null),});

        dataSub.put(1002,new ItemDao[]{
                new ItemDao(100201, "โรงพยาบาล", R.mipmap.want_go_hospital),
                new ItemDao(100202, "ห้างสรรพสินค้า", R.mipmap.want_go_mall),
                new ItemDao(100203, "ตลาด", R.mipmap.want_go_market),
                new ItemDao(100204, "สวนสาธารณะ", R.mipmap.want_go_park),
                new ItemDao(100205, "เซเว่น", R.mipmap.want_go_seven),
                new ItemDao(100206, null, null),
                new ItemDao(100207, "วัด", R.mipmap.want_go_temple),
                new ItemDao(100208, null, null),});
    }


}
