import src.converters.*;

import java.util.Scanner;

class Main {
    public Main(){
        String[] arg = new String[2];
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("please choose form the following options\n" +
                "1) DollarToEuro\n" +
                "2) PoundToLira\n" +
                "3) CelsiusToFahrenheit\n" +
                "4) FahrenheitToCelsius\n" +
                "5) MetersToYards\n" +
                "6) MilesToKilometers");
        arg[0] = reader.toString();
        System.out.println("please enter a value to convert");
        arg[1] = reader.toString();
        main(arg);
    }
    public static void main(String[] args)
    {
        String conversion = args[0];
        String value = args[1];
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
                System.out.println("Nope, nicht gut bro");
                break;
        }

        System.out.println(conv + " has converted " + value  + " " + from + " to " + result + " " + to + "!");

    }
}
