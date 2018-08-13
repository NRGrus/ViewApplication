package com.example.ruslan.viewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // создание TextView
        TextView textView = new TextView(this);
        // установка текста в TextView
        textView.setText("Hello World!");
        // установка высоты текста
        textView.setTextSize(22);
        // установка визуального интерфейса для activity
        setContentView(textView);
    }
}
