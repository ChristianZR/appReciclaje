package com.example.app_sf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Animation animation1 = AnimationUtils.loadAnimation( this,R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation( this,R.anim.desplazamiento_abajo);


        TextView Safeladytext = findViewById(R.id.Safeladytext);
        ImageView LogoimageView = findViewById(R.id.LogoimageView);

        Safeladytext.setAnimation(animation1);
        LogoimageView.setAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}