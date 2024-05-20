package br.edu.fateczl.atividade08_mobile.model;

public class IngressoVIP extends Ingresso {
    private String funcao;

    public IngressoVIP(String codigoIdentificador, float valor, String funcao) {
        super(codigoIdentificador, valor);
        this.funcao = funcao;
    }

    @Override
    public float valorFinal(float taxaConveniencia) {
        return super.valorFinal(taxaConveniencia) * 1.18f;
    }

    public String getFuncao() {
        return funcao;
    }
}
