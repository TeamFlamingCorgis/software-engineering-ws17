package src.converters;

public class LengthConverter extends UnitConverter{
    private double fromMeasure, toMeasure, kvalue;
    private String fromUnit, toUnit;

    public LengthConverter(){
        fromMeasure = 0.0;
        toMeasure = 0.0;
        fromUnit = " ";
        toUnit = " ";
        kvalue = 0.0;
    }

    //Set methods
    public void setFromMeasure(double newFromMeasure){
        fromMeasure = newFromMeasure;
    }

    public void setFromUnit(String newFromUnit){
        fromUnit = newFromUnit;
    }

    public void setToMeasure(double newToMeasure){
        toMeasure = newToMeasure;
    }

    public void setToUnit(String newToUnit){
        toUnit = newToUnit;
    }

    public void setKValue(double newKValue){
        kvalue = newKValue;
    }

    //Get Methods
    public double getFromMeasure(){
        return fromMeasure;
    }

    public double getToMeasure(){
        return toMeasure;
    }

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
        return unitInput;
    }

    public String toString(){
        return getFromUnit() + " to " + getToUnit() + " converter.";
    }

    public void print(){
        System.out.println(toString());
    }
}
