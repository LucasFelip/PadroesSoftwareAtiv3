package org.example.quest4.model;
import java.io.File;

public class Arquivo extends Elemento {
    public Arquivo(String nome) {
        super(nome);
    }

    @Override
    public long tamanho() {
        File arquivo = new File(nome);
        if (arquivo.isFile()) {
            return arquivo.length();
        } else {
            System.out.println("Não foi possível computar o tamanho de " + nome);
            return 0;
        }
    }
}
