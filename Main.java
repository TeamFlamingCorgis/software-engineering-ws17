import src.converters.CurrencyConverter;
import src.converters.DollarToEuroConverter;
import src.converters.PoundToLiraConverter;
import src.converters.currency.CurrencyConverter;

class Main {
  public static void main(String[] args)
  {
//    String conversion = args[0];
//    String value = args[1];

    /*
     * TODO
     *
     * use desired conversion here
     *
    */


    int option = 1;
    CurrencyConverter myConverter;
    double myMoney = 150.0;

    if(option == 0){
      myConverter = new DollarToEuroConverter();
    }else{
      myConverter = new PoundToLiraConverter();
    }

    double myNewMoney = myConverter.convert(myMoney);
    System.out.println(myConverter.toString() + " has converted " + myMoney  + " " + myConverter.getFromCurrency() + " to " + myNewMoney + " " + myConverter.getToCurrency() + "!");

  }
}
