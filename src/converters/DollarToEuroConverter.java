package src.converters;

public class DollarToEuroConverter extends CurrencyConverter
{
    //Constructors
    //Default constructor
    public DollarToEuroConverter(){
        super();
        super.setFromCurrency("Dollars");
        super.setToCurrency("Euros");
        super.setExchangeRate(0.86);
    }

//    Overloaded constructor
    public DollarToEuroConverter(String Dollars, String Euros, double excRate){
        super(Dollars, Euros, excRate);

    }

}
