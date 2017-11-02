package src.converters;

public class LengthConverter extends UnitConverter{
    private double kvalue;
    private String fromUnit, toUnit;

    public LengthConverter(){
        fromUnit = " ";
        toUnit = " ";
        kvalue = 0.0;
    }

    public LengthConverter(String newFromUnit, String newToUnit, double newKValue){

        fromUnit = newFromUnit;
        toUnit = newToUnit;
        kvalue = newKValue;
    }

    //Set methods

    public void setFromUnit(String newFromUnit){
        fromUnit = newFromUnit;
    }

    public void setToUnit(String newToUnit){
        toUnit = newToUnit;
    }

    public void setKValue(double newKValue){
        kvalue = newKValue;
    }

    //Get Methods

    public String getFromUnit(){
        return fromUnit;
    }

    public String getToUnit(){
        return toUnit;
    }

    public double getKvalue(){
        return kvalue;
    }

    //Defining the values from the abstract
    public double convert(double unitInput){
        return unitInput * getKvalue();
    }

    public String toString(){
        return getFromUnit() + " to " + getToUnit() + " converter.";
    }

    public void print(){
        System.out.println(toString());
    }
}
