package com.Rudeichuk.Objekty;

public enum Komponenty_Vozidla {
    NARAZNIK(200),
    CELNE_SKLO(150),
    SVETLA(120);

    private final int cena;


    Komponenty_Vozidla(int cena) {
        this.cena = cena;
    }

    public double getHodnotaVEurach() {
        return cena;
    }
}
