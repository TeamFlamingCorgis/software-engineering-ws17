package src.converters;

public class FarenheitToCelsiusConverter extends TemperatureConverter {
    //Constructors
    //Default constructor
    public FarenheitToCelsiusConverter(){
        super();
        setFromDegrees("Farenheit");
        setToDegrees("Celsius");
    }

    //Overloaded constructor
    public FarenheitToCelsiusConverter(String Farenheit, String Celsius){
        super(Farenheit, Celsius);
    }
}
