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

    CurrencyConverter myConverter = new DollarToEuroConverter();
    myConverter.setFromCurrency("Dollars");
    myConverter.setToCurrency("Euros");
    myConverter.setExchangeRate(0.86);

    double aLotOfDollars = 10000;
    double aLotOfEuros = myConverter.convert(aLotOfDollars);
    System.out.println(myConverter.toString() + " has converted " + aLotOfDollars  + " " + myConverter.getFromCurrency() + " to " + aLotOfEuros + " " + myConverter.getToCurrency() + "!");
  }
}
