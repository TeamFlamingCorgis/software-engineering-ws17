public class DollarToEuroConverter extends CurrencyConverter
{
    public DollarToEuroConverter(){
        super();
    }


    public DollarToEuroConverter(String Dollars, String Euros, double excRate, double total){
        super(Dollars, Euros, excRate, total);
    }

    public String toString(){
        return "My Dollar to Euro Converter --- ";
    }

    public void print(){
        System.out.println(toString());
    }
};
