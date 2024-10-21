package com.Rudeichuk.Objekty;

public abstract class Vozidlo implements Pohyb_Motorovych_Vozidiel {
    private Motor motor;
    private Komponenty_Vozidla naraznik;
    private Komponenty_Vozidla celneSklo;
    private Komponenty_Vozidla svetla;


    public Vozidlo(Motor motor) {
        this.motor = motor;

    }
    public abstract void zrychli();
    public abstract void zastav();

    public String getInfoOMotore() {
        return "Motor: Výkon - " + motor.getVykon() + ", Počet valcov - " + motor.getPocetValcov()
                + ", Zdvihový objem - " + motor.getZdvihovyObjem() + ", Spotreba - " + motor.getSpotreba()  + ", Mnoztvo Paliva - " + motor.getMnozstvoPaliva();
    }

    @Override
    public double absVzdalenost(double pocetKilometrov) {
        return motor.pohyb(pocetKilometrov);
    }
    public double getMnozstvoPaliva() {
        return motor.getMnozstvoPaliva();
    }
}
