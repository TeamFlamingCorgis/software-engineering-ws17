package src.converters;

import errorHandling.DataTypeException;

import java.util.Objects;

public class TemperatureConverter extends UnitConverter {
    private double tempFrom, tempTo;
    private String fromDegrees, toDegrees;

    TemperatureConverter(){
        fromDegrees = " ";
        toDegrees = " ";
    }

    TemperatureConverter(String newFromDegrees, String newToDegrees){
        //HEY! FILL OUT THOSE VALUES MAN!
        try {
            if(newFromDegrees != null || newToDegrees != null){
                fromDegrees = newFromDegrees;
                toDegrees = newToDegrees;
            }else {
                throw new DataTypeException("Your values are null, please fix it.", newFromDegrees, newToDegrees);
            }
        } catch (DataTypeException e) {
            System.out.println("One of these temperatures is invalid: " + e.getFrom() + " or " + e.getTo());
            e.printStackTrace();
        }

        try{
            boolean fromValid = newFromDegrees.equals("Celsius") || newFromDegrees.equals("celsius") || newFromDegrees.equals("Fahrenheit") || newFromDegrees.equals("fahrenheit");
            boolean toValid = newToDegrees.equals("Celsius") || newToDegrees.equals("celsius") || newToDegrees.equals("Fahrenheit") || newToDegrees.equals("fahrenheit");
            if(fromValid && toValid){
                fromDegrees = newFromDegrees;
                toDegrees = newToDegrees;
            }else{
                throw new DataTypeException("Your values are mismatching, please fix it.", newFromDegrees, newToDegrees);
            }
        }catch (DataTypeException e){
            System.out.println("One of the temperatures is written wrong" + e.getFrom() + " or " + e.getTo());
            e.printStackTrace();
        }
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
            try{
                if(total > 523.4){
                    total = total;
                }else{
                    throw new DataTypeException("You cannot go below absolute zero! " + total + " is not valid in Fahrenheit", total);
                }
            }catch (DataTypeException e){
                System.out.println("You cannot go below absolute zero");
                e.printStackTrace();

            }

        }else if(Objects.equals(getFromDegrees(), "Celsius") && Objects.equals(getToDegrees(), "Kelvin")){
            total = unitInput + 273.15;
        }else if(Objects.equals(getFromDegrees(), "Fahrenheit") && Objects.equals(getToDegrees(), "Celsius")){
            total = (unitInput - 32) * 0.5556;
            try{
                if(total > 273){
                    total = total;
                }else{
                    throw new DataTypeException("You cannot go below absolute zero! " + total + " is not valid in Celsius", total);
                }
            }catch (DataTypeException e){
                System.out.println("You cannot go below absolute zero");
                e.printStackTrace();

            }
        }else if(Objects.equals(getFromDegrees(), "Fahrenheit") && Objects.equals(getToDegrees(), "Kelvin")){
            total = ((unitInput - 32) * 0.5556) + 273.15;
        }else if(Objects.equals(getFromDegrees(), "Kelvin") && Objects.equals(getToDegrees(), "Celsius")){
            total = unitInput - 273.15;
        }else if(Objects.equals(getFromDegrees(), "Kelvin") && Objects.equals(getToDegrees(), "Fahrenheit")){
            total = (unitInput + 459.67) * 0.5556;
        }else{
            total = -1;
        }

        tempFrom = unitInput;
        tempTo = total;

        return total;
    }

    public String toString(){
        return getFromDegrees() + " to " + getToDegrees() + " converter";
    }

    public void print(){
        System.out.println(toString() + ": has converted " + tempFrom + " " + getFromDegrees()  + " to " + tempTo + " " + getToDegrees() + "!");
    }
}
