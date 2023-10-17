package exercicio5;
import java.time.LocalDate;


public class FrequenciaCardiaca {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
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

}
