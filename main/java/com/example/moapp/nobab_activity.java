package com.example.moapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class nobab_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nobab_activity);
    }

    public void onClickButton(View view) {
        int id = view.getId();
        Intent intent;

        switch (id){
            case R.id.button_boggumbab:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=f630c930ccd8d95036a59d7deb0a5c21058ac1b54a82c68fafd415ee7d0513c9&query=6rK967aB64yAIOuztuydjOuwpQ%3D%3D&menu=location&tab=1&lng=dc78545dc6076aeef1f6a44ef0880c4a&mapMode=0&mpx=89c82335fc65048caaa1073ce8c61d6a9c7b2f1bd98001bb94019a189214a4d7588879260b82aef7864e05119e6c294e097fb0a286cbf1985070d374a703d964&lat=43c1ed767d0104ea9654baa75aadca58&dlevel=9&enc=b64"));
                startActivity(intent);
                break;

            case R.id.button_thebbab:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=7d258a684fb32fd74d030dc52e90aab3a69275bc43530ff65deb7fc27ef936f7&query=6rK967aB64yAIOuNruuwpQ%3D%3D&menu=location&tab=1&lng=da2820622a56d2ecd88537737155191e&mapMode=0&mpx=44a9d69898dd63eb55d405ddc37f1f03526caea203af219754d3af951ddff35ef29d74532b7eab8436781c2828fc7694189020d6e1e1d9ba1079fc95f9235b4a&lat=aa2766d8d4afa43ecca26eb655127baf&dlevel=9&enc=b64"));
                startActivity(intent);
                break;

            case R.id.button_jungsik:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=9e18f153d5f50dc5517ed03f76c1a99d56de8a61559d078f690ee24bf63141c5&query=6rK967aB64yAIO2VnOygleyLnQ%3D%3D&tab=1&lng=8f4ec9d461c071dccdd07c737601297f&mapMode=0&mpx=a5b6297221037549ea82d38398366c1d16417c1216318f457edcf944da4b1d095aef5c9ccc9b7f71ed2ff70d8fced7d39460c218d2d07b1bc37e32857a59582f&lat=fc89b5eff07717f5aac9a44699dcedb2&dlevel=10&enc=b64&menu=location"));
                startActivity(intent);
                break;
        }

    }

}