package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.views.ItemImage;

public class SelectItemActivity extends BaseActivity {

    RecyclerView rvtest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_select_item);
        setContentView(R.layout.test_recycleview);
        //Callfunction
        initToolbar();

        rvtest = (RecyclerView) findViewById(R.id.rv_test);
        GridLayoutManager grid = new GridLayoutManager(this,2, LinearLayoutManager.HORIZONTAL,false);
        rvtest.setLayoutManager(grid);
        rvtest.setAdapter(new MyRecycleAdapter());
    }
    class MyRecycleAdapter extends RecyclerView.Adapter <MyRecycleAdapter.MyViewHolder>{

        String[] data = {"ดื่ม", "กิน", "สระผม", "ฟังเพลง", "กินยา","ออกกำลังกาย"
        };

        int[] dataImg = {
                R.mipmap.drink_female,
                R.mipmap.eat_female,
                R.mipmap.hairwash_female,
                R.mipmap.listenmusic_female,
                R.mipmap.medicine,
                R.mipmap.exercise_female
        };

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rootView = inflater.inflate(R.layout.box_item, parent, false);
            return new MyViewHolder(rootView);



        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.item.setItemText(data[position]);
            holder.item.setItemImage(getResources().getDrawable(dataImg[position]));
        }

        @Override
        public int getItemCount() {
            return data.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder{

            ItemImage item;
            public MyViewHolder(View itemView) {
                super(itemView);
                item = (ItemImage) itemView.findViewById(R.id.i_item);
            }
        }

    }
}
