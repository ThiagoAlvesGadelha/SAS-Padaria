package PadariaPoo.Entidades;

import java.util.ArrayList;
public class GeladeiraBebidas {

    private ArrayList<Bebidas> bebidas = new ArrayList<>();

    public ArrayList<PadariaPoo.Entidades.Bebidas> getBebidas() {

        return bebidas;
    }

    public void addBebidas(Bebidas bebidas) {

        this.bebidas.add(bebidas);
    }
}