package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.Manifest;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.helpers.Speaker;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.FirebaseModel;

public class MainActivity extends BaseActivity {

    View viewIWant;
    View viewIFeel;
    View viewTypeText;
    View viewFav;
    static boolean welcome = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Call function
        initToolbar();

        if (welcome) {

            startActivity(new Intent(this, WelcomeActivity.class));
            welcome = false;
        }

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE},1);
        }

        FirebaseModel fb = new FirebaseModel(this);
        fb.init();

        final boolean doLoading = getIntent().getIntExtra("loading", 1) == 1;

        final ProgressDialog p = ProgressDialog.show(this,"", "กรุณารอสักครู่",true);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(doLoading ? 1500 : 1);
                    p.dismiss();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


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
