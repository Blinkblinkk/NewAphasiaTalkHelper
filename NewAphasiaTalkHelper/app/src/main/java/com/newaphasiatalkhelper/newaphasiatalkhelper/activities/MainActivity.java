package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.helpers.Speaker;

public class MainActivity extends BaseActivity {

    View viewIWant;
    View viewIFeel;
    View viewTypeText;
    View viewFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Call function
        initToolbar();


        viewIWant = findViewById(R.id.goto_i_want);
        viewIFeel = findViewById(R.id.goto_i_feel);
        viewTypeText = findViewById(R.id.goto_type_text);
        viewFav = findViewById(R.id.goto_fav);

        viewIWant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speaker.speak("ฉันต้องการ");
                Intent intent = new Intent(MainActivity.this, SelectItemActivity.class);
                intent.putExtra("type", "want");
                startActivity(intent);
            }
        });

        viewIFeel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speaker.speak("ฉันรู้สึก");
                Intent intent = new Intent(MainActivity.this, SelectItemActivity.class);
                intent.putExtra("type", "feel");
                startActivity(intent);
            }
        });

        viewTypeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speaker.speak("พิมพ์ข้อความ");
                Intent intent = new Intent(MainActivity.this, TypeTextActivity.class);
                startActivity(intent);
            }
        });

        viewFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speaker.speak("รายการโปรด");
                Intent intent = new Intent(MainActivity.this, FavoriteActivity.class);
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
