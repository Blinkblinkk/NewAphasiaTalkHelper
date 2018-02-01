package com.newaphasiatalkhelper.newaphasiatalkhelper.models;

import com.newaphasiatalkhelper.newaphasiatalkhelper.dao.FavoriteDao;

/**
 * Created by blinkblinkk on 1/2/2018 AD.
 */

public class FavoriteModel {

    public FavoriteDao[] getAll(){


        return new FavoriteDao[]{
               new FavoriteDao("ใช่", 1, 1),
                new FavoriteDao("ไม่ใช่", 2, 2)
        };

    }
}
