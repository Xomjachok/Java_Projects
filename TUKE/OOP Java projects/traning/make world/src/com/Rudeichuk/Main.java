package com.Rudeichuk;

import com.Rudeichuk.Objekty.*;
import com.Rudeichuk.vsemirnetelesa.*;
import com.Rudeichuk.zive_tvory.Mucha;
import com.Rudeichuk.zive_tvory.Ryby.Kapor;
import com.Rudeichuk.zive_tvory.Ryby.Losos;
import com.Rudeichuk.zive_tvory.Vtaky.Orol;

import java.util.Date;
import java.util.List;

public class Main{
    public static void main(String[] args) {
//        System.out.println("Hello world!");
////        Planeta Zem = new Planeta(5.9722, 6371, "Zem" );
////
////        Planeta[] pole_planet = new Planeta[1000];
////        for(int i = 0; i < 1000;i++) { pole_planet[i] =new Planeta(); }
//        Slnecna_Sustava slnecnaSustava = new Slnecna_Sustava();
//        slnecnaSustava.addTeleso(new Planeta(5.9722, 6371, "Zem"));
            Zem MatickaZem = new Zem(5.9722, 6371, "Zem");

//        for (int i = 0; i < 1000; i++)
//        {
//            MatickaZem.addTvora(new Ryba(1.1, 2.2, 3.3, "Ryba"));
//            MatickaZem.addTvora(new Vtak(1.1, 2.2, 3.3, "Vtak"));
//        }

/*        Galaxia Mliecna_cesta = new Galaxia("Mliečna_cesta");
        Slnecna_Sustava slnecna_sustava = new Slnecna_Sustava("Slnečna sustava");
        Mliecna_cesta.addSustava(slnecna_sustava);
        Moj_Objekt Zaujimavka = new Moj_Objekt("Zaujimavka");
        Mliecna_cesta.addSustava(Zaujimavka);
        ((Moj_Objekt) Mliecna_cesta.getSustava().get(1)).CoToZaujimave();
        Galaxia Rudeichuk = new Galaxia("Oleksii Rudeichuk");
        Mliecna_cesta.PosliSpravu(Rudeichuk, "Ahoj kamoš");


        Kapor vianocnykapor = new Kapor(50);
        Date dNow = new Date();
        vianocnykapor.born(dNow);
        MatickaZem.addTvora(vianocnykapor);

        Losos sushilosos = new Losos(50);
        MatickaZem.addTvora(sushilosos);
        Orol orolskalny = new Orol(26);
        MatickaZem.addTvora(orolskalny);
        Mucha vinnamuska = new Mucha();
        MatickaZem.addTvora(vinnamuska);
        vianocnykapor.Hybsa();
        vianocnykapor.die(dNow);*/

        Motor motorOsobnehoAuta = new Motor(150, 4, 2.0, 7.5, 100.0);
        Osobne_Auto osobneAuto = new Osobne_Auto(motorOsobnehoAuta);

        Motor motorNakladnehoAuta = new Motor(300, 6, 4.0, 10.0, 120.0);
        Nakladne_Auto nakladneAuto = new Nakladne_Auto(motorNakladnehoAuta);

        System.out.println(osobneAuto.getInfoOMotore());
        System.out.println(nakladneAuto.getInfoOMotore());

        osobneAuto.zrychli();
        osobneAuto.zastav();
        nakladneAuto.zrychli();
        nakladneAuto.zastav();

        double absolvovaneKilometry = osobneAuto.absVzdalenost(10);

        if (osobneAuto.getMnozstvoPaliva() == 0) {osobneAuto.zastav();}

        Komponenty_Vozidla naraznik = Komponenty_Vozidla.NARAZNIK;
        Komponenty_Vozidla celeSklo = Komponenty_Vozidla.CELNE_SKLO;
        Komponenty_Vozidla svetla = Komponenty_Vozidla.SVETLA;

        System.out.println("Hodnota nárazníka: " + naraznik.getHodnotaVEurach() + " EUR");
        System.out.println("Hodnota čelného skla: " + celeSklo.getHodnotaVEurach() + " EUR");
        System.out.println("Hodnota svetiel: " + svetla.getHodnotaVEurach() + " EUR");

        Vypis_Spotrebu.vypisSpotrebu("src/com/Rudeichuk/Objekty/spotreba.txt");

        Prsten adamovPrsten = Prsten.ziskajInstanciu();
        adamovPrsten.nosPrsten();



    }
}