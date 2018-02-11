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
                new ItemDao(4, "นอน", R.mipmap.want_sleep).speech("ฉันต้องการนอน"),
                new ItemDao(5, "เข้าห้องน้ำ", R.mipmap.want_toilet).speech("ฉันต้องการเข้าห้องน้ำ"),
                new ItemDao(6, "แปรงฟัน", R.mipmap.want_teethbrush).speech("ฉันต้องการแปรงฟัน"),
                new ItemDao(7, "อาบน้ำ", R.mipmap.want_shower).speech("ฉันต้องการอาบน้ำ"),
                new ItemDao(8, "สระผม", R.mipmap.want_hairwash).speech("ฉันต้องการสระผม"),
                new ItemDao(9, "ยา", R.mipmap.want_medicine).speech("ฉันต้องการยา"),
                new ItemDao(10, "นั่ง", R.mipmap.want_sit).speech("ฉันต้องการนั่ง"),
                new ItemDao(11, "เดิน", R.mipmap.want_walk).speech("ฉันต้องการเดิน"),
                new ItemDao(12, "พูดคุย", R.mipmap.want_talk).speech("ฉันต้องการพูดคุย"),
                new ItemDao(13, "ซื้อของ", R.mipmap.want_shopping).speech("ฉันต้องการซื้อของ"),
                new ItemDao(14, "ดูทีวี", R.mipmap.want_watchtv).speech("ฉันต้องการดูทีวี"),
                new ItemDao(15, "อ่านหนังสือ", R.mipmap.want_read).speech("ฉันต้องการอ่านหนังสือ"),
                new ItemDao(16, "ออกกำลังกาย", R.mipmap.want_exercise).speech("ฉันต้องการออกกำลังกาย"),
                new ItemDao(17, "ฟังเพลง", R.mipmap.want_listenmusic).speech("ฉันต้องการฟังเพลง"),
                new ItemDao(18, "ไม้เท้า", R.mipmap.want_maitow).speech("ฉันต้องการไม้เท้า"),
                new ItemDao(19, "นั่งรถเข็น", R.mipmap.want_wheelchair).speech("ฉันต้องการนั่งรถเข็น"),
                new ItemDao(20, "ตัดเล็บ", R.mipmap.want_nailcut).speech("ฉันต้องการตัดเล็บ"),
                new ItemDao(21, "หวีผม", R.mipmap.want_comb).speech("ฉันต้องการหวีผม"),
                new ItemDao(22, null, null),
                new ItemDao(23, "ประแป้ง", R.mipmap.want_powder).speech("ฉันต้องการประแป้ง"),
                new ItemDao(24, null, null),
        };
        dataSub.put(1001,new ItemDao[]{
                new ItemDao(100101, "อาหารจานเดียว"+"\n"+"หรือ จานหลัก", R.mipmap.want_eat_main,1001001),
                new ItemDao(100102, "ผัด", R.mipmap.want_eat_fruit,1001002),
                new ItemDao(100103, "แกงจืด"+"\n"+"และ แกงเผ็ด", R.mipmap.want_eat_sweet),
                new ItemDao(100104, "อบ และ นึ่ง", R.mipmap.want_eat_main),
                new ItemDao(100105, "ทอด, เผา"+"\n"+"และ ย่าง", R.mipmap.want_eat_fruit),
                new ItemDao(100106, "อาหารว่าง" +"\n"+"และ ของหวาน", R.mipmap.want_eat_sweet,1001006),
                new ItemDao(100107, "ยำ, เครื่องจิ้ม"+"\n"+"และ สลัด", R.mipmap.want_eat_main),
                new ItemDao(100108, "ผลไม้", R.mipmap.want_eat_fruit,1001008),});


            dataSub.put(1001001,new ItemDao[]{
                    new ItemDao(100100101, "สเต็กเนื้อ", R.mipmap.want_eat_main_beefsteak).speech("ฉันต้องการกินสเต็กเนื้อ"),
                    new ItemDao(100100102, "พิซซ่า", R.mipmap.want_eat_main_pizza).speech("ฉันต้องการกินพิซซ่า"),
                    new ItemDao(100100103, "สเต็กหมู", R.mipmap.want_eat_main_porksteak).speech("ฉันต้องการกินสเต็กหมู"),
                    new ItemDao(100100104, "ไส้กรอกเยอรมัน", R.mipmap.want_eat_main_germansausage).speech("ฉันต้องการกินไส้กรอกเยอรมัน"),
                    new ItemDao(100100105, "เบอร์เกอร์เนื้อ", R.mipmap.want_eat_main_beefburger).speech("ฉันต้องการกินเบอร์เกอร์เนื้อ"),
                    new ItemDao(100100106, "บะหมี่หมูแดง", R.mipmap.ic_launcher).speech("ฉันต้องการกินบะหมี่หมูแดง"),
                    new ItemDao(100100107, "เบอร์เกอร์หมู", R.mipmap.want_eat_main_porkburger).speech("ฉันต้องการกินเบอร์เกอร์หมู"),
                    new ItemDao(100100108, "บะหมี่หมูกรอบ", R.mipmap.want_eat_main_bameemoookrob).speech("ฉันต้องการกินบะหมี่หมูกรอบ"),
                    new ItemDao(100100109, "บะหมี่กึ่งสำเร็จรูป", R.mipmap.want_eat_main_mama).speech("ฉันต้องการกินบะหมี่กึ่งสำเร็จรูป"),
                    new ItemDao(100100110, "ราเมน", R.mipmap.want_eat_main_ramen).speech("ฉันต้องการกินราเมน"),
                    new ItemDao(100100111, "พาสต้า", R.mipmap.want_eat_main_pasta).speech("ฉันต้องการกินพาสต้า"),
                    new ItemDao(100100112, "เฝอ", R.mipmap.want_eat_main_fer).speech("ฉันต้องการกินเฝอ"),
                    new ItemDao(100100113, "แหนมเนือง", R.mipmap.want_eat_main_nhamnueng).speech("ฉันต้องการกินแหนมเนือง"),
                    new ItemDao(100100114, "ลักซา", R.mipmap.want_eat_main_laksa).speech("ฉันต้องการกินลักซา"),
                    new ItemDao(100100115, "คีบับ", R.mipmap.want_eat_main_kebab).speech("ฉันต้องการกินคีบับ"),
                    new ItemDao(100100116, "โกยซีหมี่", R.mipmap.want_eat_main_koaysemee).speech("ฉันต้องการกินโกยซีหมี่"),
                    new ItemDao(100100117, "ขนมจีน", R.mipmap.want_eat_main_kanomjean).speech("ฉันต้องการกินขนมจีน"),
                    new ItemDao(100100118, "ผัดไท", R.mipmap.want_eat_main_pudthai).speech("ฉันต้องการกินผัดไท"),
                    new ItemDao(100100119, "ผัดหมี่", R.mipmap.want_eat_main_pudmhee).speech("ฉันต้องการกินผัดหมี่"),
                    new ItemDao(100100120, "ผัดมาม่า", R.mipmap.want_eat_main_pudmama).speech("ฉันต้องการกินผัดมาม่า"),
                    new ItemDao(100100121, "ผัดซีอิ๊ว", R.mipmap.want_eat_main_pudseaew).speech("ฉันต้องการกินผัดซีอิ๊ว"),
                    new ItemDao(100100122, "ก๋วยเตี๋ยว", R.mipmap.want_eat_main_noodle).speech("ฉันต้องการกินก๋วยเตี๋ยว"),
                    new ItemDao(100100123, "ก๋วยเตี๋ยวคั่วไก่", R.mipmap.want_eat_main_kuakai).speech("ฉันต้องการกินก๋วยเตี๋ยวคั่วไก่"),
                    new ItemDao(100100124, "ก๋วยเตี๋ยวน้ำตก", R.mipmap.want_eat_main_numtok).speech("ฉันต้องการกินก๋วยเตี๋ยวน้ำตก"),
                    new ItemDao(100100125, "ก๋วยเตี๋ยวไก่", R.mipmap.want_eat_main_chickennoodle).speech("ฉันต้องการกินก๋วยเตี๋ยวไก่"),
                    new ItemDao(100100126, "ข้าวเหนียวหมูปิ้ง", R.mipmap.want_eat_main_kaoneawmooping).speech("ฉันต้องการกินข้าวเหนียวหมูปิ้ง"),
                    new ItemDao(100100127, "ก๋วยเตี๋ยวต้มยำ", R.mipmap.want_eat_main_teawtomyum).speech("ฉันต้องการกินก๋วยเตี๋ยวต้มยำ"),
                    new ItemDao(100100128, "ข้าวไข่ข้นกุ้ง", R.mipmap.want_eat_main_kaokaikonkung).speech("ฉันต้องการกินข้าวไข่ข้นกุ้ง"),
                    new ItemDao(100100129, "ข้าวไข่เจียว", R.mipmap.ic_launcher).speech("ฉันต้องการกินข้าวไข่เจียว"),
                    new ItemDao(100100130, "ข้าวขาหมู", R.mipmap.ic_launcher).speech("ฉันต้องการกินข้าวขาหมู"),
                    new ItemDao(100100131, "ข้าวคลุกกะปิ", R.mipmap.want_eat_main_kaokookkapi).speech("ฉันต้องการกินข้าวคลุกกะปิ"),
                    new ItemDao(100100132, "ข้าวไก่ย่าง", R.mipmap.want_eat_main_kaokaiyang).speech("ฉันต้องการกินข้าวไก่ย่าง"),
                    new ItemDao(100100133, "ข้าวมันไก่", R.mipmap.want_eat_main_kaomunkai).speech("ฉันต้องการกินข้าวมันไก่"),
                    new ItemDao(100100134, "ข้าวผัดหมู", R.mipmap.ic_launcher).speech("ฉันต้องการกินข้าวผัดหมู"),
                    new ItemDao(100100135, "ข้าวหน้าเป็ด", R.mipmap.want_eat_main_kaonhaped).speech("ฉันต้องการกินข้าวหน้าเป็ด"),
                    new ItemDao(100100136, "ข้าวผัดปู", R.mipmap.ic_launcher).speech("ฉันต้องการกินข้าวผัดปู"),
                    new ItemDao(100100137, "ข้าวผัดกุ้ง", R.mipmap.want_eat_main_kaopudkung).speech("ฉันต้องการกินข้าวผัดกุ้ง"),
                    new ItemDao(100100138, "ข้าวผัดแกงเขียวหวาน", R.mipmap.want_eat_main_kaopudkangkeawwan).speech("ฉันต้องการกินข้าวแกงผัดเขียวหวาน"),
                    new ItemDao(100100139, "ข้าวผัดสับปะรด", R.mipmap.want_eat_main_kaopudsubparod).speech("ฉันต้องการกินข้าวผัดสับปะรด"),
                    new ItemDao(100100140, "ข้าวราดกะเพรา", R.mipmap.want_eat_main_kaoradkrapaokaidao).speech("ฉันต้องการกินข้าวราดกะเพรา"),
                    new ItemDao(100100141, "ข้าวหมูทอดราดไข่", R.mipmap.want_eat_main_kaomootodradkai).speech("ฉันต้องการกินข้าวหมูทอดราดไข่"),
                    new ItemDao(100100142, "ข้าวหน้าหมูซีอิ๊ว", R.mipmap.want_eat_main_kaonhamooseaew).speech("ฉันต้องการกินข้าวหน้าหมูซีอิ๊ว"),
                    new ItemDao(100100143, "ข้าวหน้าแกงกะหรี่หมูทอด", R.mipmap.want_eat_main_kaonhakangkarimhutod).speech("ฉันต้องการกินข้าวหน้าแกงกะหรี่หมูทอด"),
                    new ItemDao(100100144, "ข้าวหน้าปลาดิบรวม", R.mipmap.want_eat_main_kaonhapladib).speech("ฉันต้องการกินข้าวหน้าปลาดิบรวม"),
                    new ItemDao(100100145, "ข้าวหน้าปลาไหล", R.mipmap.want_eat_main_kaonhaplalai).speech("ฉันต้องการกินข้าวหน้าปลาไหล"),
                    new ItemDao(100100146, "ข้าวต้มปลา", R.mipmap.ic_launcher).speech("ฉันต้องการกินข้าวต้มปลา"),
                    new ItemDao(100100147, "ข้าวหน้าปลาแซลมอน", R.mipmap.want_eat_main_kaonhasalmon).speech("ฉันต้องการกินข้าวหน้าปลาแซลมอน"),
                    new ItemDao(100100148, "ข้าวต้มหมูสับ", R.mipmap.want_eat_main_kaotommoo).speech("ฉันต้องการกินข้าวต้มหมูสับ"),
                    new ItemDao(100100149, "โจ๊ก", R.mipmap.want_eat_main_joke).speech("ฉันต้องการกินโจ๊ก"),
                    new ItemDao(100100150, "ซาซิมิ หรือปลาดิบ", R.mipmap.want_eat_main_sashimi).speech("ฉันต้องการกินซาซิมิ หรือปลาดิบ"),
                    new ItemDao(100100151, "ซูชิ", R.mipmap.want_eat_main_sushi).speech("ฉันต้องการกินซูชิ"),
                    new ItemDao(100100152, null, null),
                    new ItemDao(100100153, "ซีฟู้ดเย็น", R.mipmap.want_eat_main_seafoodyen).speech("ฉันต้องการกินซีฟู้ดเย็น"),
                    new ItemDao(100100154, null, null),});

            dataSub.put(1001002,new ItemDao[]{

                    new ItemDao(100100201, null, null),});


            dataSub.put(1001006,new ItemDao[]{
                    new ItemDao(100100601, "บัวลอย", R.mipmap.want_eat_sweet_bualoy).speech("ฉันต้องการกินบัวลอย"),
                    new ItemDao(100100602, "เฉาก๊วย", R.mipmap.want_eat_sweet_chaokuay).speech("ฉันต้องการกินเฉาก๊วย"),
                    new ItemDao(100100603, "ขนมกล้วย", R.mipmap.want_eat_sweet_kanomkuy).speech("ฉันต้องการกินขนมกล้วย"),
                    new ItemDao(100100604, "ขนมถ้วย", R.mipmap.want_eat_sweet_kanomtuy).speech("ฉันต้องการกินขนมถ้วย"),
                    new ItemDao(100100605, "ข้าวเหนียวมะม่วง", R.mipmap.want_eat_sweet_kaoneawmamuang).speech("ฉันต้องการกินข้าวเหนียวมะม่วง"),
                    new ItemDao(100100606, "กล้วยบวดชี", R.mipmap.want_eat_sweet_kuybuadchee).speech("ฉันต้องการกินกล้วยบวดชี"),
                    new ItemDao(100100607, "ลอดช่อง", R.mipmap.want_eat_sweet_lodchong).speech("ฉันต้องการกินลอดช่อง"),
                    new ItemDao(100100608, "แตงไทยกะทิ", R.mipmap.want_eat_sweet_melonkati).speech("ฉันต้องการกินแตงไทยกะทิ"),
                    new ItemDao(100100609, "รวมมิตร", R.mipmap.want_eat_sweet_mixedthaidessert).speech("ฉันต้องการกินรวมมิตร"),
                    new ItemDao(100100610, "ซ่าหริ่ม", R.mipmap.want_eat_sweet_salim).speech("ฉันต้องการกินซ่าหริ่ม"),
                    new ItemDao(100100611, "บวดเผือก", R.mipmap.want_eat_sweet_tarobuad).speech("ฉันต้องการกินบวดเผือก"),
                    new ItemDao(100100612, "ถั่วเขียว", R.mipmap.want_eat_sweet_tuakeaw).speech("ฉันต้องการกินถั่วเขียว"),
                    new ItemDao(100100613, "ทับทิมกรอบ", R.mipmap.want_eat_sweet_tubtimkrob).speech("ฉันต้องการกินทับทิมกรอบ"),
                    new ItemDao(100100614, null, null),
                    new ItemDao(100100615, null, null),
                    new ItemDao(100100616, null, null),});


            dataSub.put(1001008,new ItemDao[]{
                    new ItemDao(100100801, "แอปเปิ้ล", R.mipmap.want_eat_fruit_apple).speech("ฉันต้องการกินแอปเปิ้ล"),
                    new ItemDao(100100802, "แคนตาลูป", R.mipmap.want_eat_fruit_cantaloop).speech("ฉันต้องการกินแคนตาลูป"),
                    new ItemDao(100100803, "ชมพู่", R.mipmap.want_eat_fruit_chompoo).speech("ฉันต้องการกินชมพู่"),
                    new ItemDao(100100804, "แก้วมังกร", R.mipmap.want_eat_fruit_dragonfruit).speech("ฉันต้องการกินแก้วมังกร"),
                    new ItemDao(100100805, "ทุเรียน", R.mipmap.want_eat_fruit_durian).speech("ฉันต้องการกินทุเรียน"),
                    new ItemDao(100100806, "ฝรั่ง", R.mipmap.want_eat_fruit_farang).speech("ฉันต้องการกินฝรั่ง"),
                    new ItemDao(100100807, "ฟักทอง", R.mipmap.want_eat_fruit_fucktong).speech("ฉันต้องการกินฟักทอง"),
                    new ItemDao(100100808, "องุ่น", R.mipmap.want_eat_fruit_grape).speech("ฉันต้องการกินองุ่น"),
                    new ItemDao(100100809, "ขนุน", R.mipmap.want_eat_fruit_kanun).speech("ฉันต้องการกินขนุน"),
                    new ItemDao(100100810, "กล้วย", R.mipmap.want_eat_fruit_kuy).speech("ฉันต้องการกินกล้วย"),
                    new ItemDao(100100811, "ลำไย", R.mipmap.want_eat_fruit_lamyai).speech("ฉันต้องการกินลำไย"),
                    new ItemDao(100100812, "ลิ้นจี่", R.mipmap.want_eat_fruit_linji).speech("ฉันต้องการกินลิ้นจี่"),
                    new ItemDao(100100813, "ลองกอง", R.mipmap.want_eat_fruit_longgong).speech("ฉันต้องการกินลองกอง"),
                    new ItemDao(100100814, "มะละกอ", R.mipmap.want_eat_fruit_malako).speech("ฉันต้องการกินมะละกอ"),
                    new ItemDao(100100815, "มะม่วง", R.mipmap.want_eat_fruit_mango).speech("ฉันต้องการกินมะม่วง"),
                    new ItemDao(100100816, "มังคุด", R.mipmap.want_eat_fruit_mungkud).speech("ฉันต้องการกินมังคุด"),
                    new ItemDao(100100817, "เงาะ", R.mipmap.want_eat_fruit_ngo).speech("ฉันต้องการกินเงาะ"),
                    new ItemDao(100100818, "น้อยหน่า", R.mipmap.want_eat_fruit_nhoina).speech("ฉันต้องการกินน้อยหน่า"),
                    new ItemDao(100100819, "สับปะรด", R.mipmap.want_eat_fruit_pineapple).speech("ฉันต้องการกินสับปะรด"),
                    new ItemDao(100100820, "ส้ม", R.mipmap.want_eat_fruit_som).speech("ฉันต้องการกินส้ม"),
                    new ItemDao(100100821, "สตรอเบอร์รี่", R.mipmap.want_eat_fruit_strawberry).speech("ฉันต้องการกินสตรอเบอร์รี่"),
                    new ItemDao(100100822, "มะขาม", R.mipmap.want_eat_fruit_tamarind).speech("ฉันต้องการกินมะขาม"),
                    new ItemDao(100100823, "แตงโม", R.mipmap.want_eat_fruit_tangmo).speech("ฉันต้องการกินแตงโม"),
                    new ItemDao(100100824, "เผือก", R.mipmap.want_eat_fruit_taro).speech("ฉันต้องการกินเผือก"),});


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
                    new ItemDao(100300311, "น้ำส้ม", R.mipmap.want_drink_cold_namsom).speech("ฉันต้องการดื่มน้ำส้ม"),
                    new ItemDao(100300312, "นมเย็น", R.mipmap.want_drink_cold_nomyen).speech("ฉันต้องการดื่มนมเย็น"),
                    new ItemDao(100300313, "โอเลี้ยง", R.mipmap.want_drink_cold_oleang).speech("ฉันต้องการดื่มโอเลี้ยง"),
                    new ItemDao(100300314, null, null),
                    new ItemDao(100300315, "ชาเย็น", R.mipmap.want_drink_cold_chayen).speech("ฉันต้องการดื่มชาเย็น"),
                    new ItemDao(100300316, null, null),});

        dataSub.put(1002,new ItemDao[]{
                new ItemDao(100201, "โรงพยาบาล", R.mipmap.want_go_hospital).speech("ฉันต้องการไปโรงพยาบาล"),
                new ItemDao(100202, "ห้างสรรพสินค้า", R.mipmap.want_go_mall).speech("ฉันต้องการไปห้างสรรพสินค้า"),
                new ItemDao(100203, "ตลาด", R.mipmap.want_go_market).speech("ฉันต้องการไปตลาด"),
                new ItemDao(100204, "สวนสาธารณะ", R.mipmap.want_go_park).speech("ฉันต้องการไปสวนสาธารณะ"),
                new ItemDao(100205, "เซเว่น", R.mipmap.want_go_seven).speech("ฉันต้องการไปเซเว่น"),
                new ItemDao(100206, null, null),
                new ItemDao(100207, "วัด", R.mipmap.want_go_temple).speech("ฉันต้องการไปวัด"),
                new ItemDao(100208, null, null),});
    }


}
