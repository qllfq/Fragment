package com.example.qiaolulu.qiaofragment;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author:qiaolulu
 * @date:2019/06/26
 * @function:自定义底部导航栏布局
 */
public class BottomLayout extends LinearLayout {
    private int normalIcon;
    private int focusedIcon;
    private boolean isFocused;
    private ImageView ivIcon;
    private TextView tvText;
    public BottomLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.bottom_layout,this);
        ivIcon = findViewById(R.id.bottom_icon);
        tvText = findViewById(R.id.bottom_text);

    }

    public void setNormalImage(int normalIcon){
        this.normalIcon = normalIcon;
        ivIcon.setImageResource(normalIcon);

    }
    public void setFocusedImage(int focusedIcon){
        this.focusedIcon = focusedIcon;

    }
    public void setTvText(String text){
        tvText.setText(text);
    }
    public void setFocused(boolean isFocused){
        this.isFocused = isFocused;
        if(isFocused){
            ivIcon.setImageResource(focusedIcon);
            tvText.setTextColor(Color.parseColor("#02b5bc"));
        }else{
            ivIcon.setImageResource(normalIcon);
            tvText.setTextColor(Color.BLACK);
        }
    }

}

