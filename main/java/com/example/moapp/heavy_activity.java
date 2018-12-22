package com.example.moapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class heavy_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heavy_activity);

        ImageButton b = (ImageButton)findViewById(R.id.button_gogi);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        gogi_activity.class);
                startActivity(intent);
            }
        });

        ImageButton b2 = (ImageButton)findViewById(R.id.button_babmyun);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        babmyun_activity.class);
                startActivity(intent);
            }
        });

    }
}
