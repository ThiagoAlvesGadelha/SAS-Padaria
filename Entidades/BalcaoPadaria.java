package PadariaPoo.Entidades;

import java.util.ArrayList;
public class BalcaoPadaria {
    private ArrayList<Massas> massas = new ArrayList<>();
    public ArrayList<PadariaPoo.Entidades.Massas> getMassas() {
        return massas;
    }
    public void addMassas(Massas massas) {
        this.massas.add(massas);
    }
}