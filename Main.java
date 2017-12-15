import decorator.LenghtUnitConverterDecorator;
import decorator.MetersToYardsConverterDecorator;
import patterns.ConverterAbstractFactory;
import patterns.ConverterFactoryProducer;
import patterns.ConverterSingleton;
import src.converters.*;

import java.util.LinkedList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception
    {
        String conversion = args[0];
        String value = args[1];

        //Test by TinyTestJ
        TestSuite.testInput();

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
        LenghtUnitConverterDecorator lenghtUnitConverterDecorator = new LenghtUnitConverterDecorator();
        lenghtUnitConverterDecorator.newLenghtConverterClass("miles", "meters",10,10);
        lenghtUnitConverterDecorator.inversionMethod();
        MetersToYardsConverterDecorator metersToYardsConverterDecorator = new MetersToYardsConverterDecorator(new MetersToYardsConverter());

        metersToYardsConverterDecorator.convert(12);
        metersToYardsConverterDecorator.print();
        metersToYardsConverterDecorator.inversionMethod();

        LinkedList<UnitConverter> linkedList = new LinkedList<>();
        linkedList.add(new CelsiusToFahrenheitConverter());
        linkedList.add(new DollarToEuroConverter());
        linkedList.add(new FahrenheitToCelsiusConverter());
        linkedList.add(new MetersToYardsConverter());
        linkedList.add(new MilesToKilometersConverter());
        linkedList.add(new PoundToLiraConverter());
        linkedList.add(new MetersToYardsConverterDecorator(new MetersToYardsConverter()));
        linkedList.add(new MetersToYardsConverterDecorator(new MilesToKilometersConverter()));

        System.out.print("number?");
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int s1 = Integer.parseInt(sc.next());
            for (UnitConverter unitConverter : linkedList) {
                unitConverter.convert(s1);
                unitConverter.print();
            }
        }
    }
}
