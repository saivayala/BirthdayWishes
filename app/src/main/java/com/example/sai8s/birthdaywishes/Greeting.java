package com.example.sai8s.birthdaywishes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Greeting extends AppCompatActivity {
TextView tv;
String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        tv=findViewById(R.id.tvname);
        st=getIntent().getExtras().getString("value");
        tv.setText(st);
    }
}
