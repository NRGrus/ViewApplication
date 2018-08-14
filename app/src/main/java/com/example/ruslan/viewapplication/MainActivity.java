package com.example.ruslan.viewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.constraint_layout);
//        setContentView(R.layout.grid_layout);
    }

//    protected void onCreate (Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        FrameLayout frameLayout = new FrameLayout(this);
//        TextView textView1 = new TextView(this);
//        textView1.setText("Hello World!");
//
//        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
//                FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT
//        );
//
//        layoutParams.gravity = Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM;
//
//        textView1.setLayoutParams(layoutParams);
//        textView1.setTextSize(26);
//        frameLayout.addView(textView1);
//
//        setContentView(frameLayout);
////        setContentView(R.layout.frame_layout);
//
////        setContentView(R.layout.eighth_layout);
//    }

//    protected void onCreate (Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        LinearLayout linearLayout = new LinearLayout(this);
//        TextView textView = new TextView(this);
//        textView.setText("Hello Android 7");
//        textView.setTextSize(22);
//        textView.setBackgroundColor(0xffe8eaf6);
//
//        textView.setGravity(Gravity.CENTER);
//
//        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT, 200
//        );
//
//        layoutParams.gravity = Gravity.CENTER;
//        textView.setLayoutParams(layoutParams);
//
//        linearLayout.addView(textView);
//        setContentView(linearLayout);
//
//
////        setContentView(R.layout.seventh_layout);
//    }


//    protected void onCreate (Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        RelativeLayout relativeLayout = new RelativeLayout(this);
//
//        EditText editText = new EditText(this);
//        editText.setId('1');
//
//        Button button = new Button(this);
//        button.setText("SEND");
//
//        RelativeLayout.LayoutParams editTextParams = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.MATCH_PARENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
//        editTextParams.addRule(RelativeLayout.CENTER_IN_PARENT);
//        relativeLayout.addView(editText, editTextParams);
//
//
//        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
//        );
//        buttonParams.addRule(RelativeLayout.BELOW, editText.getId());
//        buttonParams.addRule(RelativeLayout.ALIGN_RIGHT, editText.getId());
//        relativeLayout.addView(button, buttonParams);
//
//        setContentView(relativeLayout);
//
////        setContentView(R.layout.sixth_layout);
//    }
//    protected void onCreate (Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        LinearLayout linearLayout = new LinearLayout(this);
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//        TextView textView1 = new TextView(this);
//        textView1.setText("Hello");
//        linearLayout.addView(textView1, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//r
//        TextView textView2 = new TextView(this);
//        textView2.setText("Ruslan");
//        linearLayout.addView(textView2, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//
//        setContentView(linearLayout);
////        setContentView(R.layout.fifth_layout);
//    }

//    protected void onCreate (Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        RelativeLayout relativeLayout = new RelativeLayout(this);
//        TextView textView1 = new TextView(this);
//        textView1.setBackgroundColor(0xFFBDBDBD);
//        textView1.setText("Zhumabek Ruslan");
//        textView1.setTextSize(26);
//
//        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT, 200);
//
//        layoutParams.setMargins(30, 40, 50, 60);
//        textView1.setLayoutParams(layoutParams);
//        textView1.setPadding(30, 30, 30, 30);
//        relativeLayout.addView(textView1);
//
//        setContentView(relativeLayout);
////        setContentView(R.layout.fourth_layout);
//    }


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
