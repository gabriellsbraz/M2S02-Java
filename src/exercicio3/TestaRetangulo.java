package exercicio3;

import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Largura: ");
        double largura = Double.parseDouble(scan.nextLine());

        System.out.println("Comprimento: ");
        double comprimento = Double.parseDouble(scan.nextLine());

        Retangulo retangulo = new Retangulo();
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        System.out.printf("Perímetro: %.2f%n", retangulo.perimetro());
        System.out.printf("Área: %.2f%n", retangulo.area());

    }
}
