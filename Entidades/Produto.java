package PadariaPoo.Entidades;

public abstract class Produto {
    private String nome;
    private int codigo = 0;
    private double valorUnitario;
    private int estoque;

    public Produto(int codigo, String nome, double valor, int estoque){
        this.codigo = codigo;
        this.nome = nome;
        this.valorUnitario = valor;
        this.estoque = estoque;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void incluirEstoque(int quantidade){
        estoque = estoque + quantidade;
    }
    public void tirarEstoque(int quantidade){
        if (quantidade <= estoque){
            estoque = estoque - quantidade;
        }else {
            System.out.println("Estoque indisponivel!!");
        }
    }
}
