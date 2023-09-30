package exercicio2;

public class PessoaFisica {
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;


    public PessoaFisica(String cpf) {
        setCpf(cpf);
    }

    private boolean validaCpf(String cpf) {
        return cpf.length() == 11;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

