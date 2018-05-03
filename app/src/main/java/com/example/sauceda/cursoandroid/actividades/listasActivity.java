package com.example.sauceda.cursoandroid.actividades;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sauceda.cursoandroid.Fragmento.Lista1Fragment;
import com.example.sauceda.cursoandroid.Fragmento.SumaFragment;
import com.example.sauceda.cursoandroid.R;
import com.example.sauceda.cursoandroid.adaptadores.MateriaAdapter;

public class listasActivity extends AppCompatActivity implements MateriaAdapter.MateriaAdapterItemCallBack{

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_lista1:
                    Fragment fragmentlista1= new Lista1Fragment();
                    FragmentManager fmLista1=getSupportFragmentManager();
                    fmLista1.beginTransaction().replace(R.id.contenedorListas,fragmentlista1).commit();
                    return true;
                case R.id.navigation_lista2:
                    Fragment fragmentlista2= new Lista1Fragment();
                    FragmentManager fmLista2=getSupportFragmentManager();
                    fmLista2.beginTransaction().replace(R.id.contenedorListas,fragmentlista2).commit();
                    return true;
                case R.id.navigation_lista3:
                    Fragment fragmentlista3= new Lista1Fragment();
                    FragmentManager fmLista3=getSupportFragmentManager();
                    fmLista3.beginTransaction().replace(R.id.contenedorListas,fragmentlista3).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public void onMateriaItemSelected(String clave) {
        Toast.makeText(this, "Seleccionaste elemento"+clave, Toast.LENGTH_SHORT).show();
    }
}
