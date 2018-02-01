package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.helpers.Speaker;

public class TypeTextActivity extends BaseActivity {

    View btnClear, btnSpeech, btnHome;
    EditText etType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_text);
        initToolbar();

        btnClear = findViewById(R.id.btn_clear);
        btnSpeech = findViewById(R.id.btn_speech);
        btnHome = findViewById(R.id.btn_home);
        etType = (EditText) findViewById(R.id.et_type);



        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etType.setText("");
            }
        });

       btnHome.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });

       btnSpeech.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String tts = etType.getText().toString();
               Speaker.speak(tts);
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
