package com.br.zup;

import java.util.Scanner;

public class Sistema {
    //-------------------------------------------------MÉTODO PARA CAPTURAR DADOS DO CONSOLE
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //-------------------------------------------------MÉTODO PARA APRESENTAR MENU INTERATIVO
    public static void menu() {
        System.out.println("\t\t\t\t|Seja bem vinde ao RichFaturas|");
        System.out.println("|Digite 1 - se deseja cadastrar um consumidor.              |");
        System.out.println("|Digite 2 - se deseja cadastrar uma fatura.                 | ");
        System.out.println("|Digite 3 - se deseja consultar faturas de um consumidor.   | ");
        System.out.println("|Digite 4 - se deseja sair.                                 | ");
    }

    //-------------------------------------------------Método para cadastrar um consumidor
    public static Consumidor cadastrarConsumidor() throws Exception{
        String nome = capturarDados("Digite o nome do consumidor: ").nextLine();
        String email = capturarDados("Digite o e-mail do consumidor: ").nextLine();
        System.out.println(ServicoConsumidor.mostrarTiposDeClientes());
        String tipoDeCliente = capturarDados("Digite o tipo de cliente respectivo: ").nextLine();
        ServicoConsumidor.validarTipoDeCliente(tipoDeCliente);

        return ServicoConsumidor.cadastrarConsumidor(nome, email, TipoDeCliente.valueOf(tipoDeCliente));
    }
}
