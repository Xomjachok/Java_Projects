package com.Rudeichuk.vsemirnetelesa;


public class Slnecna_Sustava extends Sustava{
    private Hviezda slnko;
    private int Object_counter;

    public int getObject_counter() {
        return Object_counter;
    }

    public void setObject_counter(int object_counter) {
        Object_counter = object_counter;
    }
    public void addTeleso(Vesmirne_Teleso nove_teleso)
    {
        setObject_counter(0);
        Obezne_telesa[Object_counter] = nove_teleso;
        Object_counter++;
        slnko = new Hviezda();
        Object_counter++;
        Obezne_telesa[Object_counter] = new Planeta(432432, 432432, "Mars");
        Object_counter++;
        Obezne_telesa[Object_counter] = new Planeta(5555, 32342, "Venusa");
        Object_counter++;
//        Obezne_telesa[Object_counter] = new Hviezda(6666.6, 3234.2, "Polarka");
//        Object_counter++;
//        Obezne_telesa[Object_counter] = new Kometa(555.5, 3234.2, "Opice");
//        Object_counter++;

    }

    private Vesmirne_Teleso[] Obezne_telesa = new Vesmirne_Teleso[500000000];

    public Slnecna_Sustava(String meno){
        super(meno);
    }

    public void CoToJe (){
        System.out.println("To to je Tesla, ktoru poslal Ilon Mask v Kosmos ¯\\_₍⸍⸌̣ʷ̣̫⸍̣⸌₎_//¯");
    }
}
