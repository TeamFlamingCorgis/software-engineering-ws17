package src.converters;

public class LengthConverter extends UnitConverter{
    private double kValue, inputUnit, outputUnit;
    private String fromUnit, toUnit;

    public void setkValue(double kValue) {
        this.kValue = kValue;
    }

    public double getInputUnit() {
        return inputUnit;
    }

    public void setInputUnit(double inputUnit) {
        this.inputUnit = inputUnit;
    }

    public double getOutputUnit() {
        return outputUnit;
    }

    public void setOutputUnit(double outputUnit) {
        this.outputUnit = outputUnit;
    }

    public LengthConverter(){
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

    public void setFromUnit(String newFromUnit){
        fromUnit = newFromUnit;
    }

    public void setToUnit(String newToUnit){
        toUnit = newToUnit;
    }

    public void setKValue(double newKValue){
        kValue = newKValue;
    }

    //Get Methods

    public String getFromUnit(){
        return fromUnit;
    }

    public String getToUnit(){
        return toUnit;
    }

    public double getkValue(){
        return kValue;
    }

    //Defining the values from the abstract
    public double convert(double unitInput){
        inputUnit = unitInput;
        outputUnit = unitInput * getkValue();
        return outputUnit;
    }

    public String toString(){
        return getFromUnit() + " to " + getToUnit() + " converter";
    }

    public void print(){
        System.out.println(toString() + ": has converted " + inputUnit + " " + getFromUnit()  + " to " + outputUnit + " " + getToUnit() + "!");
    }
}
