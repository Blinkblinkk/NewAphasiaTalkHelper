package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.FavoriteDao;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.ItemDao;
import com.newaphasiatalkhelper.newaphasiatalkhelper.helpers.Speaker;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.FavoriteModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.FeelListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.ListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.WantListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.views.ItemImage;

public class ItemActivity extends AppCompatActivity {

    LinearLayout mainLayout;
    ListModel model;
    View speak, btnHome;
    TextView title;
    ImageView img,addFav;
    FavoriteModel favoriteModel;
    boolean isFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        favoriteModel = new FavoriteModel(this);
        speak = findViewById(R.id.btn_speech);
        addFav = (ImageView) findViewById(R.id.btn_add_fav);
        title = (TextView) findViewById(R.id.item_text);
        img = (ImageView) findViewById(R.id.item_image);
        btnHome = findViewById(R.id.btn_home);
        mainLayout = (LinearLayout) findViewById(R.id.main_layout);

        int index = getIntent().getIntExtra("index", -1);
        int subId = getIntent().getIntExtra("subId", -1);

        String type = getIntent().getStringExtra("type");

        if(index==-1){
            finish();
        }

        if("want".equals(type)){
            model = WantListModel.getInstance();
            mainLayout.setBackgroundResource(R.color.bg_want);
        }
        else if("feel".equals(type)){
            model = FeelListModel.getInstance();
            mainLayout.setBackgroundResource(R.color.bg_feel);
        }


        final ItemDao item = subId>0? model.getsub(subId, index): model.get(index);

        title.setText(item.speech);
        img.setImageDrawable(getResources().getDrawable(item.icon));
        FavoriteDao dao = favoriteModel.search(item.speech);
        if(dao == null){
            isFav = false;
            addFav.setImageDrawable(getResources().getDrawable(R.mipmap.icon_btnrepeat));
        }
        else{
            isFav = true;
            addFav.setImageDrawable(getResources().getDrawable(R.mipmap.icon_btnhome));
        }
        addFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FavoriteDao dao = favoriteModel.search(item.speech);
                if(isFav){
                    favoriteModel.remove(dao.id);
                    addFav.setImageDrawable(getResources().getDrawable(R.mipmap.icon_btnrepeat));
                    Toast.makeText(ItemActivity.this,"ลบออกจากรายการโปรดเรียบร้อย" , Toast.LENGTH_SHORT).show();
                }
                else{
                    favoriteModel.add(item.speech);
                    addFav.setImageDrawable(getResources().getDrawable(R.mipmap.icon_btnhome));
                    Toast.makeText(ItemActivity.this,"เพิ่มไปยังรายการโปรดเรียบร้อย" , Toast.LENGTH_SHORT).show();
                }
                isFav=!isFav;
            }
        });

        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speaker.speak(item.speech);
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speaker.speak("หน้าหลัก");
                Intent intent = new Intent(ItemActivity.this, MainActivity.class);
                intent.putExtra("loading",0);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Speaker.onStart(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Speaker.onStop();
    }
}
