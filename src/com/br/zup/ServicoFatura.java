package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    //-------------------------------------------------Método para cadastrar uma fatura
    public static Fatura cadastrarFatura(String email, double valorDaFatura, String dataDeVencimento) throws Exception{
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidorPorEmail(email);

        Fatura fatura = new Fatura(consumidor, valorDaFatura, dataDeVencimento);
        faturas.add(fatura);

        return fatura;
    }

    public static List<Fatura> pesquisarFaturaPeloEmailConsumidor(String email) {
        List<Fatura> faturasDoConsumidor = new ArrayList<>();
        for (Fatura faturaReferencia : faturas) {
            if (faturaReferencia.getConsumidor().getEmail().equals(email)) {
                faturasDoConsumidor.add(faturaReferencia);
            }
        }
        return faturasDoConsumidor;
    }

}
