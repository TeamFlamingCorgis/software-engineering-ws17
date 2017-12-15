package decorator;

import src.converters.LengthConverter;

public class LenghtUnitConverterDecorator extends LengthConverter {
    public LenghtUnitConverterDecorator(){
        super();
    }

    public void newLenghtConverterClass(String newInValueName, String newOutValueName, double inValue, double ConvertValue){
        super.setKValue(ConvertValue);
        super.setInputUnit(inValue);
        super.convert(inValue);
        super.setFromUnit(newInValueName);
        super.setToUnit(newOutValueName);
        super.print();
    }
    public void inversionMethod(){
        double inversion = super.getOutputUnit() / super.getkValue();
        String InverseIn = super.getToUnit();
        String InversionOut = super.getFromUnit();
        System.out.println("inversion has converted " + super.getOutputUnit() + " " + InverseIn  + " to " + inversion + " " + InversionOut + "!");

    }
}


