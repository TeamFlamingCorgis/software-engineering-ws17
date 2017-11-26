import src.converters.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.Callable;


class Main {

    public static void main(String[] args)
    {
        String conversion = args[0];
        String value = args[1];

        //Test by TinyTestJ
        TestSuite.testInput();

        //Test by User
//        userInput(conversion, value);
    }



    static final Map<String, Class> CLASSES = new LinkedHashMap<String,Class>() {{
        put( "command1", CelsiusToFahrenheitConverter.class  );
        put( "command2", FahrenheitToCelsiusConverter.class   );
        put( "command3", DollarToEuroConverter.class );
        put( "command4", PoundToLiraConverter.class );
        put( "command5", MetersToYardsConverter.class );
        put( "command5", MilesToKilometersConverter.class );
    }};

    public static void userInput(String conversion, String value){


        CurrencyConverter myConverter;
        LengthConverter lengthConverter;
        TemperatureConverter temperatureConverter;
        double result = 0.0;
        String conv = "", from = "", to = "";

        //Example one, please complete
        switch(conversion){
            case "DollarToEuro":
                myConverter = new DollarToEuroConverter();
                result = myConverter.convert(Double.parseDouble(value));
                conv = myConverter.toString();
                from = myConverter.getFromCurrency();
                to = myConverter.getToCurrency();
                break;
            case "PoundToLira":
                myConverter = new PoundToLiraConverter();
                result = myConverter.convert(Double.parseDouble(value));
                conv = myConverter.toString();
                from = myConverter.getFromCurrency();
                to = myConverter.getToCurrency();
                break;
            case "CelsiusToFahrenheit":
                temperatureConverter = new CelsiusToFahrenheitConverter( );
                result = temperatureConverter.convert(Double.parseDouble(value));
                conv = temperatureConverter.toString();
                from = temperatureConverter.getFromDegrees();
                to = temperatureConverter.getToDegrees();
                break;
            case "FahrenheitToCelsius":
                temperatureConverter = new FahrenheitToCelsiusConverter();
                result = temperatureConverter.convert(Double.parseDouble(value));
                conv = temperatureConverter.toString();
                from = temperatureConverter.getFromDegrees();
                to = temperatureConverter.getToDegrees();
                break;
            case "MetersToYards":
                lengthConverter = new MetersToYardsConverter();
                result = lengthConverter.convert(Double.parseDouble(value));
                conv = lengthConverter.toString();
                from = lengthConverter.getFromUnit();
                to = lengthConverter.getToUnit();
                break;
            case "MilesToKilometers":
                lengthConverter = new MilesToKilometersConverter();
                result = lengthConverter.convert(Double.parseDouble(value));
                conv = lengthConverter.toString();
                from = lengthConverter.getFromUnit();
                to = lengthConverter.getToUnit();
                break;
            default:
                System.err.println("Nope, nicht gut bro");
                break;
        }

        System.out.println(conv + " has converted " + value  + " " + from + " to " + result + " " + to + "!");
    }


}
