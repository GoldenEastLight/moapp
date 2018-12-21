package com.example.moapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class light_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_activity);

        ImageButton b = (ImageButton)findViewById(R.id.button_fast);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        fast_activity.class);
                startActivity(intent);
            }
        });

        ImageButton b2 = (ImageButton)findViewById(R.id.button_bunsik);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        bunsik_activity.class);
                startActivity(intent);
            }
        });

    }
}
