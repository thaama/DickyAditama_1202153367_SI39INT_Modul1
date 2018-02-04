package com.example.dicky.dickyaditama_1202153367_si39int_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText food,portion;
    Intent intent;
    String restoran, menu;
    int porsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        food = (EditText) findViewById(R.id.makanan);
        portion = (EditText) findViewById(R.id.banyak);
        intent = new Intent(this, Main2Activity.class);
    }
    public void itbas(View view){
        menu = food.getText().toString();
        restoran = "Eatbus";
        porsi = Integer.parseInt(portion.getText().toString());
        int total=50000*porsi;
        Log.d("TOTAL HARGA","Rp."+total);
        intent.putExtra("restaurant", restoran);
        intent.putExtra("menu", menu);
        intent.putExtra("portion", porsi);
        intent.putExtra("price", total);
        startActivity(intent);
    }
    public void apnormal(View view){
        menu = food.getText().toString();
        restoran = "Abnormal";
        porsi = Integer.parseInt(portion.getText().toString());
        int total=30000*porsi;
        Log.d("TOTAL HARGA","Rp."+total);
        intent.putExtra("restaurant", restoran);
        intent.putExtra("menu", menu);
        intent.putExtra("portion", porsi);
        intent.putExtra("price", total);
        startActivity(intent);
    }
}