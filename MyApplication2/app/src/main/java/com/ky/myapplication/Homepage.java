package com.ky.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //page 연결
        setContentView(R.layout.homepage);


        TextView tv = findViewById(R.id.tv_pink);
        tv.setText("hi");
        Button btn = findViewById(R.id.btn_aboutus);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("clicked!");
                //page바꾸기
                Intent it = new Intent(Homepage.this , Why.class);
                startActivity(it);
                finish();
            }
        });


    }
}
