package entidades;

import java.math.BigDecimal;

public class DadosProfissionais {
    private String profissao;
    private String empresa;
    private double salario;
    private Boolean empregoAtual;

    public DadosProfissionais() {
    }

    public DadosProfissionais(String profissao, String empresa, double salario, Boolean empregoAtual) {
        this.profissao = profissao;
        this.empresa = empresa;
        this.salario = salario;
        this.empregoAtual = empregoAtual;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        profissao = profissao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        empresa = empresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Boolean getEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(Boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

}
