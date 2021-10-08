package com.br.zup;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    //-------------------------------------------------MÉTODO PARA MOSTRAR OS TIPO DE CLIENTES
    public static List<TipoDeCliente> mostrarTiposDeClientes(){
        List<TipoDeCliente> tiposDeClientes = new ArrayList<>();

        for (TipoDeCliente tipoDeClienteReferencia : TipoDeCliente.values()) {
            tiposDeClientes.add(tipoDeClienteReferencia);
        }

        return tiposDeClientes;
    }

    //-------------------------------------------------MÉTODO PARA VALIDAR TIPO DE CLIENTE INPUTADO PELO CONSOLE
    public static TipoDeCliente validarTipoDeClienteInformado(String tipoDeCliente) throws Exception{
        for (TipoDeCliente tipoClienteReferencia : TipoDeCliente.values()) {
            if (tipoDeCliente.equalsIgnoreCase(String.valueOf(tipoClienteReferencia))){
                return tipoClienteReferencia;
            }
        }
        throw new Exception("Tipo de cliente inválido, vamos tentar novamente? ");
    }

    //-------------------------------------------------MÉTODO PARA CADASTRAR UM CONSUMIDOR
    public static Consumidor cadastrarConsumidor(String nome, String email, String tipoDeClienteRecebido) throws Exception{
        TipoDeCliente tipoDeCliente = validarTipoDeClienteInformado(tipoDeClienteRecebido);
        validarEmail(email);
        verificarSeOEmailExiste(email);
        Consumidor consumidor = new Consumidor(nome, email, tipoDeCliente);
        consumidores.add(consumidor);

       return consumidor;
    }

    //-------------------------------------------------MÉTODO PARA PESQUISAR CONSUMIDOR PELO E-MAIL
    public static Consumidor pesquisarConsumidorPorEmail(String email) throws Exception{
        for (Consumidor consumidorReferencia: consumidores) {
            if (consumidorReferencia.getEmail().equals(email)){

                return consumidorReferencia;
            }
        }
        throw new Exception("Consumidor não cadastrado no sistema. ");
    }

    //-------------------------------------------------MÉTODO VALIDAR O E-MAIL
    public static void validarEmail(String email) throws Exception{
        if (!email.contains("@")){
            throw new Exception("E-mail inválido. ");
        }
    }

    //-------------------------------------------------MÉTODO PARA VERIFICAR SE O E-MAIL JÁ FOI CADASTRADO
    public static void verificarSeOEmailExiste(String email) throws Exception{
        for (Consumidor consumidorReferencia : consumidores) {
            if (consumidorReferencia.getEmail().equals(email)){
                throw new Exception("Este e-mail já foi cadastrado, você perdeu seu acesso? Ou digitou algo errado. ");
            }
        }
    }


}
