package exercicio4;

public class Fatura {

    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0.0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
    }

    public double getValorFatura() {
        return this.preco * this.quantidade;
    }
}
