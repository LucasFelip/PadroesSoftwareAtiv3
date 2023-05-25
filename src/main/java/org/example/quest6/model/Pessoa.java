package org.example.quest6.model;

import org.example.quest6.implement.PersistenciaImplementor;

public class Pessoa extends ClasseNegocio {
    public Pessoa(PersistenciaImplementor persistencia) {
        super(persistencia);
    }

    @Override
    public void persiste() {
        String conteudo = this.toString();
        persistencia.persistir(conteudo);
    }

    @Override
    public String toString() {
        return "Pessoa: dados da pessoa em formato XML ou JSON";
    }
}
