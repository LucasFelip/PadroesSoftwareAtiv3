package org.example.quest2;

import org.example.quest2.adapter.AdaptadorFarenheitParaCelsiusClassAdapter;
import org.example.quest2.adapter.AdaptadorFarenheitParaCelsiusObjectAdapter;
import org.example.quest2.model.MedidorCelsiusIF;
import org.example.quest2.model.MedidorFarenheit;

public class Main {
    public static void main(String[] args) {
        // Teste do Adaptador utilizando a abordagem Object Adapter
        MedidorFarenheit medidorFarenheit = new MedidorFarenheit();

        MedidorCelsiusIF adaptadorObject = new AdaptadorFarenheitParaCelsiusObjectAdapter(medidorFarenheit);
        double temperaturaCelsiusObject = adaptadorObject.medirTemperatura();
        System.out.println("Temperatura em Celsius (Object Adapter): " + temperaturaCelsiusObject);

        // Teste do Adaptador utilizando a abordagem Class Adapter
        MedidorCelsiusIF adaptadorClass = new AdaptadorFarenheitParaCelsiusClassAdapter();
        double temperaturaCelsiusClass = adaptadorClass.medirTemperatura();
        System.out.println("Temperatura em Celsius (Class Adapter): " + temperaturaCelsiusClass);
    }
}
