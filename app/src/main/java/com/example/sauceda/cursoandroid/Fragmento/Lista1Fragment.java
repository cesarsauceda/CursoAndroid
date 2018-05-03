package com.example.sauceda.cursoandroid.Fragmento;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sauceda.cursoandroid.R;
import com.example.sauceda.cursoandroid.adaptadores.MateriaAdapter;
import com.example.sauceda.cursoandroid.modelos.Materia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Lista1Fragment extends Fragment {

    RecyclerView rvMaterias;
    List<Materia> listaMaterias;
    public Lista1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView= inflater.inflate(R.layout.fragment_lista1,container,false);
        rvMaterias=rootView.findViewById(R.id.rbMaterias);
        listaMaterias= new ArrayList<>();
        listaMaterias= Arrays.asList(
                new Materia("123ABC","Matematicas", "10-11",5,R.drawable.matematicas),
                new Materia("456DEF","Español", "11-12",7,R.drawable.espanol)
        );
        RecyclerView.LayoutManager lym=new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        rvMaterias.setLayoutManager(lym);
        MateriaAdapter materiaAdapter=new MateriaAdapter(listaMaterias,getContext());
        rvMaterias.setAdapter(materiaAdapter);

        return rootView;
    }

}
