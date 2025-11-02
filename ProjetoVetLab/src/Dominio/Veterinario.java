package Dominio;

public class Veterinario extends AbsPessoaFisica{
    private String rg;
    private String regCRMV;

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getRegCRMV() {
        return regCRMV;
    }
    public void setRegCRMV(String regCRMV) {
        this.regCRMV = regCRMV;
    }

    public Veterinario() {
    }

    public Veterinario(int codigo, String nome, String cpf, String email, String rg, String regCRMV) {
        super(codigo, nome, cpf, email);
        this.rg = rg;
        this.regCRMV = regCRMV;
    }

}
