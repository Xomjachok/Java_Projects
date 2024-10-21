package com.Rudeichuk.zive_tvory.Ryby;

import com.Rudeichuk.zive_tvory.Stavovec;

public abstract class Ryba extends Stavovec {

    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("Plavam, lebo som rybka");

    }
    public void jest(Ryba vaha, Ryba vyska, Ryba sirka, int add)
    {
        System.out.println(meno + "Už som ne hladny");
    }

    public Ryba(int pocet_stavcov) {
        super(pocet_stavcov);
    }

    private String meno;

}


