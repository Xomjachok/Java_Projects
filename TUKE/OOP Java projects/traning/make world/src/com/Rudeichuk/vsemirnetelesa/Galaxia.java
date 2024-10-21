package com.Rudeichuk.vsemirnetelesa;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


public class Galaxia {
    private String meno;
    private List<Sustava> sustava = new ArrayList<>();

    public Galaxia(String meno)
    {
        this.meno = meno;
    }

    public String getMeno() {
        return meno;
    }
    @Override
    public String toString() {
        return "Galaxia " + this.meno;
    }

    public void addSustava(Sustava tato_sustava)
    {
        sustava.add(tato_sustava);
    }

    public List<Sustava> getSustava() {
        return sustava;
    }

    public void PosliSpravu(@NotNull Galaxia komu, String co)
    {
        System.out.println("Galaxia " + this.meno + " posiela spravu: " + co + " do galaxie " + komu );
        komu.PrijmiSpravu(this, co);
    }
    public void PrijmiSpravu(Galaxia od, String co)
    {
        System.out.println("Galaxia " + this.meno + " prijala spravu: " + co + " od galaxie " + od);
        System.out.println("Galaxia " + this.meno + " posiela spravu: Ahoj kamoš, ako sa maš? do galaxie " + od);

    }
}
