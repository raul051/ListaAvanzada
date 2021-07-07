package com.example.applistaavanzada;

import java.util.ArrayList;

public class ListaSeries {
    private ArrayList<Serie> series;

    public ListaSeries(){
        series = new ArrayList<Serie>();
            Serie e1 = new Serie("You","Suspenso",R.drawable.img1);
            series.add(e1);
            Serie e2 = new Serie("Sillicon Valey","Comedia",R.drawable.img2);
            series.add(e2);
            Serie e3 = new Serie("For all Manking","Ficción",R.drawable.img3);
            series.add(e3);
            Serie e4 = new Serie("Cobra Kai","Acción",R.drawable.img4);
            series.add(e4);
            Serie e5 = new Serie("La teoria del big bang","Comedia",R.drawable.img5);
            series.add(e5);

    }
    public int getSize(){
        return series.size();
    }

    public Serie getSerie(int position){
        return series.get(position);
    }
}
