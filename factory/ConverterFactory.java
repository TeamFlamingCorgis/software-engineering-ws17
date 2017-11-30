package factory;

import src.converters.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConverterFactory {

    private static Map<String, UnitConverter> ConverterFactory =
            Collections.unmodifiableMap(new HashMap<String, UnitConverter>(){{
                    put("CelsiusToFahrenheit", new CelsiusToFahrenheitConverter() );
                    put("FahrenheitToCelsius", new FahrenheitToCelsiusConverter());
                    put("DollarToEuro", new DollarToEuroConverter());
                    put("PoundToLira", new PoundToLiraConverter());
                    put("MetersToYards", new MetersToYardsConverter());
                    put("MilesToKilometers", new MilesToKilometersConverter());
            }});

    public UnitConverter callFactory(String type){

        return ConverterFactory.get(type);

    }

}

