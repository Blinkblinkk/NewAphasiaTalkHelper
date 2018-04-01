package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.FirebaseModel;

public class UserHome extends BaseActivity {
    FirebaseModel fb;
    Spinner symptom;
    LinearLayout symptomOther;
    View save;
    EditText firstname, surname,nickname,age,gender,symptomother,email,telephone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fb = new FirebaseModel(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        initToolbar();
        hideUserProfileIcon();
        fb.userhomeActivity();
        symptom = (Spinner) findViewById(R.id.symptom);
        symptomOther = (LinearLayout) findViewById(R.id.symptom_other);
        save = findViewById(R.id.btnsave);

        firstname = (EditText) findViewById(R.id.firstname);
        surname = (EditText) findViewById(R.id.surname);
        nickname = (EditText) findViewById(R.id.nickname);
        age = (EditText) findViewById(R.id.age);
        gender = (EditText) findViewById(R.id.gender);
        symptomother = (EditText) findViewById(R.id.symptomother);
        email = (EditText) findViewById(R.id.email);
        telephone = (EditText) findViewById(R.id.telephone);



        SharedPreferences pref = getSharedPreferences("user_info", MODE_PRIVATE);
        firstname.setText(pref.getString("user-firstname", ""));
        surname.setText(pref.getString("user-surname",""));
        nickname.setText(pref.getString("user-nickname",""));
        age.setText(pref.getString("user-age",""));
        gender.setText(pref.getString("user-gender",""));
        symptomother.setText(pref.getString("user-symptomother",""));
        email.setText(pref.getString("carer-email",""));
        telephone.setText(pref.getString("carer-telephone",""));

        symptom.setSelection(pref.getInt("user-sypmtom",0));

        if(pref.getInt("user-sypmtom",0) == 8){
            symptomOther.setVisibility(View.VISIBLE);
        }
        else{
            symptomOther.setVisibility(View.GONE);
        }

        symptom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 8 ){
                    symptomOther.setVisibility(View.VISIBLE);
                }
                else symptomOther.setVisibility(View.GONE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=getSharedPreferences("user_info", MODE_PRIVATE).edit();
                editor.putString("user-firstname",firstname.getText().toString());
                editor.putString("user-surname",surname.getText().toString());
                editor.putString("user-nickname",nickname.getText().toString());
                editor.putString("user-age",age.getText().toString());
                editor.putString("user-gender",gender.getText().toString());
                editor.putString("user-sypmtomother",symptomother.getText().toString());
                editor.putString("carer-email",email.getText().toString());
                editor.putString("carer-telephone",telephone.getText().toString());
                editor.putInt("user-symptom", symptom.getSelectedItemPosition());

                editor.commit();
                new AlertDialog.Builder(UserHome.this)
                        .setTitle("บันทึกเรียบร้อย!")
                        .setMessage("ข้อมูลของคุณถูกบันทึกเรียบร้อยแล้ว")
                        .show();
            }
        });
    }
}
