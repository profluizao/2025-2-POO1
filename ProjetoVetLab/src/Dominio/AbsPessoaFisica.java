package Dominio;

public abstract class AbsPessoaFisica extends AbsIdentificador {
    protected String nome;
    protected String cpf;
    protected String email;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public AbsPessoaFisica(){
        super();
    }

    public AbsPessoaFisica(int codigo, String nome, String cpf, String email){
        super(codigo);
        //Tinha removido de propósito, pegadinha para Atividade A2.
        //Quem baixou o código, tinha que codificar as linhas abaixo.
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }    
}
