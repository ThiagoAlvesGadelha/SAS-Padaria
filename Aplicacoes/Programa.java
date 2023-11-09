package PadariaPoo.Aplicacoes;

import PadariaPoo.Entidades.*;

public class Programa {
    public static void main(String[] args) {
        BalcaoPadaria balcaoPadaria = new BalcaoPadaria();
        GeladeiraBebidas geladeiraBebidas = new GeladeiraBebidas();
        FreezerSorvetes freezerSorvetes = new FreezerSorvetes();
        Usuario novo = new Usuario();
        Operacoes usuario = new Operacoes(balcaoPadaria,geladeiraBebidas, freezerSorvetes,novo);

        novo.setSaldo(2000);
        usuario.menuPrincipal();

    }
}
