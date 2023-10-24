package PadariaPoo.Entidades;

import java.util.ArrayList;

public class FreezerSorvetes {

    private ArrayList<Sorvetes> sorvetes = new ArrayList<>();

    public ArrayList<PadariaPoo.Entidades.Sorvetes> getSorvetes() {
        return sorvetes;
    }

    public void addSorvetes(Sorvetes sorvetes) {
        this.sorvetes.add(sorvetes);
    }

}