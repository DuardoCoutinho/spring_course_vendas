package io.github.duardocoutinho.vendas.model;

import io.micrometer.observation.transport.Propagator;

public class Cliente {

    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
