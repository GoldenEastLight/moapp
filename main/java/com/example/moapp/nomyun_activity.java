package com.example.moapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class nomyun_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomyun_activity);
    }

    public void onClickButton(View view) {
        int id = view.getId();
        Intent intent;

        switch (id){
            case R.id.button_pasta:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=c6ca489adfceb0271e4278171d1f2eead8cbd3e33baf23c62bba7cf6c6775111&query=6rK967aB64yAIO2MjOyKpO2DgA%3D%3D&tab=1&lng=cc9abbd94404f8166c3ec0c16547eba4&mapMode=0&mpx=2b42d0cc376dcb3f5de8db4474932fad99d31f3911c774b2e024722605f9d80124edfd670c36afe52649c51b287d55e385b54572ae8f095cdf1510ee5dccd01b&lat=4f56e931af5f42626ba480cdef27dbb2&dlevel=9&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_yaggiudong:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=7d258a684fb32fd74d030dc52e90aab3a69275bc43530ff65deb7fc27ef936f7&query=6rK967aB64yAIOyVvOuBvOyasOuPmQ%3D%3D&tab=1&lng=a4369d90cbb5bd0e14da7fe2e9cd6ee6&mapMode=0&mpx=44a9d69898dd63eb55d405ddc37f1f03526caea203af219754d3af951ddff35ef29d74532b7eab8436781c2828fc7694189020d6e1e1d9ba1079fc95f9235b4a&lat=38da4ed7e50207e3e2c3d7ff8600484c&dlevel=10&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_jjajangmyun:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=f5c72dfffb96d1f23ca3cd1ce0e70820dd0d17ea3dbacc2036bfb381fedd0718&query=6rK967aB64yAIOynnOyepeuptA%3D%3D&tab=1&lng=e98ca9534a67baffa69053486a7b2d46&mapMode=0&mpx=d9ffedb07494eda62bf780782eaabf389aa536a5d340a3b8264c9a4983c8643a108ab84a63e1444acf516701e161fa7d2fc0f46d1e0c69461a921faa750a4a10&lat=24c80b6013f35ab26d86d7cb8deabd64&dlevel=9&enc=b64&menu=location"));
                startActivity(intent);
                break;
        }

    }

}