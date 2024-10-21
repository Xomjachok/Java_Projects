package com.Rudeichuk.zive_tvory;

import com.Rudeichuk.zive_tvory.stavovce_diely.Chrbtica;
import com.Rudeichuk.zive_tvory.stavovce_diely.Sustava;
import com.Rudeichuk.zive_tvory.stavovce_diely.Typ_systavy;


public abstract class Stavovec  extends Tvor implements bornable, dieble{
    protected Chrbtica chrbtica;
    protected Sustava[] sustavy;


    public Stavovec(int pocet_stavcov) {
        chrbtica = new Chrbtica(pocet_stavcov);
        create_sustavy();
    }

    public Sustava[] getSustavy() {
        return sustavy;
    }

    public void create_sustavy()
    {
        sustavy = new Sustava[8];

        sustavy[0] = new Sustava(Typ_systavy.OBEHOVA);
        sustavy[1] = new Sustava(Typ_systavy.OPORNA);
        sustavy[2] = new Sustava(Typ_systavy.VYLUCOVACIA);
        sustavy[3] = new Sustava(Typ_systavy.POHYBOVA);
        sustavy[4] = new Sustava(Typ_systavy.DYCHACIA);
        sustavy[5] = new Sustava(Typ_systavy.TRAVIACA);
        sustavy[6] = new Sustava(Typ_systavy.ROZMNOZOVACIA);
        sustavy[7] = new Sustava(Typ_systavy.NERVOVA);


    }
}
