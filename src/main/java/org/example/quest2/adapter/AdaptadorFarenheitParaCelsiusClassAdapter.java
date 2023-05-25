package org.example.quest2.adapter;

import org.example.quest2.model.MedidorCelsiusIF;
import org.example.quest2.model.MedidorFarenheit;

public class AdaptadorFarenheitParaCelsiusClassAdapter extends MedidorFarenheit implements MedidorCelsiusIF {
    @Override
    public double medirTemperatura() {
        double temperaturaFarenheit = getTemperaturaFarenheit();
        double temperaturaCelsius = (temperaturaFarenheit - 32) * 5 / 9;
        return temperaturaCelsius;
    }
}
