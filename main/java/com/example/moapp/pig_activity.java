package com.example.moapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pig_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pig_activity);
    }

    public void onClickButton(View view) {
        int id = view.getId();
        Intent intent;

        switch (id){
            case R.id.button_gu2:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=bd4556a9e3dd45e99281a9c0fd84cf09fd1b39e66040d22eeb1c85b15e734560&query=6rK967aB64yAIOuPvOyngOq1rOydtA%3D%3D&tab=1&lng=59f4a32729c85aeb7da4bfab77bd66cf&mapMode=0&mpx=d4cbd0f225d92abd95c55f3bef47d66a004c8f03e5445239583342eca8cb280aea89c826da43993efbc9c86e048da59b0f13e968582cd87a384a2041547ca5c9&lat=d87e486c1fd7436feb69706b3f685534&dlevel=11&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_donggas:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=bd4556a9e3dd45e99281a9c0fd84cf09fd1b39e66040d22eeb1c85b15e734560&query=6rK967aB64yAIOuPiOq5jOyKpA%3D%3D&tab=1&lng=0440aece4944912484ee9c647e0c034a&mapMode=0&mpx=d4cbd0f225d92abd95c55f3bef47d66a004c8f03e5445239583342eca8cb280aea89c826da43993efbc9c86e048da59b0f13e968582cd87a384a2041547ca5c9&lat=7dd72ae3ae580cca6347173269afdd8d&dlevel=11&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_tangsu:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=cbdb2ea8852340e1b0226e3fb37769bd9206fff5379b8a55a77f0a5a1fa0bc6a&query=6rK967aB64yAIO2DleyImOycoQ%3D%3D&tab=1&lng=c72820a4eb531f135709f12cc4466eed&mapMode=0&mpx=dd25539354ea44a6e361372b4da64b5ac9f460f766b389e9201e485cd8d4c3d69e47a46f9720ac6ca22d03f5bea4dc40db41432425f68671c1e84d2798b0fc91&lat=a0f423b2cfd3d1ca0b1114928d73b1ec&dlevel=10&enc=b64&menu=location"));
                startActivity(intent);
                break;
        }

    }

}