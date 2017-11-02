package src.converters;

import java.util.Objects;

public class TemperatureConverter extends UnitConverter {
    private String fromDegrees, toDegrees;

    TemperatureConverter(){
        fromDegrees = " ";
        toDegrees = " ";
    }

    TemperatureConverter(String newFromDegrees, String newToDegrees){
        fromDegrees = newFromDegrees;
        toDegrees = newToDegrees;
    }

    //Set methods

    void setFromDegrees(String newFromDegrees){
        fromDegrees = newFromDegrees;
    }

    void setToDegrees(String newToDegrees){
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
        double total;
        if(Objects.equals(getFromDegrees(), "Celsius") && Objects.equals(getToDegrees(), "Fahrenheit")){
            total = (unitInput * 1.8) + 32;
        }else if(Objects.equals(getFromDegrees(), "Celsius") && Objects.equals(getToDegrees(), "Kelvin")){
            total = unitInput + 273.15;
        }else if(Objects.equals(getFromDegrees(), "Fahrenheit") && Objects.equals(getToDegrees(), "Celsius")){
            total = (unitInput - 32) * 0.6;
        }else if(Objects.equals(getFromDegrees(), "Fahrenheit") && Objects.equals(getToDegrees(), "Kelvin")){
            total = ((unitInput - 32) * 0.6) + 273.15;
        }else if(Objects.equals(getFromDegrees(), "Kelvin") && Objects.equals(getToDegrees(), "Celsius")){
            total = unitInput - 273.15;
        }else if(Objects.equals(getFromDegrees(), "Kelvin") && Objects.equals(getToDegrees(), "Fahrenheit")){
            total = (unitInput + 459.67) * 0.6;
        }else{
            total = -1;
        }

        return total;
    }

    public String toString(){
        return getFromDegrees() + " to " + getToDegrees() + " converter";
    }

    public void print(){
        System.out.println(toString());
    }
}
