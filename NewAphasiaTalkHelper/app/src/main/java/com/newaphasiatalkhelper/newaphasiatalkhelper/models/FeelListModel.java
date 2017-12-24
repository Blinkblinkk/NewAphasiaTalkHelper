package com.newaphasiatalkhelper.newaphasiatalkhelper.models;

import android.content.Context;

import com.newaphasiatalkhelper.newaphasiatalkhelper.MainApplication;
import com.newaphasiatalkhelper.newaphasiatalkhelper.R;
import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.ItemDao;

/**
 * Created by Tum on 11/19/2017 AD.
 */

public class FeelListModel extends ListModel{

    private static FeelListModel instance;

    public FeelListModel(Context context) {
        super(context);
    }

    public static FeelListModel getInstance(){
        if (instance==null){
            instance = new FeelListModel(MainApplication.context);
        }
        return instance;
    }


    {
        data = new ItemDao[]{
                new ItemDao(1, "หิว", R.mipmap.want_eat),
                new ItemDao(2, "ปวด", R.mipmap.want_go),
                new ItemDao(3, "ปวดอึ", R.mipmap.want_drink),
                new ItemDao(4, "นอน", R.mipmap.want_sleep),
        };

    }


}
