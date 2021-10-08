package com.br.zup;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
        boolean continuarExecucao = true;
        while (continuarExecucao){
            try {
                continuarExecucao = Sistema.executar();
            }catch (Exception possivelErro){
                System.out.println(possivelErro.getMessage());
            }
        }
    }
}
