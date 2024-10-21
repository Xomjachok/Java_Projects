    package com.Rudeichuk.vsemirnetelesa;
    import com.Rudeichuk.zive_tvory.Ryby.Kapor;
    import com.Rudeichuk.zive_tvory.Tvor;

    import java.util.Date;

    public class Zem extends Planeta{
        private Tvor[] poleTvorov;
        private int pocetTvorov;

        public Zem(double vaha, double priemer, String name) {
            super(vaha, priemer, name);
            this.poleTvorov = new Tvor[10000];
            pocetTvorov = 0;
        }

        public Zem(double vaha, double priemer, String name, Tvor[] poleTvorov) {
            super(vaha, priemer, name);
//            this.poleTvorov = (poleTvorov != null) ? poleTvorov : new Tvor[10000];
//            pocetTvorov = 0;
        }

        public void addTvora(Tvor tentotvor)
        {
            poleTvorov[pocetTvorov] =  tentotvor;
            pocetTvorov++;
        }



    }
