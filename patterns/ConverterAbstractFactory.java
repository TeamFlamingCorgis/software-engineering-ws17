package patterns;

import src.converters.UnitConverter;

import java.util.Map;

public abstract class ConverterAbstractFactory {
    private static Map<String, UnitConverter> ConverterFactoryMap;
    abstract public UnitConverter callFactory(String type) throws ConverterFactoryException;
}