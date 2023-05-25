package org.example.quest2.adapter;

import org.example.quest2.model.MedidorCelsiusIF;
import org.example.quest2.model.MedidorFarenheit;

public class AdaptadorFarenheitParaCelsiusObjectAdapter implements MedidorCelsiusIF {
    private MedidorFarenheit medidorFarenheit;

    public AdaptadorFarenheitParaCelsiusObjectAdapter(MedidorFarenheit medidorFarenheit) {
        this.medidorFarenheit = medidorFarenheit;
    }

    @Override
    public double medirTemperatura() {
        double temperaturaFarenheit = medidorFarenheit.getTemperaturaFarenheit();
        double temperaturaCelsius = (temperaturaFarenheit - 32) * 5 / 9;
        return temperaturaCelsius;
    }
}
