import patterns.ConverterAbstractFactory;
import patterns.ConverterFactory;
import patterns.ConverterFactoryProducer;
import patterns.ConverterSingleton;
import src.converters.UnitConverter;

class Main {

    public static void main(String[] args) throws Exception
    {
        String conversion = args[0];
        String value = args[1];

        //Test by TinyTestJ
//        TestSuite.testInput();

        //Using FACTORY PATTERN with ABSTRACT FACTORY
        ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
        UnitConverter tstFactory = theF.callFactory("CelsiusToFahrenheit");
        tstFactory.convert(33.0);
        tstFactory.print();

        UnitConverter tstExc = theF.callFactory("mmg");

        //Using SINGLETON PATTERN with ABSTRACT FACTORY (within the singleton)
        ConverterSingleton tstSingleton = ConverterSingleton.getInstance();
        UnitConverter singleton = tstSingleton.getConverter("CelsiusToFahrenheit");
        singleton.convert(33.0);
        singleton.print();


    }








}
