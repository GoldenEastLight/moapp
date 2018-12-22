package com.example.moapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class watermyun_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watermyun_activity);
    }

    public void onClickButton(View view) {
        int id = view.getId();
        Intent intent;

        switch (id){
            case R.id.button_ramen:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=256054d54fd0ef53229a6e34008c3aa7063b2568ec564b4865f79716c93fc2ea&query=6rK967aB64yAIOudvOupmA%3D%3D&tab=1&lng=61643f39b864bf35dc63f3ec1f7afeeb&mapMode=0&mpx=90f3e1c93789979e8fcff8101f07d43640afd09c1ed1747780fc1992d53ef4ea3f45f54705a7b9ad31cf70bbe521394469a804ad6dc6f9db7479dd09d507951f&lat=f7a9fae11889f4c7ea891bb733720ac0&dlevel=10&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_udong:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=e960d3995af0036dbd2461dea2b4aaee88c8d0102e8500583317731f2f3fdff8&query=6rK967aB64yAIOyasOuPmeynkQ%3D%3D&tab=1&lng=f5dc1ec417a1fac8cb8ab2b1f9aa26e6&mapMode=0&mpx=e37909dde70074a2c174031b2437ad5ba17dad70db05f8ab7484beff1439fadb3ed5359929ef878ed067ff658a21ea768594a1199c3eb0779d05751bbdd35867&lat=5f716732c481b2d801785c0161f22acb&dlevel=10&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_nang:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=e1432c6b8ae27b58cf7150f185ebfe84ecffcea76fe2328cf655835f12add5b2&query=6rK967aB64yAIOuDieuptA%3D%3D&tab=1&lng=aa67d5870f20332dda27f55e4c310ca2&mapMode=0&mpx=d4f0396de9118454e6d4596fa88f97f77b0409e265b2e7f3d4c60c0c9d4f19f04da26974bc250bcbb6d65d58fbf8c00f5fc8151e44ba68ed80b27e9d2794c12e&lat=9e0fbd8d9b7874cb9935ee13dfb82283&dlevel=9&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_soba:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=35086e9283ec50b105332c0b8000ad1691dddaae9cbdd7432fcea4b1f935e668&query=6rK967aB64yAIOyGjOuwlA%3D%3D&tab=1&lng=54a94150883c6ddecd148193417d729b&mapMode=0&mpx=c2247943f9ee1852413ebc2010e001bd299f81d430e4551ffd0fa22f99cf45c8b2e6bd927f76bde1906bfbb78e8d47ca9ac68b548b133057b1767a4ffe1d636f&lat=f6c8fd56f11ee48e2f371cb0aeefc9ef&dlevel=9&enc=b64&menu=location"));
                startActivity(intent);
                break;

            case R.id.button_jjam:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/?searchCoord=873f68ee188218bb0268d9ad435b3936ac8e2767a4bbee33bf12de73739e0f90&query=6rK967aB64yAIOynrOu9lQ%3D%3D&tab=1&lng=29d0f82e871c8bd27da271845599eaa7&mapMode=0&mpx=c2485ee1d65db93e868b13c2b99af52c65949af1d112e71634c97b04942fcf6fd249af0b277b2a6aaeca309c9afd2a9538792553dc9d895df12569b7502e9668&lat=2c5c00116e2cc4512b7d921f95b64a79&dlevel=10&enc=b64&menu=location"));
                startActivity(intent);
                break;
        }

    }

}