package com.example.moapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class myun_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myun_activity);

        ImageButton b = (ImageButton)findViewById(R.id.button_watermyun);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        watermyun_activity.class);
                startActivity(intent);
            }
        });

        ImageButton b2 = (ImageButton)findViewById(R.id.button_nomyun);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        nomyun_activity.class);
                startActivity(intent);
            }
        });

    }
}
