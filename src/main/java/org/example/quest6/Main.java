package org.example.quest6;

import org.example.quest6.implement.PersistenciaImplementor;
import org.example.quest6.implement.PersistenciaJSON;
import org.example.quest6.implement.PersistenciaXML;
import org.example.quest6.model.Carro;
import org.example.quest6.model.Pessoa;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa com persistência em XML
        PersistenciaImplementor persistenciaXML = new PersistenciaXML();
        Pessoa pessoaXML = new Pessoa(persistenciaXML);
        pessoaXML.persiste();

        // Criando uma instância de Carro com persistência em JSON
        PersistenciaImplementor persistenciaJSON = new PersistenciaJSON();
        Carro carroJSON = new Carro(persistenciaJSON);
        carroJSON.persiste();
    }
}