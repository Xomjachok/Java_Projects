package com.Rudeichuk.Objekty;

public class Nakladne_Auto extends Vozidlo{
    private Motor motor;

    public Nakladne_Auto(Motor motor) {
        super(motor);
        this.motor = new Motor(motor.getVykon(), motor.getPocetValcov(), motor.getZdvihovyObjem(), motor.getSpotreba(), motor.getMnozstvoPaliva());
        motor.setSpotreba(motor.getSpotreba() * 1.2);
    }


    @Override
    public void zrychli() {
        System.out.println("Nakladne auto sa zrýchlilo.");
    }

    @Override
    public void zastav() {
        System.out.println("Nakladne auto sa zastavilo.");
    }


}

