package com.example.sauceda.cursoandroid.adaptadores;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.sauceda.cursoandroid.R;
import com.example.sauceda.cursoandroid.modelos.Materia;

import java.util.List;

/**
 * Created by sauceda on 8/02/18.
 */

public class MateriaAdapter extends RecyclerView.Adapter<MateriaAdapter.MateriaViewHolder> {

    public interface MateriaAdapterItemCallBack{
        void onMateriaItemSelected(String clave);
    }
    List<Materia> listaMaterias;
    Context context;
    MateriaAdapterItemCallBack materiaAdapterItemCallBack;

    public MateriaAdapter(List<Materia> listaMaterias, Context context) {
        this.listaMaterias = listaMaterias;
        this.context = context;
        this.materiaAdapterItemCallBack = (MateriaAdapterItemCallBack) context;
    }

    @Override
    public MateriaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_materia,parent,false);
        return new MateriaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MateriaViewHolder holder, final int position) {

        holder.nombreMateria.setText(listaMaterias.get(position).getNombre());
        holder.claveMateria.setText(listaMaterias.get(position).getClave());
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materiaAdapterItemCallBack.onMateriaItemSelected(listaMaterias.get(position).getClave());

            }
        });
        Glide.with(context).load(listaMaterias.get(position).getImagen()).into(holder.imagenMateria);
    }

    @Override
    public int getItemCount() {
        return listaMaterias.size();
    }

    public class MateriaViewHolder extends RecyclerView.ViewHolder{
        TextView nombreMateria,claveMateria;
        de.hdodenhof.circleimageview.CircleImageView imagenMateria;
        View view;


        public MateriaViewHolder(View itemView) {
            super(itemView);
            nombreMateria= itemView.findViewById(R.id.txtNombre);
            claveMateria=itemView.findViewById(R.id.txtClave);
            imagenMateria=itemView.findViewById(R.id.imgMateria);
            view =itemView.findViewById(R.id.view_materia);
        }
    }
}
