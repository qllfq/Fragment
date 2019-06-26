package com.example.qiaolulu.qiaofragment;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class BabyLayout extends LinearLayout {
    private int normalIcon;
    private int focusedIcon;
    private boolean isFocused;
    private ImageView ivIcon;

    public BabyLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.babyclick,this);
        ivIcon = findViewById(R.id.bottom_icon);


    }

    public void setNormalImage(int normalIcon){
        this.normalIcon = normalIcon;
        ivIcon.setImageResource(normalIcon);

    }
    public void setFocusedImage(int focusedIcon){
        this.focusedIcon = focusedIcon;

    }

    public void setFocused(boolean isFocused){
        this.isFocused = isFocused;
        if(isFocused){
            ivIcon.setImageResource(focusedIcon);

        }else{
            ivIcon.setImageResource(normalIcon);

        }
    }

}

