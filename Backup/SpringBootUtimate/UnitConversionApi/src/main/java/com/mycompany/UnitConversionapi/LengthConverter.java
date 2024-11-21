package com.mycompany.UnitConversionapi;

public class LengthConverter {
    public static void kilometer2metre(ConversionDetails details){
        float km = details.getFromValue();
        float m = km * 1000f;
        details.setToValue(m);
    }

    public static void metre2kilometer(ConversionDetails details){
        float m = details.getFromValue();
        float km = m / 1000f;
        details.setToValue(km);
    }

    public static  void kg2gram(ConversionDetails details){
        float kg = details.getFromValue();
        float g = kg * 1000f;
        details.setToValue(g);
    }
}
