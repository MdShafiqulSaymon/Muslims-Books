package com.saymon.muslimsbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"ইন্টারনেট সংযোগ চেক করুন",Toast.LENGTH_LONG).show();
        Button all_suraBTN=(Button) findViewById(R.id.all_sura);
        Button Namaz_educationBTN=(Button) findViewById((R.id.Namaz));
        Button mohanobi=(Button) findViewById(R.id.mohanobi);
        Button DUA=(Button) findViewById(R.id.dua);
        Button Bukhari=(Button)findViewById(R.id.bukhari);

        all_suraBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent all_suraINT=new Intent(MainActivity.this,al_quran.class);
                startActivity(all_suraINT);
            }
        });

        Namaz_educationBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="সালাতুর রাসুল (সাঃ)";
                Intent Namaz_EducationINT=new Intent(MainActivity.this,namaz.class);
                Namaz_EducationINT.putExtra("file",item);
                startActivity(Namaz_EducationINT);
            }
        });
        mohanobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  item="mohanobi";
                Intent mohanobiINT=new Intent(MainActivity.this,nobider_jiboni.class);
                mohanobiINT.putExtra("file",item);
                startActivity(mohanobiINT);
            }
        });
        DUA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="DUA";
                Intent DUAINT=new Intent(MainActivity.this,PDFreader.class);
                DUAINT.putExtra("file",item);
                startActivity(DUAINT);
            }
        });
        Bukhari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="বুখারী শরীফ";
                Intent BukhariINT=new Intent(MainActivity.this,bukhari.class);
                BukhariINT.putExtra("file",item);
                startActivity(BukhariINT);
            }
        });


    }
}