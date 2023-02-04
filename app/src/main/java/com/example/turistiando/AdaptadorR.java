package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorR extends RecyclerView.Adapter<AdaptadorR.viewHolder> {

    public ArrayList<Restaurante> listaRestaurantes;

    public AdaptadorR(ArrayList<Restaurante> listaRestaurantes) {this.listaRestaurantes = listaRestaurantes;}

    @NonNull
    @Override
    public AdaptadorR.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemrestaurante,null, false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorR.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatosR(listaRestaurantes.get(i));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends  RecyclerView.ViewHolder{

        ImageView imagenResta;
        TextView nombreResta;
        TextView lugarResta;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imagenResta = itemView.findViewById(R.id.fotoRestaurante);
            nombreResta = itemView.findViewById(R.id.nombreRestaurante);
            lugarResta = itemView.findViewById(R.id.lugarRestraurante);
        }

        public void actualizarDatosR(Restaurante restaurante) {
            imagenResta.setImageResource(restaurante.getImagen());
            nombreResta.setText(restaurante.getNombre());
            lugarResta.setText(restaurante.getLugar());
        }
    }
}
