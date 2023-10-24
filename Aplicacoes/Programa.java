package PadariaPoo.Aplicacoes;

import PadariaPoo.Entidades.*;

public class Programa {
    public static void main(String[] args) {
        BalcaoPadaria balcaoPadaria = new BalcaoPadaria();
        GeladeiraBebidas geladeiraBebidas = new GeladeiraBebidas();
        Operacoes menu = new Operacoes(balcaoPadaria,geladeiraBebidas);

        menu.menu();
        for (Massas elemento : balcaoPadaria.getMassas()) {
            System.out.println(elemento.getNome()+ elemento.getCodigo()+elemento.getValorUnitario()+elemento.getEstoque());
        }

        for (Bebidas elemento : geladeiraBebidas.getBebidas()) {
            System.out.println(elemento.getNome()+ elemento.getCodigo()+elemento.getValorUnitario()+elemento.getEstoque());
        }

    }
}
