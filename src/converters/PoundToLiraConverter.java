package src.converters;

import src.converters.CurrencyConverter;

public class PoundToLiraConverter extends CurrencyConverter {
    //Constructors
    //Default constructor
    public PoundToLiraConverter(){
        super();

        setFromCurrency("Pounds");
        setToCurrency("Lira");
        setExchangeRate(5.05);
    }

    //Overloaded constructor
    public PoundToLiraConverter(String Pound, String Lira, double excRate){
        super(Pound, Lira, excRate);
    }

};
