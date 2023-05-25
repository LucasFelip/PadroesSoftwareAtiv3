package org.example.quest5;

import org.example.quest5.model.Tabela;
import org.example.quest5.tabela.Celula;
import org.example.quest5.tabela.Linha;

public class Main {
    public static void main(String[] args) {
        // Criação da tabela
        Tabela tabela = new Tabela();

        // Criação das linhas e células
        Linha linha1 = new Linha();
        linha1.adicionar(new Celula("Texto1"));
        linha1.adicionar(new Celula("Texto2"));
        tabela.adicionar(linha1);

        Linha linha2 = new Linha();
        linha2.adicionar(new Celula("Texto3"));
        linha2.adicionar(new Celula("Texto4"));
        tabela.adicionar(linha2);

        // Impressão da tabela
        tabela.imprimir();
    }
}

