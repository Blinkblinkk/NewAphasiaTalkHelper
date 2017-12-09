package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.views.ItemImage;

public class ItemActivity extends AppCompatActivity {

    ItemImage itemImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        itemImage = (ItemImage) findViewById(R.id.item_img);
        itemImage.setItemText("test");
        itemImage.setItemImage(getResources().getDrawable(R.mipmap.feel_happy));
    }
}
