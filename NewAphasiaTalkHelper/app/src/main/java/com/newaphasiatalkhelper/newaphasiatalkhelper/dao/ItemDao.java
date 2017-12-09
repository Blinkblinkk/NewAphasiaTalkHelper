package com.newaphasiatalkhelper.newaphasiatalkhelper.dao;

import android.support.annotation.NonNull;

/**
 * Created by Tum on 11/19/2017 AD.
 */

public class ItemDao implements Comparable<ItemDao>{

    public static final int NO_IMG = -1;
    public int id;
    public String title;
    public Integer icon;
    public int freq;
    public Integer subId = null;

    public ItemDao() {

    }

    public ItemDao(int id, String title, Integer icon) {
        this.id = id;
        this.title = title;
        this.icon = icon;
        freq = 0;
    }

    public ItemDao(int id, String title, Integer icon, int subId) {
        this.id = id;
        this.title = title;
        this.icon = icon;
        freq =0;
        this.subId = subId;
    }

    @Override
    public int compareTo(@NonNull ItemDao o) {
        return -(freq - o.freq);
    }
}
