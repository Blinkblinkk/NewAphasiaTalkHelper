package com.newaphasiatalkhelper.newaphasiatalkhelper.views;

import android.content.Context;
import android.os.Build;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;

/**
 * Created by Tum on 9/24/2017 AD.
 */

public class ItemImage extends FrameLayout {

    ImageView imageView;
    TextView textView;

    public ItemImage(@NonNull Context context) {
        super(context);
        init();
    }


    public ItemImage(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ItemImage(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ItemImage(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
//เอามาแปะ
    private void init (){
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layoutInflater.inflate(R.layout.view_item_image,this);
        imageView = (ImageView) findViewById(R.id.item_image);
        textView = (TextView) findViewById(R.id.item_text);
    }

    public void setItemText(String str){
        textView.setText(str);
    }
}
