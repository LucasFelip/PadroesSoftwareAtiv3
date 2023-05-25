package org.example.quest4.model;

import java.util.ArrayList;
import java.util.List;

public class Diretorio extends Elemento {
    private List<Elemento> elementos;

    public Diretorio(String nome) {
        super(nome);
        elementos = new ArrayList<>();
    }

    public void adicionarElemento(Elemento elemento) {
        elementos.add(elemento);
    }

    public void removerElemento(Elemento elemento) {
        elementos.remove(elemento);
    }

    @Override
    public long tamanho() {
        long tamanhoTotal = 0;
        for (Elemento elemento : elementos) {
            tamanhoTotal += elemento.tamanho();
        }
        return tamanhoTotal;
    }
}
