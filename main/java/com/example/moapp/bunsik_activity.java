package com.example.moapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bunsik_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunsik_activity);
    }

    public void onClickButton(View view) {
        int id = view.getId();
        Intent intent;

        switch (id){
            case R.id.button_dduck:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=aa639465b1735dc7c74df00d0152c20fb04af1d1fa0b29704221bfa7b8031665&query=6rK967aB64yAIOuWoeuztuydtA%3D%3D&tab=1&lng=a7e9a6ae3e38da01c4a0a11a31da95fc&mapMode=0&mpx=8f3f3d3cc0767a6e49bc50fec00b34a6c7b866900b929cb82aa43665e62b3e34740cf7fdc43e9b8669f6bcae3eb2a805f134e158987620a47cf5f7e312725148&lat=8acf7b277c0c54f41ea3dad67a2b64d5&dlevel=10&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_salad:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=9f46e85c941fe6402d8941300b6267bc56269719e7ff4e4762bc84136f05790a&query=6rK967aB64yAIOyDkOufrOuTnA%3D%3D&menu=location&tab=1&lng=6e63e77d7a597f2c88cf1b14a7466f9a&mapMode=0&mpx=7c156f61c87cf14d517e4b7bcbbc10f6ee9fa526ff5996936c851ae95e38beb84947528ee9b8783365d5f370b5bd97e59313bc5cdd3925650f73c64f92ed0ab2&lat=67dda3d3a56e5ac6d564df5da65f1a84&dlevel=10&enc=b64"));
                startActivity(intent);
                break;

            case R.id.button_bong:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=7e8d7f9156d00e74e4332bbe3977a813d842b3fac99dff7f81a6db9b6130e2e4&query=6rK967aB64yAIOuwpeuyhOqxsA%3D%3D&tab=1&lng=01e87d6c81607e804359ff4f68c7015d&mapMode=0&mpx=7fca5aca25497fb1ee33b2c1bc987a1cef2c8c8ef172daf05b42da94e735f12e33c54b4ad5b72e4ff945d9864c0635e36270ce89f1f7a2c38c485ec927362e9a&lat=11809d2669e14211f9ea16170c2c1847&dlevel=11&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_cupbab:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=408398a98e017f3fd697c806f1c03e69554c253ee3e0c554388efece45264c23&query=6rK967aB64yAIOy7teuwpQ%3D%3D&tab=1&lng=b67238db4b28c0102fd75df53e5bbeb6&mapMode=0&mpx=255acb2c7f2e32aa8dfc0f5827c0df8e443ebf104da02e22c114b8df961f4fe6c77babba8057ba534130092dad0898bc1d0007c0c17104214e770b27e3e6b0f2&lat=714091f5efb8ef6e7562ee4f1490987a&dlevel=9&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_gimbab:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=873f68ee188218bb0268d9ad435b3936ac8e2767a4bbee33bf12de73739e0f90&query=6rK967aB64yAIOq5gOuwpQ%3D%3D&menu=location&tab=1&lng=7dce5f1233ca0ec6a90dcfd02d1826f1&mapMode=0&mpx=c2485ee1d65db93e868b13c2b99af52c65949af1d112e71634c97b04942fcf6fd249af0b277b2a6aaeca309c9afd2a9538792553dc9d895df12569b7502e9668&lat=714091f5efb8ef6e7562ee4f1490987a&dlevel=9&enc=b64"));
                startActivity(intent);
                break;
        }

    }

}
