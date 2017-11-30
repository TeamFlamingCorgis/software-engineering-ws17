package factory;

import src.converters.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AbstractFactory {

    private static Map<String, UnitConverter> AbstractFactory;
    static {
        Map<String, UnitConverter> aMap = new HashMap<>();
        aMap.put("CelsiusToFahrenheit", new CelsiusToFahrenheitConverter() );
        aMap.put("FahrenheitToCelsius", new FahrenheitToCelsiusConverter());
        aMap.put("DollarToEuro", new DollarToEuroConverter());
        aMap.put("PoundToLira", new PoundToLiraConverter());
        aMap.put("MetersToYards", new MetersToYardsConverter());
        aMap.put("MilesToKilometers", new MilesToKilometersConverter());
        AbstractFactory = Collections.unmodifiableMap(aMap);
    }

    public UnitConverter callFactory(String string){
        return AbstractFactory.get(string);
    }

}

