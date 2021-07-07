package com.example.applistaavanzada;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ListaSeries listaSeries;
    private static String TAG = Adaptador.class.getSimpleName();

    public Adaptador(ListaSeries lista){
        this.listaSeries = lista;
        Log.d(TAG,"Elementos en contructor: " + listaSeries.getSize());
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = new AdvancedViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout,parent,false),
                listaSeries
        );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        Serie serie = listaSeries.getSerie(position);
        Log.d(TAG,"Serie en onBindeView:" + serie.getNombreSerie());
        AdvancedViewHolder serieViewHolder = (AdvancedViewHolder) viewHolder;
        ((AdvancedViewHolder) viewHolder).setDatos(serie);
    }

    @Override
    public int getItemCount() {
        return listaSeries.getSize();
    }
}
