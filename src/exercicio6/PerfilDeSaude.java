package exercicio6;

import java.time.LocalDate;

public class PerfilDeSaude {

    private String nome;
    private String sobrenome;
    private String sexo;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, LocalDate dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - dataNascimento.getYear();

        if (dataNascimento.getMonthValue() > dataAtual.getMonthValue() ||
                (dataNascimento.getMonthValue() == dataAtual.getMonthValue() &&
                        dataNascimento.getDayOfMonth() > dataAtual.getDayOfMonth())) {
            idade--;
        }

        return idade;
    }

    public int frequenciaCardiacaMax() {
        return 220 - calcularIdade();
    }

    public String frequenciaCardiacaAlvo() {
        int frequenciaMax = frequenciaCardiacaMax();
        int alvoMin = (int) (frequenciaMax * 0.5);
        int alvoMax = (int) (frequenciaMax * 0.85);
        return alvoMin + "-" + alvoMax;
    }

    public double calcIMC() {
        return (peso/(altura * altura));
    }

    public void imprimir() {
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("IMC: " + calcIMC());
        System.out.println("Frequência Cardíaca Máxima: " + frequenciaCardiacaMax() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + frequenciaCardiacaAlvo() + " bpm");
    }

}
