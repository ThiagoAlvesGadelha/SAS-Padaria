package PadariaPoo.Entidades;

import java.util.Scanner;

public class Operacoes {
    public int opcao;
    private BalcaoPadaria balcao;
    private GeladeiraBebidas geladeira;
    private FreezerSorvetes freezer;
    public Usuario saldo;
    public double novosaldo;

    public Operacoes(BalcaoPadaria balcao, GeladeiraBebidas geladeira, FreezerSorvetes freezer) {
        this.balcao = balcao;
        this.geladeira = geladeira;
        this.freezer = freezer;
    }
    public void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("########## Seja bem vindo #########");
        System.out.println("O que deseja cadastrar?");
        System.out.println("Digite 1 para =  Balcão padaria");
        System.out.println("Digite 2 para = Bebidas");
        System.out.println("Digite 3 para = Sorvetes");
        System.out.println("###################################");
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
            System.out.println("Produto Cadastrado!");
            System.out.println("___________________________________");
            System.out.println("Ainda vamos fazer algo?");
            System.out.println("Digite 1 para =  Balcão padaria");
            System.out.println("Digite 2 para = Bebidas");
            System.out.println("Digite 3 para = Sorvetes");
            System.out.println("Digite 4 para = Sair");
            System.out.println("___________________________________");
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
            System.out.println("Produto Cadastrado!");
            System.out.println("___________________________________");
            System.out.println("Ainda vamos fazer algo?");
            System.out.println("Digite 1 para =  Balcão padaria");
            System.out.println("Digite 2 para = Bebidas");
            System.out.println("Digite 3 para = Sorvetes");
            System.out.println("Digite 4 para = Sair");
            System.out.println("___________________________________");
            opcao = scan.nextInt();
            scan.nextLine();
            while (opcao < 1 || opcao > 5) {
                System.out.println("Digite uma opcao valida");
                opcao = scan.nextInt();
                scan.nextLine();
            }
        }
        while (opcao == 3) {//SEÇÃO CADASTRO DO FREEZER DE SORVETES
            System.out.println("Digite o nome do sorvete");
            String nome = scan.nextLine();
            System.out.println("Digite o codigo do sorvete: ");
            int codigo = scan.nextInt();
            scan.nextLine();
            System.out.println("Digite o valor unitario do sorvete");
            double valor = Double.parseDouble(scan.nextLine());
            System.out.println("Digite a quantidade do estoque");
            int estoque = scan.nextInt();
            scan.nextLine();
            Sorvetes sorvetes = new Sorvetes(codigo, nome, valor, estoque);
            this.freezer.addSorvetes(sorvetes);
            System.out.println("Produto Cadastrado!");
            System.out.println("___________________________________");
            System.out.println("Ainda vamos fazer algo?");
            System.out.println("Digite 1 para =  Balcão padaria");
            System.out.println("Digite 2 para = Bebidas");
            System.out.println("Digite 3 para = Sorvetes");
            System.out.println("Digite 4 para = Sair");
            System.out.println("___________________________________");
            opcao = scan.nextInt();
            scan.nextLine();
            while (opcao < 1 || opcao > 5) {
                System.out.println("Digite uma opcao valida");
                opcao = scan.nextInt();
                scan.nextLine();
            }
        }
    }
    public void Credito(double valor){
        this.saldo.setSaldo(valor);
    }
    public void Debito(double valor){
        this.novosaldo = this.saldo.getSaldo() - valor;
        this.saldo.setSaldo(this.novosaldo);
        if (valor > this.saldo.getSaldo()){
            System.out.println("Compra não aprovada \n" +
                    "Seu saldo é: R$ " + this.saldo +".");
        }else{
            System.out.println("Compra aprovada no valor de : R$ " + valor +".");
            System.out.println("Saldo disponível: R$ "+this.saldo);
        }
    }
    public void ListProdutosBalcaoPadaria(){
        BalcaoPadaria balcaoPadaria = new BalcaoPadaria();
        int numero = 0;
        for (Massas elemento : balcaoPadaria.getMassas()) {
            System.out.println("Seção Balcão");
            System.out.println("Produto - " + numero++ +"\n"+
                    "Nome do produto: "+ elemento.getNome()+". \n " +
                    "Codigo do Produto: "+ elemento.getCodigo()+". \n" +
                    "Preço da und: "+elemento.getValorUnitario()+". \n" +
                    "Estoque disponível: "+elemento.getEstoque()+". \n");
        }

    }
    public void ListProdutosGeladeiraBebidas(){
        GeladeiraBebidas geladeiraBebidas = new GeladeiraBebidas();
        int numero = 0;
        for (Bebidas elemento : geladeiraBebidas.getBebidas()) {
            System.out.println("Seção Geladeira de Bebidas");
            System.out.println("Produto - " + numero++ +"\n"+
                    "Nome do produto: "+ elemento.getNome()+". \n " +
                    "Codigo do Produto: "+ elemento.getCodigo()+". \n" +
                    "Preço da und: "+elemento.getValorUnitario()+". \n" +
                    "Estoque disponível: "+elemento.getEstoque()+". \n");
        }
    }
    public void ListProdutosFreezerSorvetes(){
        FreezerSorvetes freezerSorvetes = new FreezerSorvetes();
        for (Sorvetes elemento : freezerSorvetes.getSorvetes()) {
            int numero = 0;
            System.out.println("Seção Balcão");
            System.out.println("Produto - " + numero++ +"\n"+
                    "Nome do produto: "+ elemento.getNome()+". \n " +
                    "Codigo do Produto: "+ elemento.getCodigo()+". \n" +
                    "Preço da und: "+elemento.getValorUnitario()+". \n" +
                    "Estoque disponível: "+elemento.getEstoque()+". \n");
        }

    }
    public void Comprarproduto(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a seção que gostaria de comprar");
        System.out.println("Digite 1 para: Seção Freezer");
        System.out.println("Digite 2 para: Seção Balcão");
        System.out.println("Digite 3 para: Seção Geladeira");
        opcao = scan.nextInt();scan.nextLine();

        while (opcao < 1 || opcao > 3){
            System.out.println("Digite uma opção valida");
            opcao = scan.nextInt();scan.nextLine();
        }

        while (opcao == 1){
            FreezerSorvetes freezerSorvetes = new FreezerSorvetes();
            System.out.println("Seja bem vindo a Seção Freezer");
            System.out.println("Esses são nossos produtos disponíveis");
            ListProdutosFreezerSorvetes();

            int quantidadeItens = freezerSorvetes.getSorvetes().size();

            System.out.println("Digite: 1 para: Produto 1 \n" +
                    "Ou digite outro numero para escolher outro produto");
            int numero = scan.nextInt();scan.nextLine();

            while (numero < 1 || numero > quantidadeItens ){
                System.out.println("Digite um numero valido");
                numero = scan.nextInt();scan.nextLine();
            }
            int indiceDesejado = numero--;
            Sorvetes elementoDesejado = freezerSorvetes.getSorvetes().get(indiceDesejado);
            System.out.println("Seção Balcão de Massas \n" +
                    "Nome do produto: " + elementoDesejado.getNome() + ". \n " +
                    "Codigo do Produto: " + elementoDesejado.getCodigo() + ". \n" +
                    "Preço da und: " + elementoDesejado.getValorUnitario() + ". \n" +
                    "Estoque disponível: " + elementoDesejado.getEstoque() + ". \n");

            System.out.println("Quantas unidades vai querer ?");
            numero = scan.nextInt();scan.nextLine();

            while (numero < elementoDesejado.getEstoque() ||numero > elementoDesejado.getEstoque()){
                System.out.println("Nosso estoque é de apenas: "+ elementoDesejado.getEstoque());
                System.out.println("Digite um numero valido");
                System.out.println("Quantas unidades vai querer ?");
                numero = scan.nextInt();scan.nextLine();
            }

            double total = numero * elementoDesejado.getValorUnitario();
            System.out.println("O total é de: R$ " + total);
            System.out.println("Insira seu cartão de Debito");
            if (total > this.saldo.getSaldo()){
                System.out.println("Compra não aprovada \n" +
                        "Seu saldo é: R$ " + this.saldo +".");
                System.out.println("A operação será finalizada, e o senhor poderá retornar quando for resolvido.");
            } else {
                Debito(total);
                System.out.println("Obrigado e volte sempre");
            }
        }

        while (opcao == 2){
            BalcaoPadaria balcaoPadaria = new BalcaoPadaria();
            System.out.println("Seja bem vindo a Seção Balcão");
            System.out.println("Esses são nossos produtos disponíveis");
            ListProdutosBalcaoPadaria();

            int quantidadeItens = balcaoPadaria.getMassas().size();

            System.out.println("Digite: 1 para: Produto 1 \n" +
                    "Ou digite outro numero para escolher outro produto");
            int numero = scan.nextInt();scan.nextLine();

            while (numero < 1 || numero > quantidadeItens ){
                System.out.println("Digite um numero valido");
                numero = scan.nextInt();scan.nextLine();
            }
            int indiceDesejado = numero--;
            Massas elementoDesejado = balcaoPadaria.getMassas().get(indiceDesejado);
            System.out.println("Seção Balcão de Massas \n" +
                    "Nome do produto: " + elementoDesejado.getNome() + ". \n " +
                    "Codigo do Produto: " + elementoDesejado.getCodigo() + ". \n" +
                    "Preço da und: " + elementoDesejado.getValorUnitario() + ". \n" +
                    "Estoque disponível: " + elementoDesejado.getEstoque() + ". \n");

            System.out.println("Quantas unidades vai querer ?");
            numero = scan.nextInt();scan.nextLine();

            while (numero < elementoDesejado.getEstoque() ||numero > elementoDesejado.getEstoque()){
                System.out.println("Nosso estoque é de apenas: "+ elementoDesejado.getEstoque());
                System.out.println("Digite um numero valido");
                System.out.println("Quantas unidades vai querer ?");
                numero = scan.nextInt();scan.nextLine();
            }

            double total = numero * elementoDesejado.getValorUnitario();
            System.out.println("O total é de: R$ " + total);
            System.out.println("Insira seu cartão de Debito");
            if (total > this.saldo.getSaldo()){
                System.out.println("Compra não aprovada \n" +
                        "Seu saldo é: R$ " + this.saldo +".");
                System.out.println("A operação será finalizada, e o senhor poderá retornar quando for resolvido.");
            } else {
                Debito(total);
                System.out.println("Obrigado e volte sempre");
            }
        }

        while (opcao == 3){
            GeladeiraBebidas geladeiraBebidas = new GeladeiraBebidas();
            System.out.println("Seja bem vindo a Seção Balcão");
            System.out.println("Esses são nossos produtos disponíveis");
            ListProdutosGeladeiraBebidas();

            int quantidadeItens = geladeiraBebidas.getBebidas().size();

            System.out.println("Digite: 1 para: Produto 1 \n" +
                    "Ou digite outro numero para escolher outro produto");
            int numero = scan.nextInt();scan.nextLine();

            while (numero < 1 || numero > quantidadeItens ){
                System.out.println("Digite um numero valido");
                numero = scan.nextInt();scan.nextLine();
            }
            int indiceDesejado = numero--;
            Bebidas elementoDesejado = geladeiraBebidas.getBebidas().get(indiceDesejado);
            System.out.println("Seção Balcão de Massas \n" +
                    "Nome do produto: " + elementoDesejado.getNome() + ". \n " +
                    "Codigo do Produto: " + elementoDesejado.getCodigo() + ". \n" +
                    "Preço da und: " + elementoDesejado.getValorUnitario() + ". \n" +
                    "Estoque disponível: " + elementoDesejado.getEstoque() + ". \n");

            System.out.println("Quantas unidades vai querer ?");
            numero = scan.nextInt();scan.nextLine();

            while (numero < elementoDesejado.getEstoque() ||numero > elementoDesejado.getEstoque()){
                System.out.println("Nosso estoque é de apenas: "+ elementoDesejado.getEstoque());
                System.out.println("Digite um numero valido");
                System.out.println("Quantas unidades vai querer ?");
                numero = scan.nextInt();scan.nextLine();
            }

            double total = numero * elementoDesejado.getValorUnitario();
            System.out.println("O total é de: R$ " + total);
            System.out.println("Insira seu cartão de Debito");
            if (total > this.saldo.getSaldo()){
                System.out.println("Compra não aprovada \n" +
                        "Seu saldo é: R$ " + this.saldo +".");
                System.out.println("A operação será finalizada, e o senhor poderá retornar quando for resolvido.");
            } else {
                Debito(total);
                System.out.println("Obrigado e volte sempre");
            }
        }
    }

}