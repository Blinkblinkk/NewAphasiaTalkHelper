package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.ItemDao;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.WantListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.views.ItemImage;

public class ItemActivity extends AppCompatActivity {

    ItemImage itemImage;
    WantListModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        int index = getIntent().getIntExtra("index", -1);
        if(index==-1){
            finish();
        }
          model = WantListModel.getInstance();
        ItemDao item = model.get(index);
        itemImage = (ItemImage) findViewById(R.id.item_img);
        itemImage.setItemText(item.title);
        itemImage.setItemImage(getResources().getDrawable(item.icon));
    }
}
