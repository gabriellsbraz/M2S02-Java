package exercicio4;

public class TestaFatura {

    public static void main(String[] args) {

        Fatura fatura = new Fatura("10","Boleto Senai", 9, 510.00);

        System.out.println("Número da Fatura: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço: " + fatura.getPreco());
        System.out.println("Valor da Fatura: " + fatura.getValorFatura());

    }
}
