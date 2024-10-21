package com.Rudeichuk.Objekty;

public class Osobne_Auto extends Vozidlo{
    private Motor motor;

    public Osobne_Auto(Motor motor ) {
        super(motor);
        this.motor = motor;
    }


    @Override
    public void zrychli() {
        System.out.println("Osobné auto sa zrýchlilo.");
    }

    @Override
    public void zastav() {
        System.out.println("Osobné auto sa zastavilo.");
    }



}
