public class PoundToLiraConverter extends CurrencyConverter{
    public PoundToLiraConverter(){
        super();

        setFromCurrency("Pounds");
        setToCurrency("Lira");
        setExchangeRate(5.05);
    }


    public PoundToLiraConverter(String Pound, String Lira, double excRate, double total){
        super(Pound, Lira, excRate, total);

        setFromCurrency("Pounds");
        setToCurrency("Lira");
        setExchangeRate(5.05);
    }

    public String toString(){
        return "My Pound to Lira Converter --- ";
    }

    public void print(){
        System.out.println(toString());
    }
}
