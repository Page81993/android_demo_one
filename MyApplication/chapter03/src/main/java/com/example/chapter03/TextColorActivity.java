package com.example.chapter03;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class TextColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color);
        //从布局文件中获取名叫tv_code_system的文本视图
        TextView tv_code_system =  findViewById(R.id.tv_code_system);
        //将tv_code_eight的文本颜色设置为系统自带的绿色
        tv_code_system.setTextColor(Color.GREEN);
        //从布局文件中获取名叫tv_code_eight的文本视图
        TextView tv_code_eight = findViewById(R.id.tv_code_eight);
        //将tv_code_eight的文本颜色设置为不透明的绿色
        tv_code_eight.setTextColor(0xff00ff00);
        //从布局文件中获取名叫tv_code_six的文本视图
        TextView tv_code_six = findViewById(R.id.tv_code_six);
        //将tv_code_six的文本颜色设置为透明的绿色
        tv_code_six.setTextColor(0x00ff00);
        //从布局文件中获取名叫tv_code_background的文本视图
        TextView tv_code_background = findViewById(R.id.tv_code_background);
        //将tv_code_background的背景颜色设置为绿色
//        tv_code_background.setBackgroundColor(Color.GREEN);
        tv_code_background.setBackgroundResource(R.color.green);
    }
}