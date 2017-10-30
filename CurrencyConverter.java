public class CurrencyConverter extends UnitConverter{
    private double exchangeRate, totalChange;
    private String fromCurrency, toCurrency;

    CurrencyConverter(){
        exchangeRate = 0.0;
        totalChange = 0.0;
        fromCurrency = " ";
        toCurrency = " ";
    }

    CurrencyConverter(String newFromCurrency, String newToCurrency, double newExchangeRate, double newTotalChange){

        exchangeRate = newExchangeRate;
        totalChange = newTotalChange;
        fromCurrency = newFromCurrency;
        toCurrency = newToCurrency;
    }

    public void setExchangeRate(double newExchangeRate) {
        exchangeRate = newExchangeRate;
    }

    public void setTotalChange(double newTotalChange) {
        totalChange = newTotalChange;
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

    public double getTotalChange() {
        return totalChange;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public double convert(double amount){
        double total = amount * getExchangeRate();
        setTotalChange(total);

        return total;
    }

    public String toString(){
        return getFromCurrency() + " to " + getToCurrency() + " converter.";
    }

    public void print(){
        System.out.println(toString());
    }

}