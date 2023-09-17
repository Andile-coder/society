package com.example.society;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;



public class Welcome extends  AppCompatActivity{

    Button nextBtn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        nextBtn = findViewById(R.id.next_btn);

        //button click
        nextBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public  void onClick(View v){
//                go back to main
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }

        });

    }

}
