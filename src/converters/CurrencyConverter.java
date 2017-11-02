package src.converters;

public class CurrencyConverter extends UnitConverter {
    private double exchangeRate;
    private String fromCurrency, toCurrency;

    public CurrencyConverter(){
        exchangeRate = 0.0;
        fromCurrency = " ";
        toCurrency = " ";
    }

    public CurrencyConverter(String newFromCurrency, String newToCurrency, double newExchangeRate){

        exchangeRate = newExchangeRate;
        fromCurrency = newFromCurrency;
        toCurrency = newToCurrency;
    }

    public void setExchangeRate(double newExchangeRate) {
        exchangeRate = newExchangeRate;
    }

    public void setFromCurrency(String newFromCurrency) {
        fromCurrency = newFromCurrency;
    }

    public void setToCurrency(String newToCurrency) {
        toCurrency = newToCurrency;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public double convert(double amount){
        double total = amount * getExchangeRate();

        return total;
    }

    public String toString(){
        return getFromCurrency() + " to " + getToCurrency() + " converter.";
    }

    public void print(){
        System.out.println(toString());
    }

}