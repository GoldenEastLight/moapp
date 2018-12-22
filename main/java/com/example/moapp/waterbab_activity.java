package com.example.moapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class waterbab_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waterbab_activity);
    }

    public void onClickButton(View view) {
        int id = view.getId();
        Intent intent;

        switch (id){
            case R.id.button_gubbab:
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=873f68ee188218bb0268d9ad435b3936ac8e2767a4bbee33bf12de73739e0f90&query=6rK967aB64yAIOq1reuwpQ%3D%3D&tab=1&lng=0a18aa48ab74ff6310712602832be004&mapMode=0&mpx=c2485ee1d65db93e868b13c2b99af52c65949af1d112e71634c97b04942fcf6f5c714324a263e4df81bd75224c383f0aa790e1c077896e5da9c214d78278fc8e&lat=c4a6fac774961b4bf2fa00982bfc0274&dlevel=10&enc=b64&menu=location"));
            startActivity(intent);
            break;

            case R.id.button_jjigae:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?mpx=823f4cade3f9807120bb58f5c754c711346115e158f205e16245431e3c556c2187fc3377aa9d7054fd87665d87d3d3efbb117f00dd64067b5fd60365854f7b6d&searchCoord=1f351263da02a8285e5453c101880dbbe7e0894f103b98cbf15d704e24e91e4f&query=6rK967aB64yAIOywjOqwnA%3D%3D&menu=location&tab=1&lng=dc07adc4f0dcf6a2207abe584c560750&mapMode=0&lat=c83d3add84f259c40fbe5e6c428bc224&dlevel=9&enc=b64"));
                startActivity(intent);
                break;

            case R.id.button_tangryu:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=cbdb2ea8852340e1b0226e3fb37769bd703aa7815858f5101641be0f6743e89e&query=6rK967aB64yAIOyYpOuOhe2DlQ%3D%3D&menu=location&tab=1&lng=0a18aa48ab74ff6310712602832be004&mapMode=0&mpx=57e258699f82eaebe8e7490631fdf8ed72d97b4580170cdd4c25d7d469313e519a738601d8b2c31a0c3179654a2f3a41db41432425f68671c1e84d2798b0fc91&lat=ec06221bed8ebde1cb429cc85c153aa3&dlevel=10&enc=b64"));
                startActivity(intent);
                break;
        }

    }

}
