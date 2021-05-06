package com.saymon.muslimsbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class namaz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz);
        Button p1=findViewById(R.id.s1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="namaz1";
                Intent intent=new Intent(namaz.this,PDFreader.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
        Button p2=findViewById(R.id.s2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="namaz2";
                Intent intent=new Intent(namaz.this,PDFreader.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
        Button p3=findViewById(R.id.s3);
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="namaz3";
                Intent intent=new Intent(namaz.this,PDFreader.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
        Button p4=findViewById(R.id.s4);
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="namaz4";
                Intent intent=new Intent(namaz.this,PDFreader.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
        Button p5=findViewById(R.id.s5);
        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="namaz5";
                Intent intent=new Intent(namaz.this,PDFreader.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
        Button p6=findViewById(R.id.s6);
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="namaz6";
                Intent intent=new Intent(namaz.this,PDFreader.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
        Button p7=findViewById(R.id.s7);
        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="namaz7";
                Intent intent=new Intent(namaz.this,PDFreader.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
        Button p8=findViewById(R.id.s8);
        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="namaz8";
                Intent intent=new Intent(namaz.this,PDFreader.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
        Button p9=findViewById(R.id.s9);
        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="namaz9";
                Intent intent=new Intent(namaz.this,PDFreader.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
        Button p10=findViewById(R.id.s10);
        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="namaz10";
                Intent intent=new Intent(namaz.this,PDFreader.class);
                intent.putExtra("file",item);
                startActivity(intent);
            }
        });
    }
}