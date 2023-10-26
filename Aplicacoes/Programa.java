package PadariaPoo.Aplicacoes;

import PadariaPoo.Entidades.*;

public class Programa {
    public static void main(String[] args) {
        BalcaoPadaria balcaoPadaria = new BalcaoPadaria();
        GeladeiraBebidas geladeiraBebidas = new GeladeiraBebidas();
        FreezerSorvetes freezerSorvetes = new FreezerSorvetes();
        Operacoes menu = new Operacoes(balcaoPadaria,geladeiraBebidas, freezerSorvetes);

        menu.menu();
        for (Massas elemento : balcaoPadaria.getMassas()) {
            System.out.println("Seção Balcão de Massas \n" +
                    "Nome do produto: "+ elemento.getNome()+". \n " +
                    "Codigo do Produto: "+ elemento.getCodigo()+". \n" +
                    "Preço da und: "+elemento.getValorUnitario()+". \n" +
                    "Estoque disponível: "+elemento.getEstoque()+". \n");
        }

        for (Bebidas elemento : geladeiraBebidas.getBebidas()) {
            System.out.println("Seção Geladeira de Bebidas \n" +
                    "Nome do produto: "+ elemento.getNome()+". \n " +
                    "Codigo do Produto: "+ elemento.getCodigo()+". \n" +
                    "Preço da und: "+elemento.getValorUnitario()+". \n" +
                    "Estoque disponível: "+elemento.getEstoque()+". \n");
        }

        for (Sorvetes elemento : freezerSorvetes.getSorvetes()) {
            System.out.println("Seção Freezer de Sorvetes \n" +
                    "Nome do produto: "+ elemento.getNome()+". \n " +
                    "Codigo do Produto: "+ elemento.getCodigo()+". \n" +
                    "Preço da und: "+elemento.getValorUnitario()+". \n" +
                    "Estoque disponível: "+elemento.getEstoque()+". \n");
        }
    }
}
