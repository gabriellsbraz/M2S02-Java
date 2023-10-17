package exercicio5;

public class TestaFrequenciaCardiaca {

    public static void main(String[] args) {

        FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca("Gabriel","Lima",11,8,2004);

        System.out.println("Nome: " + frequenciaCardiaca.getNome());
        System.out.println("Sobrenome: " + frequenciaCardiaca.getSobrenome());
        System.out.println("Data de Nascimento: " + frequenciaCardiaca.getDataNascimento());
        System.out.println("Idade: " + frequenciaCardiaca.calcularIdade() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + frequenciaCardiaca.frequenciaCardiacaMax() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + frequenciaCardiaca.frequenciaCardiacaAlvo());
    }



    //Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe FrequenciaCardiaca e
    // imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade da pessoa (em anos),
    // seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.
}
