package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.ItemDao;
import com.newaphasiatalkhelper.newaphasiatalkhelper.helpers.Speaker;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.FeelListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.ListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.WantListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.views.ItemImage;

public class ItemActivity extends AppCompatActivity {

    ListModel model;
    View speak;
    TextView title;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        speak = findViewById(R.id.btn_speech);
        title = (TextView) findViewById(R.id.item_text);
        img = (ImageView) findViewById(R.id.item_image);

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


        final ItemDao item = subId>0? model.getsub(subId, index): model.get(index);

        title.setText(item.speech);
        img.setImageDrawable(getResources().getDrawable(item.icon));

        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Speaker.speak(item.speech, ItemActivity.this);
            }
        });
    }
}
