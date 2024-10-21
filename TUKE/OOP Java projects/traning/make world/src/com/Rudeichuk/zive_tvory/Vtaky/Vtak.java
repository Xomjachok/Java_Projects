package com.Rudeichuk.zive_tvory.Vtaky;

import com.Rudeichuk.zive_tvory.Stavovec;
import com.Rudeichuk.zive_tvory.stavovce_diely.Stavec;

public abstract class Vtak extends Stavovec {

    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("Ja letim");
    }
    private double vaha;
    private double vyska;
    private String meno;
    private double sirka;


    public Vtak(int pocet_stavcov) {
        super(pocet_stavcov);
    }
}
