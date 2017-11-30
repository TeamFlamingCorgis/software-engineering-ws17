package patterns;

import src.converters.UnitConverter;

public class ConverterFactoryProducer {
    public static ConverterAbstractFactory getFactory(){
        return new ConverterFactory();
    }
}