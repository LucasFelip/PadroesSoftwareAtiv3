package org.example.quest5.tabela;

import org.example.quest5.model.Componente;

import java.util.ArrayList;
import java.util.List;

public class Linha extends Componente {
    private List<Componente> celulas = new ArrayList<>();

    public void adicionar(Celula celula) {
        celulas.add(celula);
    }

    @Override
    public void imprimir() {
        System.out.println("|"); // Imprime a borda superior da linha
        for (Componente celula : celulas) {
            celula.imprimir();
        }
        System.out.println("|"); // Imprime a borda inferior da linha
    }
}
