package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.ItemDao;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.WantListModel;
import com.newaphasiatalkhelper.newaphasiatalkhelper.views.ItemImage;

public class SelectItemActivity extends BaseActivity {

    RecyclerView rvtest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_item);

        //Callfunction
        initToolbar();

        rvtest = (RecyclerView) findViewById(R.id.rv_test);
        GridLayoutManager grid = new GridLayoutManager(this,2, LinearLayoutManager.HORIZONTAL,false);
        rvtest.setLayoutManager(grid);
        rvtest.setAdapter(new MyRecycleAdapter());

    }
    class MyRecycleAdapter extends RecyclerView.Adapter <MyRecycleAdapter.MyViewHolder>{

        ItemDao[] data;
        WantListModel model;

        public MyRecycleAdapter(){
            model = new WantListModel(SelectItemActivity.this);
            data = model.getAll();
        }





        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rootView = inflater.inflate(R.layout.box_item, parent, false);

            return new MyViewHolder(rootView);



        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.item.setItemText(data[position].title);
            holder.item.setItemImage(getResources().getDrawable(data[position].icon));
            holder.item.setBgColor((position-1)%4==0 || (position-2)%4==0 ? 1 : 3);
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

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        model.IncrementFrequency(data[getAdapterPosition()]);
                        Toast.makeText(SelectItemActivity.this,"Item selected !!" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }

    }
}
