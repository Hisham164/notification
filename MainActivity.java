package com.example.notify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nex3z.notificationbadge.NotificationBadge;

public class MainActivity extends AppCompatActivity {

    NotificationBadge mBadge;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBadge = findViewById(R.id.badge);
        Button btnIncrease=findViewById(R.id.btnIncrease);
        Button btnMany=findViewById(R.id.btnMany);
        Button btnClear=findViewById(R.id.btnClear);
        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBadge.setNumber(++count);
            }
        });

        btnMany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBadge.setNumber(99);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBadge.setNumber(0);
            }
        });
    }
}