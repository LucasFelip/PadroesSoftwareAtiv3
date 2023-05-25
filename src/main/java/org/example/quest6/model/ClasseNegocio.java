package org.example.quest6.model;

import org.example.quest6.implement.PersistenciaImplementor;

abstract class ClasseNegocio {
    protected PersistenciaImplementor persistencia;

    public ClasseNegocio(PersistenciaImplementor persistencia) {
        this.persistencia = persistencia;
    }

    public abstract void persiste();
}
