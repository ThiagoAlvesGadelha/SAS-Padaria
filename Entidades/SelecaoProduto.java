package PadariaPoo.Entidades;

import java.util.Scanner;

public class SelecaoProduto{
    int codigo;
    String nome;
    Scanner scan = new Scanner(System.in);
    public SelecaoProduto() {
        this.codigo = scan.nextInt();scan.nextLine();
        this.nome = scan.nextLine();
    }


}
