package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.content.Context;
import android.graphics.drawable.Drawable;
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

    RecyclerView rvBoxItem;
    View btnPrev, btnNext;
    WantListModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_item);

        //Callfunction
        initToolbar();
        model = new WantListModel(SelectItemActivity.this);

        rvBoxItem = (RecyclerView) findViewById(R.id.rv_test);
        btnPrev = findViewById(R.id.btn_prev);
        btnNext = findViewById(R.id.btn_next);
        GridLayoutManager grid = new GridLayoutManager(this,2, LinearLayoutManager.HORIZONTAL,false);
        rvBoxItem.setLayoutManager(grid);
        rvBoxItem.setAdapter(new MyRecycleAdapter());
        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCurrentPage(getCurrentPage()-1, false);

            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCurrentPage(getCurrentPage()+1, true);

            }
        });
        adjustPrevNextVisible();
    }
    private void adjustPrevNextVisible(){
        btnPrev.setVisibility(getCurrentPage()>0? View.VISIBLE : View.GONE);
        btnNext.setVisibility(getCurrentPage()<getTotalPage()-1? View.VISIBLE : View.GONE);
    }

    private void  setCurrentPage(int page, boolean next){
        rvBoxItem.smoothScrollToPosition(page*4+(next? 2:0));
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            adjustPrevNextVisible();
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private int getCurrentPage(){
        return ((GridLayoutManager) rvBoxItem.getLayoutManager()).findFirstVisibleItemPosition()/4;
    }

    private  int getTotalPage(){
        return (int) Math.ceil(model.getAll().length/4);
    }
    class MyRecycleAdapter extends RecyclerView.Adapter <MyRecycleAdapter.MyViewHolder>{

        ItemDao[] data;


        public MyRecycleAdapter(){
            data = model.getAll();
        }





        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rootView = inflater.inflate(R.layout.box_item, parent, false);

            return new MyViewHolder(rootView);

        }

        private Drawable getImage(Integer scr){
            return  scr == null? null : getResources().getDrawable(scr);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.item.setItemText(data[position].title);
            holder.item.setItemImage(getImage(data[position].icon));
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
