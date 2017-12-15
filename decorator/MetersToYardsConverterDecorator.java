package decorator;

import src.converters.LengthConverter;
import src.converters.*;

public class MetersToYardsConverterDecorator extends MetersToYardsConverter{
   protected LengthConverter lengthConverter;
    public MetersToYardsConverterDecorator(LengthConverter l){
        super();
        this.lengthConverter = l;
    }
    public double convert(double inval){
        return lengthConverter.convert(inval);
    }

    public String toString() {
       return lengthConverter.toString();
    }

    @Override
    public void print() {
        lengthConverter.print();
    }

    public void inversionMethod(){
        double inversion = super.getOutputUnit() / super.getkValue();
        String InverseIn = super.getToUnit();
        String InversionOut = super.getFromUnit();
        System.out.println("inversion has converted " + super.getOutputUnit() + " " + InverseIn  + " to " + inversion + " " + InversionOut + "!");
    }
}
