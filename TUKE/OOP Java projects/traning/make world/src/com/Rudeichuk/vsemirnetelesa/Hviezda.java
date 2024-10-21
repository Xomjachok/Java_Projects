package com.Rudeichuk.vsemirnetelesa;

public class Hviezda extends Vesmirne_Teleso{
    private String name;
    private double vaha;
    private double priemer;
    private boolean svietim;

    public boolean isSvietim() {
        return svietim;
    }

    private void setSvietim(boolean svietim) {
        this.svietim = svietim;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public double getVaha() {
        return vaha;
    }

    private void setVaha(double vaha) {
        this.vaha = vaha;
    }

    public double getPriemer() {
        return priemer;
    }

    private void setPriemer(double priemer) {
        this.priemer = priemer;
    }

    void sviet (){

    }
    void zhasni(){

    }
    public Hviezda (){
        if(!svietim){ zhasni();}
        else if (svietim == true) { sviet();}
    }
}
