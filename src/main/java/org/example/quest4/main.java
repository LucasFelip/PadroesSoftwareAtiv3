package org.example.quest4;

import org.example.quest4.factory.ElementoFactory;
import org.example.quest4.model.Elemento;

public class main {
    public static void main(String[] args) {
        // Teste com arquivo
        String nomeArquivo = "texto.txt";
        Elemento arquivo = ElementoFactory.criarElemento(nomeArquivo);
        if (arquivo != null) {
            long tamanhoArquivo = arquivo.tamanho();
            System.out.println("Tamanho do arquivo " + nomeArquivo + ": " + tamanhoArquivo + " bytes");
        }
        System.out.println();

        // Teste com diretório
        String nomeDiretorio = "C:\\Workspace\\IdeaProjects\\PadroesSoftware\\src\\main\\java\\org\\example\\quest4\\";
        Elemento diretorio = ElementoFactory.criarElemento(nomeDiretorio);
        if (diretorio != null) {
            long tamanhoDiretorio = diretorio.tamanho();
            System.out.println("Tamanho do diretório " + nomeDiretorio + ": " + tamanhoDiretorio + " bytes");
        }
        System.out.println();

        // Teste com diretório que não existe
        String nomeDiretorioInexistente = "C:\\inexistente";
        Elemento diretorioInexistente = ElementoFactory.criarElemento(nomeDiretorioInexistente);
        if (diretorioInexistente != null) {
            long tamanhoDiretorioInexistente = diretorioInexistente.tamanho();
            System.out.println("Tamanho do diretório " + nomeDiretorioInexistente + ": " + tamanhoDiretorioInexistente + " bytes");
        }
    }
}
