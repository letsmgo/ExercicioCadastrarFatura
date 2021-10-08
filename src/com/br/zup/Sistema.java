package com.br.zup;

import java.util.List;
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

    //-------------------------------------------------MÉTODO PARA CADASTRAR UM CONSUMIDOR
    public static Consumidor cadastrarConsumidor() throws Exception{
        String nome = capturarDados("Digite o nome do consumidor: ").nextLine();
        String email = capturarDados("Digite o e-mail do consumidor: ").nextLine();
        System.out.println("Nossos tipos de clientes são: ");
        System.out.println(ServicoConsumidor.mostrarTiposDeClientes());
        String tipoDeCliente = capturarDados("Digite o tipo de cliente respectivo: ").nextLine();
        ServicoConsumidor.validarTipoDeClienteInformado(tipoDeCliente);

        return ServicoConsumidor.cadastrarConsumidor(nome, email, tipoDeCliente);
    }

    //-------------------------------------------------MÉTODO PARA CADASTRAR UMA FATURA
    public static Fatura cadastrarFatura() throws Exception{
        String email = capturarDados("Digite o email do consumidor: ").nextLine();
        double valor = capturarDados("Digite o valor da fatura: ").nextDouble();
        String dataDeVencimento = capturarDados("Digite a data de vencimento: ").nextLine();

        return ServicoFatura.cadastrarFatura(email, valor, dataDeVencimento);
    }

    //-------------------------------------------------MÉTODO PARA EXIBIR LISTA DE FATURAS
    public static List<Fatura> pesquisarFaturas() throws Exception{
        String email = capturarDados("Digite o e-mail do consumidor, que deseja visualizar as faturas: ").nextLine();
        ServicoConsumidor.validarEmail(email);

        List<Fatura> faturas = ServicoFatura.pesquisarFaturaPeloEmailConsumidor(email);

        return faturas;
    }

    public static boolean executar() throws Exception{
        boolean continuarMenu = true;

        while (continuarMenu){
            menu();
            int opcaoDoUsuario = capturarDados("Digite a opção desejada: ").nextInt();

            if (opcaoDoUsuario == 1){
                Consumidor consumidor = cadastrarConsumidor();
            } else if (opcaoDoUsuario == 2){
                Fatura fatura = cadastrarFatura();
            }else if (opcaoDoUsuario == 3){
                List<Fatura> faturasDoConsumidor = pesquisarFaturas();
                System.out.println("Total de faturas: " + faturasDoConsumidor.size());
                System.out.println(faturasDoConsumidor);
            } else if (opcaoDoUsuario == 4){
                System.out.println("Opção inválida! Vamos tentar novamente? ");
                continuarMenu = false;
            }
        }
        return continuarMenu;
    }
}
