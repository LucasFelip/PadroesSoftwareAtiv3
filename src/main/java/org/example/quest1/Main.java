package org.example.quest1;

import org.example.quest1.Adapter.AdaptadorSomador;
import org.example.quest1.model.Cliente;
import org.example.quest1.model.SomadorExistente;

public class Main {
    public static void main(String[] args) {
        SomadorExistente somadorExistente = new SomadorExistente();
        AdaptadorSomador adaptador = new AdaptadorSomador(somadorExistente);
        Cliente cliente = new Cliente(adaptador);
        cliente.executar();
    }
}
