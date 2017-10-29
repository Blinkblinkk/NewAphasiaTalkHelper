package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.views.ItemImage;

public class SelectItemActivity extends BaseActivity {

    ListView lvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_select_item);
        setContentView(R.layout.test_listview);
        //Callfunction
        initToolbar();

        lvTest = (ListView) findViewById(R.id.lv_test);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,texts);
        MyAdapter adapter = new MyAdapter(this);

        lvTest.setAdapter(adapter);
    }
}

 class MyAdapter extends ArrayAdapter{

     String[] texts = {"a", "b", "c", "d", "e","f", "g", "h", "i", "j",
             "a", "b", "c", "d", "e","f", "g", "h", "i", "j"
     };

     public MyAdapter(@NonNull Context context) {
         super(context, -1);
     }

     @Override
     public int getCount() {
         return texts.length;
     }

     @NonNull
     @Override
     public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         View rootView;
         if(convertView == null){
             rootView = inflater.inflate(R.layout.test_item, parent, false);
         }
         else {
             rootView = convertView;
         }

         ItemImage item = (ItemImage) rootView.findViewById(R.id.i_item);
         item.setItemText("data is "+ texts[position]);
         return  rootView;
     }
 }