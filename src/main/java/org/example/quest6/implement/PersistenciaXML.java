package org.example.quest6.implement;

public class PersistenciaXML implements PersistenciaImplementor {
    @Override
    public void persistir(String conteudo) {
        System.out.println("Persistindo em XML: " + conteudo);
    }
}
