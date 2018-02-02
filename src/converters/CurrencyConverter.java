package src.converters;
import errorHandling.DataTypeException;

public class CurrencyConverter extends UnitConverter {
    private double exchangeRate, inputAmt, totalAmt;
    private String fromCurrency, toCurrency;

    CurrencyConverter(){
        exchangeRate = 0.0;
        fromCurrency = " ";
        toCurrency = " ";
    }

    CurrencyConverter(String newFromCurrency, String newToCurrency, double newExchangeRate){

        //HEY! FILL OUT THOSE VALUES MAN!
           try {
               if(newFromCurrency != null || newToCurrency != null){
                fromCurrency = newFromCurrency;
                toCurrency = newToCurrency;
               }else {
                   throw new DataTypeException("Your values are null, please fix it.", newFromCurrency, newToCurrency);
               }
           } catch (DataTypeException e) {
               System.out.println("One of these currencies is invalid: " + e.getFrom() + " or " + e.getTo());
               e.printStackTrace();
           }

        //HEY! NO NEGATIVES PLEASE!
           try {
               if(newExchangeRate > 0){
                   exchangeRate = newExchangeRate;
                }else{
                   throw new DataTypeException("Your might owe money, but you cannot have negative value for the currency", newExchangeRate);
               }
           } catch (DataTypeException e) {
               System.out.println("\nExchange rate invalid = "+ e.getamt());
               e.printStackTrace();
           }
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