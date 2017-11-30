package patterns;

import src.converters.*;

public class ConverterSingleton {

    private static ConverterSingleton instance = new ConverterSingleton();

    private ConverterSingleton(){}

    public static ConverterSingleton getInstance(){
        return instance;
    }

    public UnitConverter getConverter(String type) throws Exception{
        ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
        UnitConverter factoryAbstract = theF.callFactory(type);
        return factoryAbstract;
    }
}