package src.converters;

public class LengthConverter extends UnitConverter{
    private double kValue;
    private String fromUnit, toUnit;

    LengthConverter(){
        fromUnit = " ";
        toUnit = " ";
        kValue = 0.0;
    }

    LengthConverter(String newFromUnit, String newToUnit, double newKValue){

        fromUnit = newFromUnit;
        toUnit = newToUnit;
        kValue = newKValue;
    }

    //Set methods

    void setFromUnit(String newFromUnit){
        fromUnit = newFromUnit;
    }

    void setToUnit(String newToUnit){
        toUnit = newToUnit;
    }

    void setKValue(double newKValue){
        kValue = newKValue;
    }

    //Get Methods

    public String getFromUnit(){
        return fromUnit;
    }

    public String getToUnit(){
        return toUnit;
    }

    private double getkValue(){
        return kValue;
    }

    //Defining the values from the abstract
    public double convert(double unitInput){
        return unitInput * getkValue();
    }

    public String toString(){
        return getFromUnit() + " to " + getToUnit() + " converter.";
    }

    public void print(){
        System.out.println(toString());
    }
}
