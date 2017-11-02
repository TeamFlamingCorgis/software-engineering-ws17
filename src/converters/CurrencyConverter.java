package src.converters;

public class CurrencyConverter extends UnitConverter {
    private double exchangeRate, inputAmt, totalAmt;
    private String fromCurrency, toCurrency;

    CurrencyConverter(){
        exchangeRate = 0.0;
        fromCurrency = " ";
        toCurrency = " ";
    }

    CurrencyConverter(String newFromCurrency, String newToCurrency, double newExchangeRate){

        exchangeRate = newExchangeRate;
        fromCurrency = newFromCurrency;
        toCurrency = newToCurrency;
    }

    void setExchangeRate(double newExchangeRate) {
        exchangeRate = newExchangeRate;
    }

    void setFromCurrency(String newFromCurrency) {
        fromCurrency = newFromCurrency;
    }

    void setToCurrency(String newToCurrency) {
        toCurrency = newToCurrency;
    }

    private double getExchangeRate() {
        return exchangeRate;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public double convert(double amount){
        inputAmt = amount;
        totalAmt = amount * getExchangeRate();
        return totalAmt;
    }

    public String toString(){
        return getFromCurrency() + " to " + getToCurrency() + " converter";
    }

    public void print(){
        System.out.println(toString() + ": has converted " + inputAmt + " " + getFromCurrency()  + " to " + totalAmt + " " + getToCurrency() + "!");
    }

}