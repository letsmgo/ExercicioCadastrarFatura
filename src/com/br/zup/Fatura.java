package com.br.zup;

public class Fatura {
    //-------------------------------------------------ATRIBUTOS DA CLASSE
    private Consumidor consumidor;
    private double valorDaFatura;
    private String dataDeVencimento;

    //-------------------------------------------------MÉTODO CONSTRUTOR
    public Fatura(Consumidor consumidor, double valorDaFatura, String dataDeVencimento) {
        this.consumidor = consumidor;
        this.valorDaFatura = valorDaFatura;
        this.dataDeVencimento = dataDeVencimento;
    }

    //-------------------------------------------------GETTERS AND SETTERS
    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consmidor) {
        this.consumidor = consmidor;
    }

    public double getValorDaFatura() {
        return valorDaFatura;
    }

    public void setValorDaFatura(double valorDaFatura) {
        this.valorDaFatura = valorDaFatura;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    //-------------------------------------------------ToSTRING
    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\t\tINFORMAÇÕES DE FATURA: ");
        dados.append("\nConsumidor: " + consumidor);
        dados.append("\nValor: R$" + valorDaFatura);
        dados.append("\nData de vencimento: " + dataDeVencimento);

        return dados.toString();
    }


}
