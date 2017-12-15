package decorator;

import src.converters.UnitConverter;

public class UnitConverterDecorator extends UnitConverter{
    protected UnitConverter unitConverter;

     UnitConverterDecorator(UnitConverter u) {
         super();
        this.unitConverter = u;
    }

    @Override
    public double convert(double inValue) {
        return this.unitConverter.convert(inValue);
    }

    @Override
    public String toString() {
        return this.unitConverter.toString();
    }

    @Override
    public void print() {
         this.unitConverter.print();

    }
}
