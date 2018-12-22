package com.example.moapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class chick_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chick_activity);
    }

    public void onClickButton(View view) {
        int id = view.getId();
        Intent intent;

        switch (id){
            case R.id.button_chicken:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=eb443317d344409f8e6d69c483bebabdb74fc1bc6e6baaf415d5206225bb8140&query=6rK967aB64yAIOy5mO2CqA%3D%3D&menu=location&tab=1&lng=f20db52039f7a2a542f8c357b463f566&mapMode=0&mpx=f67e8ffccea7b8dff36512b4d98ef2538cc1ac40ce9a1449828900addcf39982b24cbeea48c1d15ea06b2960e52a056f1d0007c0c17104214e770b27e3e6b0f2&lat=797e5093d2ac5de9661bb5a0e3822dfc&dlevel=10&enc=b64"));
                startActivity(intent);
                break;

            case R.id.button_gganpoong:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=c633a366cf0b3d2b5d18e0dab952d18dc31a25e0062d785f13a5d85b02e60565&query=6rK967aB64yA6rmQ7ZKN6riw&menu=location&tab=1&lng=fad1ff0f44b02ac1fd0b5b97d6b5011a&mapMode=0&mpx=16883cca08a8e4ca77821d7194a0a999fe6542fc41e368b83ffccf97595db7208a799982de08a3743ecd0b53b2d33c0033e4003f15df3f6b45ddfb83491eaabc&lat=fab38a0ff05cdd41ba363e5357654a0d&dlevel=10&enc=b64"));
                startActivity(intent);
                break;

            case R.id.button_jjimdak:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=674fbcf362f073c4255a14b93e0eb04fe17035350ebda79a5a64f1405d685a9b&query=6rK967aB64yAIOywnOuLrQ%3D%3D&tab=1&lng=63c4e3e9cfb48c3a228928ec83bff604&mapMode=0&mpx=9c30c5df1113e2ec54aa505b00e64aa13e8b2b179999c7f8c267dcf187889814a40b702141e26e886b7d5eae4c0f0d511bf7ffcad1db6639cac5e05516010027&lat=f41640cd00dce87fb5658ecfbb303356&dlevel=10&enc=b64&menu=location"));
                startActivity(intent);
                break;
        }

    }

}