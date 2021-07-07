package com.example.applistaavanzada;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdvancedViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private String nombreString;
    private String generoString;
    private TextView nombreSerie;
    private TextView nombreGenero;
    private ListaSeries listaSeries;
    private ImageView logotipo;

    private static final String TAG = AdvancedViewHolder.class.getSimpleName();


    public AdvancedViewHolder(@NonNull View view, ListaSeries lista) {
        super(view);
        nombreSerie = (TextView) view.findViewById(R.id.nombreserie);
        nombreGenero = (TextView) view.findViewById(R.id.nombregenero);
        logotipo = (ImageView) view.findViewById(R.id.logotipo);

        lista = lista;

        view.setOnClickListener(this);

    }

    public void setDatos(Serie s){
        nombreSerie.setText(s.getNombreSerie());
        nombreGenero.setText(s.getNombreGenero());
        logotipo.setImageResource(s.getLogoTipoResourse());
    }

    @Override
    public void onClick(View view) {
        int position = getAbsoluteAdapterPosition();
        Serie s = listaSeries.getSerie(position);
        generoString = s.getNombreGenero();
        Log.d(TAG,"onClick: elemento selecionado: " + nombreString);
    }
}
