package com.Rudeichuk.vsemirnetelesa;

public class Vesmirne_Teleso{
    private String typ;
    private String meno;
//    public Vesmirne_Teleso(String meno, String typ) {
//        this.meno = meno;
//        this.typ = typ;
//    }

    public String getMeno() {
        return meno;
    }

    public Vesmirne_Teleso(String meno) {
        this.meno = meno;
    }

    public String getTyp() {
        return typ;
    }

    protected void setTyp(String typ) {
        this.typ = typ;
    }

    public Vesmirne_Teleso() {
    }
}
