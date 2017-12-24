package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.ItemDao;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.FeelListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.ListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.WantListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.views.ItemImage;

public class ItemActivity extends AppCompatActivity {

    ItemImage itemImage;
    ListModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        int index = getIntent().getIntExtra("index", -1);
        int subId = getIntent().getIntExtra("subId", -1);

        String type = getIntent().getStringExtra("type");

        if(index==-1){
            finish();
        }

        if("want".equals(type)){
            model = WantListModel.getInstance();
        }
        else if("feel".equals(type)){
            model = FeelListModel.getInstance();
        }


        ItemDao item = subId>0? model.getsub(subId, index): model.get(index);

        itemImage = (ItemImage) findViewById(R.id.item_img);
        itemImage.setItemText(item.title);
        itemImage.setItemImage(getResources().getDrawable(item.icon));
    }
}
