package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    //Método para mostrar os tipos de clientes
    public static List<TipoDeCliente> mostrarTiposDeClientes(){
        List<TipoDeCliente> tiposDeClientes = new ArrayList<>();

        for (TipoDeCliente tipoDeClienteReferencia : TipoDeCliente.values()) {
            tiposDeClientes.add(tipoDeClienteReferencia);
        }

        return tiposDeClientes;
    }

    //MÉTODO PARA VALIDAR TIPO DE CLIENTE INPUTADO PELO CONSOLE
    public static TipoDeCliente validarTipoDeCliente(String tipoDeCliente) throws Exception{
        for (TipoDeCliente clienteReferencia : TipoDeCliente.values()) {
            if (tipoDeCliente.equalsIgnoreCase(String.valueOf(clienteReferencia))){
                return clienteReferencia;
            }
        }
        throw new Exception("Tipo de cliente não compatível! ");
    }

    public static Consumidor cadastrarConsumidor(String nome, String email, TipoDeCliente tipoDeCliente){
       Consumidor consumidor = new Consumidor(nome, email, tipoDeCliente);
    consumidores.add(consumidor);
       return consumidor;
    }

    //MÉTODO PARA PESQUISAR CONSUMIDOR PELO E-MAIL
    public static Consumidor pesquisarConsumidorPorEmail(String email) throws Exception{
        for (Consumidor consumidorReferencia: consumidores) {
            if (consumidorReferencia.getEmail().equals(email)){
                return consumidorReferencia;
            }
        }
        throw new Exception("Consumidor não cadastrado no sistema. ");
    }
}
