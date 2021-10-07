package com.br.zup;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.executar();
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }
}
