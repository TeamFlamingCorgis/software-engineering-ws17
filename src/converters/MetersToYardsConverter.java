package src.converters;

public class MetersToYardsConverter extends LengthConverter{
    //Constructors
    //Default constructor
    public MetersToYardsConverter(){
        super();
        setFromUnit("Meters");
        setToUnit("Yards");
        setKValue(1.09361);
    }

    //Overloaded constructor
    public MetersToYardsConverter(String fromMeters, String toYards, double ex){
        super(fromMeters,toYards,ex);
    }
}
