package com.example.fitzone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.shawnlin.numberpicker.NumberPicker;

public class height_page extends AppCompatActivity {

    ImageView back_Page ;
    NumberPicker height_num;
    String height;
    Button next_page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_page);

        height_num = findViewById(R.id.height);
        next_page = findViewById((R.id.btn_continue));

        next_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(height_page.this ,"Your Height is "+height, Toast.LENGTH_SHORT);
                Intent weight = new Intent(height_page.this,weight_page.class);
                startActivity(weight);
            }
        });



        height_num.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                height = Integer.toString(newVal);
            }
        });




        back_Page = findViewById(R.id.btn_next_page);
        back_Page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}