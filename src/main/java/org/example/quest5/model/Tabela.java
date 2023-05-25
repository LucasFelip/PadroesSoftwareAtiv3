package org.example.quest5.model;

import org.example.quest5.tabela.Linha;

import java.util.ArrayList;
import java.util.List;

// Classe Tabela que representa a tabela como um todo
public class Tabela extends Componente {
    private List<Componente> linhas = new ArrayList<>();

    public void adicionar(Linha linha) {
        linhas.add(linha);
    }

    public void imprimir() {
        for (Componente linha : linhas) {
            linha.imprimir();
        }
    }
}