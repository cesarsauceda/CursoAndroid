package com.example.sauceda.cursoandroid.actividades;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.sauceda.cursoandroid.Fragmento.MultiFragment;
import com.example.sauceda.cursoandroid.Fragmento.RestaFragment;
import com.example.sauceda.cursoandroid.Fragmento.SumaFragment;
import com.example.sauceda.cursoandroid.R;


public class inicioActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Fragment fragmentSuma= new SumaFragment();
                    FragmentManager fmSuma=getSupportFragmentManager();
                    fmSuma.beginTransaction().replace(R.id.contenedor,fragmentSuma).commit();
                    return true;
                case R.id.navigation_dashboard:
                    Fragment fragmentResta= new RestaFragment();
                    FragmentManager fmResta=getSupportFragmentManager();
                    fmResta.beginTransaction().replace(R.id.contenedor,fragmentResta).commit();
                    return true;
                case R.id.navigation_notifications:
                    Fragment fragmentMulti= new MultiFragment();
                    FragmentManager fmMulti=getSupportFragmentManager();
                    fmMulti.beginTransaction().replace(R.id.contenedor,fragmentMulti).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
