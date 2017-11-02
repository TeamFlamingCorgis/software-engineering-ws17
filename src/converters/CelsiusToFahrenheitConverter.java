package src.converters;

public class CelsiusToFahrenheitConverter extends TemperatureConverter {
    //Constructors
    //Default constructor
    public CelsiusToFahrenheitConverter(){
        super();
        setFromDegrees("Celsius");
        setToDegrees("Fahrenheit");
    }

    //Overloaded constructor
    public CelsiusToFahrenheitConverter(String Celsius, String Fahrenheit){
        super(Celsius, Fahrenheit);
    }
}
