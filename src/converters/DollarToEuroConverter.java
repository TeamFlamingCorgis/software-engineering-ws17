package src.converters;
import src.converters.CurrencyConverter;

public class DollarToEuroConverter extends CurrencyConverter
{
    public DollarToEuroConverter(){
        super();
        setFromCurrency("Dollars");
        setToCurrency("Euros");
        setExchangeRate(0.86);
    }


    public DollarToEuroConverter(String Dollars, String Euros, double excRate){
        super(Dollars, Euros, excRate);

        setFromCurrency("Dollars");
        setToCurrency("Euros");
        setExchangeRate(0.86);
    }

    public String toString(){
        return "My Dollar to Euro Converter --- ";
    }

    public void print(){
        System.out.println(toString());
    }
};
