package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
//com.geeksongs.topview2是依赖库的包名
public class TopView extends RelativeLayout {

    // 返回按钮控件
    private ImageView top_left;
    // 标题Tv
    private TextView top_title;

    private TextView top_right;

    public TopView(Context context) {
        super(context);



}
    public TopView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // 加载布局
        LayoutInflater.from(context).inflate(R.layout.view_top, this);
        // 获取控件
        top_left = (ImageView) findViewById(R.id.top_left);
        top_title = (TextView) findViewById(R.id.top_title);
        top_right = (TextView) findViewById(R.id.top_right);
    }

}
