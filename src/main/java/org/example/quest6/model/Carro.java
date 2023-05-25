package org.example.quest6.model;

import org.example.quest6.implement.PersistenciaImplementor;

public class Carro extends ClasseNegocio {
    public Carro(PersistenciaImplementor persistencia) {
        super(persistencia);
    }

    @Override
    public void persiste() {
        String conteudo = this.toString();
        persistencia.persistir(conteudo);
    }

    @Override
    public String toString() {
        return "Carro: dados do carro em formato XML ou JSON";
    }
}
