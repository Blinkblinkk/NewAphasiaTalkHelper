package com.newaphasiatalkhelper.newaphasiatalkhelper.dao;

import android.support.annotation.NonNull;

/**
 * Created by Tum on 11/19/2017 AD.
 */

public class ItemDao implements Comparable<ItemDao>{
    public int id;
    public String title;
    public int icon;
    public int freq;

    public ItemDao() {

    }

    public ItemDao(int id, String title, int icon) {
        this.id = id;
        this.title = title;
        this.icon = icon;
        freq =0;
    }

    @Override
    public int compareTo(@NonNull ItemDao o) {
        return -(freq - o.freq);
    }
}
