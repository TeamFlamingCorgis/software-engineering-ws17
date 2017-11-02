package src.converters;

public class TemperatureConverter extends UnitConverter {
    private double changeval;
    private String fromDegrees, toDegrees;

    public TemperatureConverter(){
        fromDegrees = " ";
        toDegrees = " ";
        changeval = 0.0;
    }

    public TemperatureConverter(String newFromDegrees, String newToDegrees, double newKValue){
        fromDegrees = newFromDegrees;
        toDegrees = newToDegrees;
        changeval = newKValue;
    }

    //Set methods

    public void setFromDegrees(String newFromDegrees){
        fromDegrees = newFromDegrees;
    }

    public void setToDegrees(String newToDegrees){
        toDegrees = newToDegrees;
    }

    public void setChangeValue(double newChangeValue){
        changeval = newChangeValue;
    }

    //Get Methods

    public String getFromDegrees(){
        return fromDegrees;
    }

    public String getToDegrees(){
        return toDegrees;
    }

    public double getChangeValue(){
        return changeval;
    }

    //Defining the values from the abstract
    public double convert(double unitInput){
        return unitInput * getChangeValue();
    }

    public String toString(){
        return getFromDegrees() + " to " + getToDegrees() + " converter.";
    }

    public void print(){
        System.out.println(toString());
    }
}
