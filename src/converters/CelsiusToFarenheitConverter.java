package src.converters;

public class CelsiusToFarenheitConverter extends TemperatureConverter {
    //Constructors
    //Default constructor
    public CelsiusToFarenheitConverter(){
        super();
        setFromDegrees("Celsius");
        setToDegrees("Farenheit");
    }

    //Overloaded constructor
    public CelsiusToFarenheitConverter(String Celsius, String Farenheit){
        super(Celsius, Farenheit);
    }
}
