package src.converters;

public class TemperatureConverter extends UnitConverter {
    private String fromDegrees, toDegrees;

    public TemperatureConverter(){
        fromDegrees = " ";
        toDegrees = " ";
    }

    public TemperatureConverter(String newFromDegrees, String newToDegrees){
        fromDegrees = newFromDegrees;
        toDegrees = newToDegrees;
    }

    //Set methods

    public void setFromDegrees(String newFromDegrees){
        fromDegrees = newFromDegrees;
    }

    public void setToDegrees(String newToDegrees){
        toDegrees = newToDegrees;
    }

    //Get Methods

    public String getFromDegrees(){
        return fromDegrees;
    }

    public String getToDegrees(){
        return toDegrees;
    }

    //Defining the values from the abstract
    public double convert(double unitInput){
        double total = 0;
        if(getFromDegrees() == "Celsius" && getToDegrees() == "Farenheit"){
            total = (unitInput * 1.8) + 32;
        }else if(getFromDegrees() == "Celsius" && getToDegrees() == "Kelvin"){
            total = unitInput + 273.15;
        }else if(getFromDegrees() == "Farenheit" && getToDegrees() == "Celsius"){
            total = (unitInput - 32) * 0.6;
        }else if(getFromDegrees() == "Farenheit" && getToDegrees() == "Kelvin"){
            total = ((unitInput - 32) * 0.6) + 273.15;
        }else if(getFromDegrees() == "Kelvin" && getToDegrees() == "Celsius"){
            total = unitInput - 273.15;
        }else if(getFromDegrees() == "Kelvin" && getToDegrees() == "Farenheit"){
            total = (unitInput + 459.67) * 0.6;
        }else{
            total = -1;
        }

        return total;
    }

    public String toString(){
        return getFromDegrees() + " to " + getToDegrees() + " converter.";
    }

    public void print(){
        System.out.println(toString());
    }
}
