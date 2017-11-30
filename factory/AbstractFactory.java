package factory;

import src.converters.*;

import java.util.Collections;
import java.util.Map;

public class AbstractFactory {

    private static Map<String, UnitConverter> AbstractFactory;
    static {
        Map<String, UnitConverter> aMap = null;
        aMap.put("command1", new FahrenheitToCelsiusConverter() );
        aMap.put("command2", new FahrenheitToCelsiusConverter());
        aMap.put("command3", new DollarToEuroConverter());
        aMap.put("command4", new PoundToLiraConverter());
        aMap.put("command5", new MetersToYardsConverter());
        aMap.put("command5", new MilesToKilometersConverter());
        AbstractFactory = Collections.unmodifiableMap(aMap);
    }

    public UnitConverter callFactory(String string){
       return AbstractFactory.get(string);
    }

}

