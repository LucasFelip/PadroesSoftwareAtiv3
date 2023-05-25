package org.example.quest3;

import org.example.quest3.model.AplicacaoProdutoQuimicoAction;
import org.example.quest3.model.ElevacaoTemperaturaAction;
import org.example.quest3.service.Experimento;

public class Main {
    public static void main(String[] args) {
        Experimento experimento = new Experimento();

        // Adicionando ações ao experimento
        experimento.adicionarAcao(new ElevacaoTemperaturaAction());
        experimento.adicionarAcao(new AplicacaoProdutoQuimicoAction());

        // Executando o teste
        experimento.executarTeste();
    }
}