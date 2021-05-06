package com.saymon.muslimsbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class al_quran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_quran);

        Button sura_wise=(Button)findViewById(R.id.sura_wise);
        Button para_wise=(Button)findViewById(R.id.para_wise);
        Button full_quran=(Button)findViewById(R.id.full_quran);

        para_wise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent para_wise=new Intent(al_quran.this,paras.class);
                startActivity(para_wise);
            }
        });
        sura_wise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  sura_wise=new Intent(al_quran.this,suras.class);
                startActivity(sura_wise);
            }
        });
        full_quran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item="full_quran";
                Intent  full_quran=new Intent(al_quran.this,PDFreader.class);
                full_quran.putExtra("file",item);
                startActivity(full_quran);
            }
        });
    }
}