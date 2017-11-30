package patterns;

import src.converters.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConverterFactory extends ConverterAbstractFactory{


    private static Map<String, UnitConverter> ConverterFactoryMap =
            Collections.unmodifiableMap(new HashMap<String, UnitConverter>(){{
                put("CelsiusToFahrenheit", new CelsiusToFahrenheitConverter());
                put("FahrenheitToCelsius", new FahrenheitToCelsiusConverter());
                put("DollarToEuro", new DollarToEuroConverter());
                put("PoundToLira", new PoundToLiraConverter());
                put("MetersToYards", new MetersToYardsConverter());
                put("MilesToKilometers", new MilesToKilometersConverter());
            }});

    @Override
    public UnitConverter callFactory(String type) throws ConverterFactoryException{
        UnitConverter theFact = ConverterFactoryMap.get(type);
        try{
            if(theFact == null){
                throw new ConverterFactoryException("Converter Type " + type + " does not exist");
            }
        }catch (ConverterFactoryException cfe){
            System.err.println("CUSTOM ERROR: Converter Type " + type + " does not exist");
        }
        return theFact;
    }
}
