package PadariaPoo.Entidades;

import java.util.Scanner;

public class Operacoes {
    public int opcao;
    private BalcaoPadaria balcao;
    private GeladeiraBebidas geladeira;
    private FreezerSorvetes freezer;

    public Operacoes(BalcaoPadaria balcao, GeladeiraBebidas geladeira) {
        this.balcao = balcao;
        this.geladeira = geladeira;
    }

    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Seja bem vindo");
        System.out.println("O que vamos fazer");
        System.out.println("Cadastro");
        System.out.println("Realizar venda");
        System.out.println("Conferir estoque");
        System.out.println("Para cadastro digite a opção");
        System.out.println("Digite 1 para =  Balcão padaria");
        System.out.println("Digite 2 para = Bebidas");
        System.out.println("Digite 3 para = Sorvetes");
        opcao = scan.nextInt();
        scan.nextLine(); // FIM DO MENU

        while (opcao < 1) {
            System.out.println("Digite uma opção valida");
            opcao = scan.nextInt();
            scan.nextLine();
        }
        while (opcao == 1) {// SEÇÃO CADASTRO DO BALCÃO PADARIA
            System.out.println("Digite o nome da Massa");
            String nome = scan.nextLine();
            System.out.println("Digite o codigo do salgado: ");
            int codigo = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite o valor unitario do produto");
            double valor = Double.parseDouble(scan.nextLine());
            System.out.println("Digite a quantidade do estoque");
            int estoque = scan.nextInt();
            scan.nextLine();
            Massas massas = new Massas(codigo, nome, valor, estoque);
            this.balcao.addMassas(massas);
            System.out.println("Deseja cadastrar outra massa ?");
            System.out.println("Digite 1 para cadastrar uma nova ou 0 para sair");
            opcao = scan.nextInt();
            scan.nextLine();
            while (opcao < 1 || opcao > 5) {
                System.out.println("Digite uma opcao valida");
                opcao = scan.nextInt();
                scan.nextLine();
            }
        }
        while (opcao == 2) {//SEÇÃO CADASTRO DO GELADEIRA DE BEBIDAS
            System.out.println("Digite o nome da bebida");
            String nome = scan.nextLine();
            System.out.println("Digite o codigo do bebida: ");
            int codigo = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite o valor unitario do produto");
            double valor = Double.parseDouble(scan.nextLine());
            System.out.println("Digite a quantidade do estoque");
            int estoque = scan.nextInt();
            scan.nextLine();
            Bebidas bebidas = new Bebidas(codigo, nome, valor, estoque);
            this.geladeira.addBebidas(bebidas);
            System.out.println("Deseja cadastrar outra bebida ?");
            System.out.println("Digite 1 para cadastrar uma nova ou 3 para sair");
            opcao = scan.nextInt();
            scan.nextLine();
            while (opcao < 1 || opcao > 5) {
                System.out.println("Digite uma opcao valida");
                opcao = scan.nextInt();
                scan.nextLine();
            }
        }
        while (opcao == 3) {//SEÇÃO CADASTRO DO FREEZER DE SORVETES
            System.out.println("Digite o nome da bebida");
            String nome = scan.nextLine();
            System.out.println("Digite o codigo do bebida: ");
            int codigo = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite o valor unitario do produto");
            double valor = Double.parseDouble(scan.nextLine());
            System.out.println("Digite a quantidade do estoque");
            int estoque = scan.nextInt();
            scan.nextLine();
            Bebidas bebidas = new Bebidas(codigo, nome, valor, estoque);
            this.geladeira.addBebidas(bebidas);
            System.out.println("Deseja cadastrar outra bebida ?");
            System.out.println("Digite 1 para cadastrar uma nova ou 3 para sair");
            opcao = scan.nextInt();
            scan.nextLine();
            while (opcao < 1 || opcao > 4) {
                System.out.println("Digite uma opcao valida");
                opcao = scan.nextInt();
                scan.nextLine();
            }
        }
    }
}