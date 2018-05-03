package com.example.sauceda.cursoandroid.Fragmento;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sauceda.cursoandroid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaFragment extends Fragment {

    EditText et1,et2;
    int resultado;

    public RestaFragment() {
        // Required empty public constructor
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_resta,container,false);
        Button boton = rootView.findViewById(R.id.btnResta);
        et1=rootView.findViewById(R.id.etNum1);
        et2=rootView.findViewById(R.id.etNum2);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(et1.getText().toString());
                int valor2 = Integer.parseInt(et2.getText().toString());
                resultado=valor1-valor2;

                Toast.makeText(getContext(), "El resultado es: "+resultado, Toast.LENGTH_LONG).show();




            }
        });
        return  rootView;
    }

}
