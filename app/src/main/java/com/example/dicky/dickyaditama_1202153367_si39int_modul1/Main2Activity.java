package com.example.dicky.dickyaditama_1202153367_si39int_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView iRestaurant, iMenu, iPortion, iPrice;
    String restaurant, menu;
    int portion, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        iRestaurant = findViewById(R.id.iRestaurant);
        iMenu = findViewById(R.id.iMenu);
        iPortion = findViewById(R.id.iPortion);
        iPrice = findViewById(R.id.iPrice);

        Intent intent = getIntent();
        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("portion", 0 );
        price = intent.getIntExtra("price", 0 );
        iRestaurant.setText(restaurant);
        iMenu.setText(menu);
        iPortion.setText(portion);
        iPrice.setText("Rp."+price);
        Toast toast = null;
        if (price<65000){
            toast = Toast.makeText(getApplicationContext(), "ini murah", Toast.LENGTH_SHORT);
        }
        else
            toast = Toast.makeText(getApplicationContext(), "ini tekor", Toast.LENGTH_SHORT);
    }
}
