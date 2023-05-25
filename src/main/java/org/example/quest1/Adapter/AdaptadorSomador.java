package org.example.quest1.Adapter;

import org.example.quest1.model.SomadorEsperado;
import org.example.quest1.model.SomadorExistente;

import java.util.List;

public class AdaptadorSomador implements SomadorEsperado {
    private SomadorExistente somadorExistente;

    public AdaptadorSomador(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    @Override
    public int somaVetor(int[] vetor) {
        // Converte o vetor em uma lista para usar o somador existente
        List<Integer> lista = new java.util.ArrayList<>();
        for (int i : vetor) {
            lista.add(i);
        }

        // Chama o método de soma do somador existente
        return somadorExistente.somaLista(lista);
    }
}
