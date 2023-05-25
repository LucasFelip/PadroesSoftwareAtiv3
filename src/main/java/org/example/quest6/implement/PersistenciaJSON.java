package org.example.quest6.implement;

public class PersistenciaJSON implements PersistenciaImplementor {
    @Override
    public void persistir(String conteudo) {
        System.out.println("Persistindo em JSON: " + conteudo);
    }
}

