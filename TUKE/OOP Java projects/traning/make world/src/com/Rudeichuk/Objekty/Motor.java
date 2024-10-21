package com.Rudeichuk.Objekty;

import java.io.*;

public class Motor {
    private int vykon;
    private int pocetValcov;
    private double zdvihovyObjem;
    private double spotreba;
    private double mnozstvoPaliva;

    public Motor(int vykon, int pocetValcov, double zdvihovyObjem, double spotreba, double mnozstvoPaliva) {
        this.vykon = vykon;
        this.pocetValcov = pocetValcov;
        this.zdvihovyObjem = zdvihovyObjem;
        this.spotreba = spotreba;
        this.mnozstvoPaliva = mnozstvoPaliva;
    }
    public double pohyb (double pocetKilometrov){
        double prejdenaVzdialenost = mnozstvoPaliva / spotreba;
        mnozstvoPaliva -= prejdenaVzdialenost * spotreba ;
        if (prejdenaVzdialenost >= pocetKilometrov)
        {
            mnozstvoPaliva = (prejdenaVzdialenost - pocetKilometrov) * spotreba;
            zapisSpotrebuDoSuboru(spotreba, prejdenaVzdialenost);
            System.out.printf("Sme sa prešli - %.2fkm. Sme sa dostali do mesta. Zostalo nám %.2fL paliva. %n", prejdenaVzdialenost, mnozstvoPaliva);
        } else if (prejdenaVzdialenost < pocetKilometrov) {
            zapisSpotrebuDoSuboru(spotreba, prejdenaVzdialenost);
            System.out.printf("Sme sa prešli - %.2fkm. Sme sa nedostali do mesta. Zostalo nám %.2fL paliva. %n", prejdenaVzdialenost, mnozstvoPaliva);
        }
        if (mnozstvoPaliva != 0)
        {
            prejdenaVzdialenost = mnozstvoPaliva / spotreba;
            mnozstvoPaliva -= prejdenaVzdialenost * spotreba;
            zapisSpotrebuDoSuboru(spotreba, prejdenaVzdialenost);
            System.out.printf("Jazdili sme ešte %.2fkm, Palivá sa zostalo %.2fL. %n", prejdenaVzdialenost, mnozstvoPaliva);
        }
        return prejdenaVzdialenost;
    }

    public void zapisSpotrebuDoSuboru(double spotreba, double prejdenaVzdialenost) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/com/Rudeichuk/Objekty/spotreba.txt", true))) {
            writer.write("Spotreba: " + String.format("%.2f", spotreba) + " L/km prejdeno " + String.format("%.2f", prejdenaVzdialenost) + "km" + " celkovo " + String.format("%.2f", spotreba * prejdenaVzdialenost)+"km\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int getVykon() {
        return vykon;
    }

    public void setVykon(int vykon) {
        this.vykon = vykon;
    }

    public int getPocetValcov() {
        return pocetValcov;
    }

    public void setPocetValcov(int pocetValcov) {
        this.pocetValcov = pocetValcov;
    }

    public double getZdvihovyObjem() {
        return zdvihovyObjem;
    }

    public void setZdvihovyObjem(double zdvihovyObjem) {
        this.zdvihovyObjem = zdvihovyObjem;
    }

    public double getSpotreba() {
        return spotreba;
    }

    public void setSpotreba(double spotreba) {
        this.spotreba = spotreba;
    }

    public double getMnozstvoPaliva() {
        return mnozstvoPaliva;
    }

    public void setMnozstvoPoliva(double mnozstvoPoliva) {
        this.mnozstvoPaliva = mnozstvoPoliva;
    }

}
