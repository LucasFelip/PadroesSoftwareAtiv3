package org.example.quest4.factory;

import org.example.quest4.model.Arquivo;
import org.example.quest4.model.Diretorio;
import org.example.quest4.model.Elemento;

import java.io.File;

public class ElementoFactory {
    public static Elemento criarElemento(String nome) {
        File arquivo = new File(nome);
        if (arquivo.isFile()) {
            return new Arquivo(nome);
        } else if (arquivo.isDirectory()) {
            Diretorio diretorio = new Diretorio(nome);
            File[] arquivos = arquivo.listFiles();
            if (arquivos != null) {
                for (File arquivoFilho : arquivos) {
                    Elemento elemento = criarElemento(arquivoFilho.getAbsolutePath());
                    diretorio.adicionarElemento(elemento);
                }
            }
            return diretorio;
        } else {
            System.out.println("Não foi possível computar o tamanho de " + nome);
            return null;
        }
    }
}
