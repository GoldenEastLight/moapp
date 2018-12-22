package com.example.moapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fast_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_activity);
    }


    public void onClickButton(View view) {
            int id = view.getId();
            Intent intent;

            switch (id){
                case R.id.button_ham:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=873f68ee188218bb0268d9ad435b3936ac8e2767a4bbee33bf12de73739e0f90&query=6rK967aB64yAIO2WhOuyhOqxsA%3D%3D&tab=1&lng=acbc48b60f11a214df1192aa25bc2ddc&mapMode=0&mpx=c2485ee1d65db93e868b13c2b99af52c65949af1d112e71634c97b04942fcf6fd249af0b277b2a6aaeca309c9afd2a9538792553dc9d895df12569b7502e9668&lat=1a04cece302a0e6a854fdfd28ce1ebe7&dlevel=9&enc=b64&menu=location"));
                    startActivity(intent);
                    break;

                case R.id.button_jjigae:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=e64e2c2a8002f7a864a79aeecc96e894ab8398efdf90294ac50f09eb3b4e4899&query=6rK967aB64yAIOu4jOumrOuYkA%3D%3D&menu=location&tab=1&lng=18ba7fc6b76fac3504328552642a4974&mapMode=0&mpx=83bb1940c4b6c28f943398c904048b06730920b547627a6897b1f7551bb48618fcde4158c2ff12b31298cb06c480245dbec55b1338a68d0da77203bd8c6bae1d&lat=b3fcbbb883245e2db2338490ad3a1f8c&dlevel=10&enc=b64"));
                    startActivity(intent);
                    break;

                case R.id.button_tangryu:
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=c633a366cf0b3d2b5d18e0dab952d18dc31a25e0062d785f13a5d85b02e60565&query=6rK967aB64yA6rmQ7ZKN6riw&menu=location&tab=1&lng=fad1ff0f44b02ac1fd0b5b97d6b5011a&mapMode=0&mpx=16883cca08a8e4ca77821d7194a0a999fe6542fc41e368b83ffccf97595db7208a799982de08a3743ecd0b53b2d33c0033e4003f15df3f6b45ddfb83491eaabc&lat=fab38a0ff05cdd41ba363e5357654a0d&dlevel=10&enc=b64"));
                    startActivity(intent);
                    break;
            }

    }

}