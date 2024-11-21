package com.mycompany.UnitConversionapi;

public class UnitConverter {
    public static void convert (ConversionDetails details) throws UnitConversionException {
        String fromUnit = details.getFromUnit();
        String toUnit = details.getToUnit();

        if(fromUnit.equals("km") && toUnit.equals("m")){
            LengthConverter.kilometer2metre(details);
        } else if (fromUnit.equals("m") && toUnit.equals("km")) {
            LengthConverter.metre2kilometer(details);
        } else if (fromUnit.equals("kg") && toUnit.equals("g")) {
            LengthConverter.kg2gram(details);
        } else{
                throw new UnitConversionException("Invalid unit: " + fromUnit);
        }
    }
}
