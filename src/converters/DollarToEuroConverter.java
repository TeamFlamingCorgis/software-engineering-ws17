package src.converters;

import src.converters.CurrencyConverter;

public class DollarToEuroConverter extends CurrencyConverter
{
    //Constructors
    //Default constructor
    public DollarToEuroConverter(){
        super();
        setFromCurrency("Dollars");
        setToCurrency("Euros");
        setExchangeRate(0.86);
    }

    //Overloaded constructor
    public DollarToEuroConverter(String Dollars, String Euros, double excRate){
        super(Dollars, Euros, excRate);
    }

};
