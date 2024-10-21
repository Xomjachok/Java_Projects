package com.Rudeichuk.Objekty;

public class Prsten {
    private static Prsten instancia;

    public static Prsten ziskajInstanciu()
    {
        if (instancia == null) {instancia = new Prsten();}
       return instancia;
    }

    public void nosPrsten()
    {
        System.out.println("Eva nosi tento najvzacnejsi prsten.");
    }

    public Prsten() {

    }
}
