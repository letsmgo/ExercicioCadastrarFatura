package com.br.zup;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
        try {
            Sistema.cadastrarConsumidor();
        }catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    }
}
