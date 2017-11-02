package src.converters;

public abstract class UnitConverter
{
  public UnitConverter() { }
  public abstract double convert(double inValue);
  public abstract String toString();
  public abstract void print();
};

