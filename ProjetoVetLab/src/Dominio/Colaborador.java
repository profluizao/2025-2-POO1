package Dominio;

public class Colaborador extends AbsPessoaFisica{
    private Double salario;
    private String matricula;

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Colaborador(){
        super();
    }
    public Colaborador(int codigo, String nome, String cpf, String email, Double salario, String matricula) {
        super(codigo, nome, cpf, email);
        this.salario = salario;
        this.matricula = matricula;
    }
}
