package org.example.quest4.model;

public abstract class Elemento {
    protected String nome;

    public Elemento(String nome) {
        this.nome = nome;
    }

    public abstract long tamanho();
}
