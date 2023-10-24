package exercicio6;

import java.time.LocalDate;
import java.util.Scanner;

public class TestaPerfilDeSaude {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Informe o nome: ");
            String nome = scan.nextLine();
            System.out.println("Informe o sobrenome: ");
            String sobrenome = scan.nextLine();
            System.out.println("Informe o sexo: ");
            String sexo = scan.nextLine();
            System.out.println("Informe a data de nascimento (AAAA-MM-DD): ");
            String dataNascimentoStr = scan.nextLine();
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
            System.out.println("Informe a altura (metros): ");
            double altura = scan.nextDouble();
            System.out.println("Informe o peso (kg): ");
            double peso = scan.nextDouble();

            PerfilDeSaude perfil = new PerfilDeSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);

            System.out.println("Informações do Perfil de Saúde:");
            perfil.imprimir();
        }
    }
