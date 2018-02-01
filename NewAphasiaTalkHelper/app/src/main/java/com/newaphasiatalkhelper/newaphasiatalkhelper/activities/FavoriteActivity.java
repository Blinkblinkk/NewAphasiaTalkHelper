package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.FavoriteDao;
import com.newaphasiatalkhelper.newaphasiatalkhelper.models.FavoriteModel;

public class FavoriteActivity extends BaseActivity {

    RecyclerView favList;
    FavoriteModel favoriteModel = new FavoriteModel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        //Call function Toolbar
        initToolbar();

        favList = (RecyclerView) findViewById(R.id.fav_list);
        favList.setAdapter(new MyRecycleAdapter());
        favList.setLayoutManager(new LinearLayoutManager(this));
    }

    class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder> {


        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater= (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rootview = inflater.inflate(R.layout.view_fav_sentence,parent,false);
            return new MyViewHolder(rootview);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            FavoriteDao item = favoriteModel.getAll()[position];
            holder.sentence.setText(item.sentence);
        }

        @Override
        public int getItemCount() {
            return favoriteModel.getAll().length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder{

            View btnRemove, btnSpeech;
            TextView sentence;

            public MyViewHolder(View favSentence) {

                super(favSentence);
                btnRemove = favSentence.findViewById(R.id.btn_remove);
                btnSpeech = favSentence.findViewById(R.id.btn_speech);
                sentence = (TextView) favSentence.findViewById(R.id.sentence);

                /*btnRemove.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });

                btnSpeech.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });*/
            }
        }
    }
}
