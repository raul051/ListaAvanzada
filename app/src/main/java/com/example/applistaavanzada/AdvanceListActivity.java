package com.example.applistaavanzada;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.wear.widget.WearableRecyclerView;

public class AdvanceListActivity extends WearableActivity {

    WearableRecyclerView lista_avanzada;
    ListaSeries listaSeries;
    Adaptador adaptador;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_list);

        listaSeries = new ListaSeries();
        adaptador = new Adaptador(listaSeries);

        lista_avanzada = (WearableRecyclerView) findViewById(R.id.advances_recyclerview);
        lista_avanzada.setEdgeItemsCenteringEnabled(true);
        lista_avanzada.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        lista_avanzada.setLayoutManager(layoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(lista_avanzada.getContext(),
                layoutManager.getOrientation());
        lista_avanzada.addItemDecoration(dividerItemDecoration);

        lista_avanzada.setAdapter(adaptador);
    }
}