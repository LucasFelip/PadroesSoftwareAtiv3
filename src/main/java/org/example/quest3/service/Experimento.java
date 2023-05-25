package org.example.quest3.service;

import org.example.quest3.model.RoboAction;

import java.util.ArrayList;
import java.util.List;

public class Experimento {
    private List<RoboAction> acoes;

    public Experimento() {
        this.acoes = new ArrayList<>();
    }

    public void adicionarAcao(RoboAction acao) {
        acoes.add(acao);
    }

    public void executarTeste() {
        for (RoboAction acao : acoes) {
            acao.execute();
        }
    }
}
