package exercicio1;

public class TestaData {
    public static void main(String[] args) {
        Data data = new Data(9,28,2023);

        System.out.println("Data inicial: ");
        data.exibirData();

        data.setMes(12);
        data.setDia(19);
        data.setAno(2022);

        System.out.println("Data após alteração:");
        data.exibirData();
    }
}
