package src.converters;

public class FahrenheitToCelsiusConverter extends TemperatureConverter {
    //Constructors
    //Default constructor
    public FahrenheitToCelsiusConverter(){
        super();
        setFromDegrees("Fahrenheit");
        setToDegrees("Celsius");
    }

    //Overloaded constructor
    public FahrenheitToCelsiusConverter(String Fahrenheit, String Celsius){
        super(Fahrenheit, Celsius);
    }
}
