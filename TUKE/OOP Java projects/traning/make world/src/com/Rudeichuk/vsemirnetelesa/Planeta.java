package com.Rudeichuk.vsemirnetelesa;

public class Planeta extends Vesmirne_Teleso{
    public Planeta(double vaha, double priemer, String name) {
//        setVaha((vaha));
        setPriemer(priemer);
        setName(name);
//        setGravitacia(9.81);
    }

//    public Planeta(double gravitacia) {
//        this.gravitacia = gravitacia;
//    }
//
//    void increaseGravity(double add)
//    {
//        gravitacia += add;
//    }
//    void decreaseGravity (double dec)
//    {
//        gravitacia -= dec;
//    }
    private String name;
    private double vaha;
    private double priemer;
//    private double gravitacia;
//    private Boolean weightSet = false;

//    public double getGravitacia() {
//        return gravitacia;
//    }

//    private void setGravitacia(double gravitacia) {
//        this.gravitacia = gravitacia;
//    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getVaha() {
        return vaha;
    }

//    private void setVaha(double vaha) {
//        this.vaha = vaha;
//
//        if (vaha <= vaha + 1000) {
//            int a = 1;
//            while (vaha <= vaha + 1000) {
////                increaseGravity(0.1);
//                this.vaha = vaha - 1000;
//                a++;
//            }
//            this.vaha = vaha + (1000 ^ a);
//            System.out.println("Dokelu, pribrala som");
//        }
//        if (vaha <=  vaha - 1000) {
//            int a = 0;
//            while (vaha <= vaha - 1000) {
////                increaseGravity(0.1);
//                this.vaha = vaha + 1000;
//                a++;
//            }
//            this.vaha = vaha - (1000 ^ a);
//            System.out.println("Ja chudnem");
//        }
////        if (vaha <=  vaha + 2000)      { System.out.println("Sakra, mooooc som pribrala");}
////        if (vaha <=  vaha - 2000)      { System.out.println("Ja chudnem veľmi");}
//    }

    public double getPriemer() {
        return priemer;
    }

    private void setPriemer(double priemer) {
        this.priemer = priemer;
    }


}
