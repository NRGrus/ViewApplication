package com.example.ruslan.viewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        TextView textView1 = new TextView(this);
        textView1.setBackgroundColor(0xFFBDBDBD);
        textView1.setText("Zhumabek Ruslan");
        textView1.setTextSize(26);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 200);

        layoutParams.setMargins(30, 40, 50, 60);
        textView1.setLayoutParams(layoutParams);
        textView1.setPadding(30, 30, 30, 30);
        relativeLayout.addView(textView1);

        setContentView(relativeLayout);
//        setContentView(R.layout.fourth_layout);
    }


//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
//        RelativeLayout relativeLayout = new RelativeLayout(this);
//        TextView textView1 = new TextView(this);
//        textView1.setText("Zhumabek Ruslan");
//        textView1.setTextSize(26);
//
//        textView1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//
//        relativeLayout.addView(textView1);
//        setContentView(relativeLayout);
//
////        setContentView(R.layout.third_layout);
//    }


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // устанавливаем в качестве интерфейса файл second_layout.xml
//        setContentView(R.layout.second_layout);
//
//        // получаем элемент textView
//        TextView textView = (TextView) findViewById(R.id.header);
//        // переустанавливаем у него текст
//        textView.setText("Hello Android 7!");


        /*// создание TextView
        TextView textView = new TextView(this);
        // установка текста в TextView
        textView.setText("Hello World!");
        // установка высоты текста
        textView.setTextSize(22);
        // установка визуального интерфейса для activity
        setContentView(textView);*/
//    }
}
