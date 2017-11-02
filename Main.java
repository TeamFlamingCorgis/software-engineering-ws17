import src.converters.CurrencyConverter;
import src.converters.DollarToEuroConverter;
import src.converters.PoundToLiraConverter;
import src.converters.currency.CurrencyConverter;

class Main {
  public static void main(String[] args)
  {
    String conversion = args[0];
    String value = args[1];
    CurrencyConverter myConverter;
    double result = 0.0;
    String conv = "", from = "", to = "";

    //Example one, please complete
    switch(conversion){
      case "DollarToEuro":
        myConverter = new DollarToEuroConverter();
        result = myConverter.convert(Double.parseDouble(value));
        conv = myConverter.toString();
        from = myConverter.getFromCurrency();
        to = myConverter.getToCurrency();
        break;
      default:
        System.out.println("Nope, nicht gut bro");
        break;
    }

    System.out.println(conv + " has converted " + value  + " " + from + " to " + result + " " + to + "!");

    /*
     * TODO
     *
     * use desired conversion here
     *
    */


//    int option = 1;
//    CurrencyConverter myConverter;
//    double myMoney = 150.0;
//
//    if(option == 0){
//      myConverter = new DollarToEuroConverter();
//    }else{
//      myConverter = new PoundToLiraConverter();
//    }
//
//    double myNewMoney = myConverter.convert(myMoney);
//    System.out.println(myConverter.toString() + " has converted " + myMoney  + " " + myConverter.getFromCurrency() + " to " + myNewMoney + " " + myConverter.getToCurrency() + "!");
//
  }
}
