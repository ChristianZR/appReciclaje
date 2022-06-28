package com.rem.appreciclaje;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referencias();
    }

    private void referencias() {
        menu = findViewById(R.id.menu);
        menu.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.menu_1){
                    mostrarF(new Guia());
                    item.setChecked(true);
                }
                if (item.getItemId()==R.id.menu_2){

                }
                if (item.getItemId()==R.id.menu_3){

                }
                if (item.getItemId()==R.id.menu_3){

                }
                return false;
            }
        });
    }

    private void mostrarF(Fragment f){
        getSupportFragmentManager().beginTransaction().replace(R.id.marco,f)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
    }

}