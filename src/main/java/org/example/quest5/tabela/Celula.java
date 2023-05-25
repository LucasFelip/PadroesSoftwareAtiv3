package org.example.quest5.tabela;

import org.example.quest5.model.Componente;

public class Celula extends Componente {
    private String conteudo;

    public Celula(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        String conteudoFormatado = conteudo.substring(0, Math.min(conteudo.length(), 15));
        System.out.print("| " + conteudoFormatado); // Imprime a célula com borda lateral
    }
}
