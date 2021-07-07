package com.example.applistaavanzada;

public class Serie {
    private String nombreSerie;
    private String nombreGenero;
    private int logoTipoResourse;

    public Serie(String n, String g, int r){
        this.nombreSerie = n;
        this.nombreGenero = g;
        this.logoTipoResourse = r;
    }

    public String getNombreSerie() {
        return nombreSerie;
    }

    public void setNombreSerie(String nombreSerie) {
        this.nombreSerie = nombreSerie;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    public int getLogoTipoResourse() {
        return logoTipoResourse;
    }

    public void setLogoTipoResourse(int logoTipoResourse) {
        this.logoTipoResourse = logoTipoResourse;
    }
}
