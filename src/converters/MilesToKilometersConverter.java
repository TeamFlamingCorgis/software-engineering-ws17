package src.converters;

public class MilesToKilometersConverter extends LengthConverter {
    //Constructors
    //Default constructor
    public MilesToKilometersConverter(){
        super();
        setFromUnit("Miles");
        setToUnit("Kilometers");
        setKValue(1.60934);
    }

    //Overloaded constructor
    public MilesToKilometersConverter(String fromMiles, String toKilometers, double ex){
        super(fromMiles,toKilometers,ex);
    }
}
