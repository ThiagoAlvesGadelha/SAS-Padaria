package PadariaPoo.Entidades;

import java.util.Scanner;

public class Operacoes {
    public int opcao;
    private BalcaoPadaria balcao;
    private GeladeiraBebidas geladeira;
    private FreezerSorvetes freezer;
    public Usuario usuario;
    public double novosaldo;
    public int numero;


    public Operacoes(BalcaoPadaria balcaoPadaria, GeladeiraBebidas geladeiraBebidas, FreezerSorvetes freezerSorvetes, Usuario novo) {
        this.balcao = balcaoPadaria;
        this.geladeira = geladeiraBebidas;
        this.freezer = freezerSorvetes;
        this.usuario = novo;
    }
    public void menuDeCadastro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("########## Seja bem vindo ao Menu de Cadastro #########");
        System.out.println("Por onde vamos começar ?");
        System.out.println("Digite 1 para = Balcão padaria");
        System.out.println("Digite 2 para = Bebidas");
        System.out.println("Digite 3 para = Sorvetes");
        System.out.println("########################################################");
        opcao = scan.nextInt();
        scan.nextLine(); // FIM DO MENU

        if (opcao ==4)return;

        while (opcao < 1) {
            System.out.println("Digite uma opção valida");
            opcao = scan.nextInt();
            scan.nextLine();
        }
        while (opcao == 1) {// SEÇÃO CADASTRO DO BALCÃO PADARIA
            System.out.println("Digite o nome da Massa");
            String nome = scan.nextLine();
            System.out.println("Digite o codigo do produto: ");
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
            System.out.println("Digite 1 para cadastrar um produto da seção Balcão padaria");
            System.out.println("Digite 2 para cadastrar um produto da seção Bebidas");
            System.out.println("Digite 3 para cadastrar um produto da seção Sorvetes");
            System.out.println("Digite 4 para = Sair");
            System.out.println("___________________________________");
            opcao = scan.nextInt();
            scan.nextLine();
                if( opcao == 4 ) {
                    System.out.println("Obrigado por usar nosso sistema, até a proxima.");
                    menuPrincipal();
                }else {
                    while (opcao < 1 || opcao > 5) {
                        System.out.println("Digite uma opcao valida");
                        opcao = scan.nextInt();
                        scan.nextLine();
                    }
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
            System.out.println("Digite 1 para cadastrar um produto da seção Balcão padaria");
            System.out.println("Digite 2 para cadastrar um produto da seção Bebidas");
            System.out.println("Digite 3 para cadastrar um produto da seção Sorvetes");
            System.out.println("Digite 4 para = Sair");
            System.out.println("___________________________________");
            opcao = scan.nextInt();
            scan.nextLine();
            if( opcao == 4 ) {
                System.out.println("Obrigado por usar nosso sistema, até a proxima.");
                menuPrincipal();
            }else {
                while (opcao < 1 || opcao > 5) {
                    System.out.println("Digite uma opcao valida");
                    opcao = scan.nextInt();
                    scan.nextLine();
                }
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
            System.out.println("Digite 1 para cadastrar um produto da seção Balcão padaria");
            System.out.println("Digite 2 para cadastrar um produto da seção Bebidas");
            System.out.println("Digite 3 para cadastrar um produto da seção Sorvetes");
            System.out.println("Digite 4 para = Sair");
            System.out.println("___________________________________");
            opcao = scan.nextInt();
            scan.nextLine();
            if( opcao == 4 ) {
                System.out.println("Obrigado por usar nosso sistema, até a proxima.");
                menuPrincipal();
            }else {
                while (opcao < 1 || opcao > 5) {
                    System.out.println("Digite uma opcao valida");
                    opcao = scan.nextInt();
                    scan.nextLine();
                }
            }
        }
    }
    public void Credito(double valor){
        this.usuario.setSaldo(valor);
    }
    public void Debito(double valor){
        this.novosaldo = this.usuario.getSaldo() - valor;
        this.usuario.setSaldo(this.novosaldo);
        if (valor > this.usuario.getSaldo()){
            System.out.println("Compra não aprovada \n" +
                    "Seu saldo é: R$ " + this.usuario.getSaldo() +".");
        }else{
            System.out.println("Compra aprovada no valor de : R$ " + valor +".");
            System.out.println("Saldo disponível: R$ "+this.usuario.getSaldo());
        }
    }
    public void ListProdutosBalcaoPadaria(){
        int numero = 0;
        for (Massas elemento : this.balcao.getMassas()) {
            System.out.println("Seção Balcão");
            System.out.println("Produto - " + numero++ +"\n"+
                    "Nome do produto: "+ elemento.getNome()+". \n " +
                    "Codigo do Produto: "+ elemento.getCodigo()+". \n" +
                    "Preço da und: "+elemento.getValorUnitario()+". \n" +
                    "Estoque disponível: "+elemento.getEstoque()+". \n");
        }

    }
    public void ListProdutosGeladeiraBebidas(){
        int numero = 0;
        for (Bebidas elemento : this.geladeira.getBebidas()) {
            System.out.println("Seção Geladeira de Bebidas");
            System.out.println("Produto - " + numero++ +"\n"+
                    "Nome do produto: "+ elemento.getNome()+". \n " +
                    "Codigo do Produto: "+ elemento.getCodigo()+". \n" +
                    "Preço da und: "+elemento.getValorUnitario()+". \n" +
                    "Estoque disponível: "+elemento.getEstoque()+". \n");
        }
    }
    public void ListProdutosFreezerSorvetes(){
        int numero = 0;
        for (Sorvetes elemento : this.freezer.getSorvetes()) {
            System.out.println("Seção Sorvetes");
            System.out.println("Produto - " + numero++ +"\n"+
                    "Nome do produto: "+ elemento.getNome()+". \n " +
                    "Codigo do Produto: "+ elemento.getCodigo()+". \n" +
                    "Preço da und: "+elemento.getValorUnitario()+". \n" +
                    "Estoque disponível: "+elemento.getEstoque()+". \n");
        }

    }
    public void menuDeCompra(){
        Scanner scan = new Scanner(System.in);


        System.out.println("Escolha a seção que gostaria de comprar");
        System.out.println("Digite 1 para: Seção Freezer");
        System.out.println("Digite 2 para: Seção Balcão");
        System.out.println("Digite 3 para: Seção Geladeira");
        System.out.println("Digite 4 para: Sair");
        opcao = scan.nextInt();scan.nextLine();

        if (opcao ==4)return;

        while (opcao < 1 || opcao > 5){
            System.out.println("Digite uma opção valida");
            opcao = scan.nextInt();scan.nextLine();
        }

        while (opcao == 1){
            System.out.println("Seja bem vindo a Seção Freezer");
            System.out.println("Esses são nossos produtos disponíveis");
            ListProdutosFreezerSorvetes();

            int quantidadeItens = this.freezer.getSorvetes().size();

        System.out.println("Digite: 1 para: Produto 1 \n" +
                "Ou digite outro numero para escolher outro produto");
        int numero = scan.nextInt();scan.nextLine();

        while (numero < -1 || numero > quantidadeItens ){
            System.out.println("Digite um numero valido");
            numero = scan.nextInt();scan.nextLine();
        }
        int indiceDesejado = --numero;
        Sorvetes elementoDesejado = this.freezer.getSorvetes().get(indiceDesejado);
        System.out.println("Seção Sorvetes \n" +
                "Nome do produto: " + elementoDesejado.getNome() + ". \n " +
                "Codigo do Produto: " + elementoDesejado.getCodigo() + ". \n" +
                "Preço da und: " + elementoDesejado.getValorUnitario() + ". \n" +
                "Estoque disponível: " + elementoDesejado.getEstoque() + ". \n");

        System.out.println("Quantas unidades vai querer ?");
        numero = scan.nextInt();scan.nextLine();

        while (numero <= 0 || numero > elementoDesejado.getEstoque()){
            System.out.println("Nosso estoque é de apenas: "+ elementoDesejado.getEstoque());
            System.out.println("Digite um numero valido");
            System.out.println("Quantas unidades vai querer ?");
            numero = scan.nextInt();scan.nextLine();
        }

        double total = numero * elementoDesejado.getValorUnitario();
        System.out.println("O total é de: R$ " + total);
            System.out.println("Para finalizar a compra digite 1 ou qualquer outro numero para sair.");
            numero = scan.nextInt();scan.nextLine();
            if (numero == 1)System.out.println("Aguarde um momento enquanto a transação é executada");
            else menuDeCompra();

        if (total > this.usuario.getSaldo()){
            System.out.println("Compra não aprovada \n" +
                    "Seu saldo é: R$ " + this.usuario.getSaldo() +".");
            System.out.println("A operação será finalizada, e o senhor poderá retornar quando for resolvido.");
        } else {
            Debito(total);
            elementoDesejado.setEstoque(elementoDesejado.getEstoque() - numero);
            System.out.println("Obrigado e volte sempre");
            System.out.println("_____________________________________________________________________________");
        }
        System.out.println("Deseja comprar algum outro produto ?");
        System.out.println("Digite 1 para ir ao menu ou 2 para sair");
        numero = scan.nextInt();scan.nextLine();
        if( numero == 1 ) this.menuDeCompra();
        else {
            System.out.println("Obrigado por comprar em nossa loja");
            System.out.println("_____________________________________________________________________________");
            menuPrincipal();

        }
    }

        while (opcao == 2){
            System.out.println("Seja bem vindo a Seção Balcão");
            System.out.println("Esses são nossos produtos disponíveis");
            ListProdutosBalcaoPadaria();


            int quantidadeItens = this.balcao.getMassas().size();

            System.out.println("Digite: 1 para: Produto 1 \n" +
                    "Ou digite outro numero para escolher outro produto");
            int numero = scan.nextInt();scan.nextLine();

            while (numero < -1 || numero > quantidadeItens ){
                System.out.println("Digite um numero valido");
                numero = scan.nextInt();scan.nextLine();
            }
            int indiceDesejado = --numero;
            Massas elementoDesejado = this.balcao.getMassas().get(indiceDesejado);
            System.out.println("Seção Massas \n" +
                    "Nome do produto: " + elementoDesejado.getNome() + ". \n " +
                    "Codigo do Produto: " + elementoDesejado.getCodigo() + ". \n" +
                    "Preço da und: " + elementoDesejado.getValorUnitario() + ". \n" +
                    "Estoque disponível: " + elementoDesejado.getEstoque() + ". \n");

            System.out.println("Quantas unidades vai querer ?");
            numero = scan.nextInt();scan.nextLine();

            while (numero <= 0 || numero > elementoDesejado.getEstoque()){
                System.out.println("Nosso estoque é de apenas: "+ elementoDesejado.getEstoque());
                System.out.println("Digite um numero valido");
                System.out.println("Quantas unidades vai querer ?");
                numero = scan.nextInt();scan.nextLine();
            }

            double total = numero * elementoDesejado.getValorUnitario();
            System.out.println("O total é de: R$ " + total);
            System.out.println("Para finalizar a compra digite 1 ou qualquer outro numero para sair.");
            numero = scan.nextInt();scan.nextLine();

            if (numero == 1)System.out.println("Aguarde um momento enquanto a transação é executada");
            else menuDeCompra();

            if (total > this.usuario.getSaldo()){
                System.out.println("Compra não aprovada \n" +
                        "Seu saldo é: R$ " + this.usuario.getSaldo() +".");
                System.out.println("A operação será finalizada, e o senhor poderá retornar quando for resolvido.");
            } else {
                Debito(total);
                elementoDesejado.setEstoque(elementoDesejado.getEstoque() - numero);
                System.out.println("Obrigado e volte sempre");
                System.out.println("_____________________________________________________________________________");
            }
            System.out.println("Deseja comprar algum outro produto ?");
            System.out.println("Digite 1 para ir ao menu ou 2 para sair");
            numero = scan.nextInt();scan.nextLine();
            if( numero == 1 ) this.menuDeCompra();
            else {
                System.out.println("Obrigado por comprar em nossa loja");
                System.out.println("_____________________________________________________________________________");
                menuPrincipal();

            }
        }

        while (opcao == 3){
            System.out.println("Seja bem vindo a Seção Geladeira,");
            System.out.println("Esses são nossos produtos disponíveis");
            ListProdutosGeladeiraBebidas();


            int quantidadeItens = this.geladeira.getBebidas().size();

            System.out.println("Digite: 1 para: Produto 1 \n" +
                    "Ou digite outro numero para escolher outro produto");
            int numero = scan.nextInt();scan.nextLine();

            while (numero < -1 || numero > quantidadeItens ){
                System.out.println("Digite um numero valido");
                numero = scan.nextInt();scan.nextLine();
            }
            int indiceDesejado = --numero;
            Bebidas elementoDesejado = this.geladeira.getBebidas().get(indiceDesejado);
            System.out.println("Seção Massas \n" +
                    "Nome do produto: " + elementoDesejado.getNome() + ". \n " +
                    "Codigo do Produto: " + elementoDesejado.getCodigo() + ". \n" +
                    "Preço da und: " + elementoDesejado.getValorUnitario() + ". \n" +
                    "Estoque disponível: " + elementoDesejado.getEstoque() + ". \n");

            System.out.println("Quantas unidades vai querer ?");
            numero = scan.nextInt();scan.nextLine();

            while (numero <= 0 || numero > elementoDesejado.getEstoque()){
                System.out.println("Nosso estoque é de apenas: "+ elementoDesejado.getEstoque());
                System.out.println("Digite um numero valido");
                System.out.println("Quantas unidades vai querer ?");
                numero = scan.nextInt();scan.nextLine();
            }

            double total = numero * elementoDesejado.getValorUnitario();
            System.out.println("O total é de: R$ " + total);
            System.out.println("Para finalizar a compra digite 1 ou qualquer outro numero para sair.");
            numero = scan.nextInt();scan.nextLine();

            if (numero == 1)System.out.println("Aguarde um momento enquanto a transação é executada");
            else menuDeCompra();

            if (total > this.usuario.getSaldo()){
                System.out.println("Compra não aprovada \n" +
                        "Seu saldo é: R$ " + this.usuario.getSaldo() +".");
                System.out.println("A operação será finalizada, e o senhor poderá retornar quando for resolvido.");
            } else {
                Debito(total);
                elementoDesejado.setEstoque(elementoDesejado.getEstoque() - numero);
                System.out.println("Obrigado e volte sempre");
                System.out.println("_____________________________________________________________________________");
            }
            System.out.println("Deseja comprar algum outro produto ?");
            System.out.println("Digite 1 para ir ao menu ou 2 para sair");
            numero = scan.nextInt();scan.nextLine();
            if( numero == 1 ) this.menuDeCompra();
            else {
                System.out.println("Obrigado por comprar em nossa loja");
                System.out.println("_____________________________________________________________________________");
                menuPrincipal();

            }
        }
    }
    public void menuPrincipal(){
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("Seja bem vindo a #SuaPadariaAqui#");
        System.out.println("Antes de continuar me informe o que vamos fazer");
        System.out.println("Digite: \n" +
                " 1 para Cadastro de Produto \n" +
                " 2 para Comprar produto\n" +
                " 3 para Sair");
        opcao = scan.nextInt();scan.nextLine();

        while (opcao < 1 || opcao > 4){
            System.out.println("Digite uma opção valida");
            opcao = scan.nextInt();scan.nextLine();
        }

        if (opcao == 3) return;

        while (opcao == 1){
            menuDeCadastro();
        }
        while (opcao ==2){
            menuDeCompra();
        }


    }

}