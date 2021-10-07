package com.br.zup;

import java.net.PortUnreachableException;

public class Consumidor {
    //-------------------------------------------------ATRIBUTOS
    private String nome;
    private String email;
    private TipoDeCliente tipoDeCliente;

    //-------------------------------------------------MÉTODO CONSTRUTOR

    public Consumidor(String nome, String email, TipoDeCliente tipoDeCliente) {
        this.nome = nome;
        this.email = email;
        this.tipoDeCliente = tipoDeCliente;
    }

    //-------------------------------------------------GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoDeCliente getTipoDeCliente() {
        return tipoDeCliente;
    }

    public void setTipoDeCliente(TipoDeCliente tipoDeCliente) {
        this.tipoDeCliente = tipoDeCliente;
    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder();
        dados.append("\nNome do consumidor: " + nome);
        dados.append("\nE-mail: " + email);
        dados.append("\nTipo de cliente: " + tipoDeCliente);

        return dados.toString();
    }
}
