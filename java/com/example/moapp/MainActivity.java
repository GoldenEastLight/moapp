package com.example.moapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent_sp = new Intent(this, LoadingActivity.class);
        startActivity(intent_sp);

        ImageButton b = (ImageButton)findViewById(R.id.button_light);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        light_activity.class);
                startActivity(intent);
            }
        });

        ImageButton b2 = (ImageButton)findViewById(R.id.button_heavy);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        heavy_activity.class);
                startActivity(intent);
            }
        });

    }
}
