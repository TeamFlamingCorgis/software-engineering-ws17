import TinyTestJ.Test;
import src.converters.*;

import static TinyTestJ.Assert.*;

class TestSuite {
    /*
    =======================================================
                        CURRENCY
    =======================================================
     */
  //DollarToEuro
  @Test public static void DETest1() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(10000);
      test.print();
    assertEquals(8600,result,0.001);
  }
  @Test public static void DETest2() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(550);
      test.print();
    assertEquals(473,result,0.001);
  }
  @Test public static void DETest3() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-1);
      test.print();
    assertEquals(1,result,0.001);
  }

    //PoundToLira
    @Test public static void PLTest1() {
        UnitConverter test = new PoundToLiraConverter();
        double result = test.convert(10000);
        test.print();
        assertEquals(50500,result,0.001);
    }
    @Test public static void PLTest2() {
        UnitConverter test = new PoundToLiraConverter();
        double result = test.convert(583);
        test.print();
        assertEquals(2944.15,result,0.001);
    }
    @Test public static void PLTest3() {
        UnitConverter test = new PoundToLiraConverter();
        double result = test.convert(-1);
        test.print();
        assertEquals(1,result,0.001);
    }

    /*
    =======================================================
                        MEASUREMENTS
    =======================================================
     */

    //MetersToYards
    @Test public static void MYTest1() {
        UnitConverter test = new MetersToYardsConverter();
        double result = test.convert(10000);
        test.print();
        assertEquals(10936.13,result,0.001);
    }
    @Test public static void MYTest2() {
        UnitConverter test = new MetersToYardsConverter();
        double result = test.convert(257);
        test.print();
        assertEquals(281.059,result,0.001);
    }
    @Test public static void MYTest3() {
        UnitConverter test = new MetersToYardsConverter();
        double result = test.convert(-1);
        test.print();
        assertEquals(1,result,0.001);
    }

    //MilesToKilometers
    @Test public static void MKTest1() {
        UnitConverter test = new MilesToKilometersConverter();
        double result = test.convert(10000);
        test.print();
        assertEquals(16093.44,result,0.001);
    }
    @Test public static void MKTest2() {
        UnitConverter test = new MilesToKilometersConverter();
        double result = test.convert(386);
        test.print();
        assertEquals(621.207,result,0.001);
    }
    @Test public static void MKTest3() {
        UnitConverter test = new MilesToKilometersConverter();
        double result = test.convert(-1);
        test.print();
        assertEquals(1,result,0.001);
    }


    /*
    =======================================================
                        TEMPERATURE
    =======================================================
     */

    //CelsiusToFahrenheit
    @Test public static void CFTest1() {
        UnitConverter test = new CelsiusToFahrenheitConverter();
        double result = test.convert(100);
        test.print();
        assertEquals(212,result,0.001);
    }
    @Test public static void CFTest2() {
        UnitConverter test = new CelsiusToFahrenheitConverter();
        double result = test.convert(50);
        test.print();
        assertEquals(122,result,0.001);
    }
    @Test public static void CFTest3() {
        UnitConverter test = new CelsiusToFahrenheitConverter();
        double result = test.convert(-1);
        assertEquals(1,result,0.001);
    }

    //FahrenheitToCelsius
    @Test public static void FCTest1() {
        UnitConverter test = new FahrenheitToCelsiusConverter();
        double result = test.convert(100);
        test.print();
        assertEquals(37.7808,result,0.001);
    }
    @Test public static void FCTest2() {
        UnitConverter test = new FahrenheitToCelsiusConverter();
        double result = test.convert(12);
        test.print();
        assertEquals(-11.1111,result,0.001);
    }
    @Test public static void FCTest3() {
        UnitConverter test = new FahrenheitToCelsiusConverter();
        double result = test.convert(-1);
        test.print();
        assertEquals(1,result,0.001);
    }


    public static void testInput(){

        /*
        =======================================================
                        CURRENCY
        =======================================================
        */
        System.out.print("=======================================================\n" +
                "                STARTING TEST SUITE\n" +
                "=======================================================\n");
        System.out.print("\n=======================================================\n" +
                "                    TESTING CURRENCY\n" +
                "=======================================================\n");
        //DollarToEuro
        System.out.print("=======================================================\n" +
                "             TESTING DollarToEuroConverter\n" +
                "=======================================================\n");
        try{
            DETest1();
            System.out.println("Test succeeded: TestSuite.DETest1() \n\n");
            DETest2();
            System.out.println("Test succeeded: TestSuite.DETest2() \n\n");
            DETest3();
            System.out.println("Test succeeded: TestSuite.DETest3() \n\n");
        }catch (AssertionError e) {
            System.out.println("Test failed: " + e);
        }
        //PoundToLira
        System.out.print("\n\n=======================================================\n" +
                "             TESTING PoundToLiraConverter\n" +
                "=======================================================\n");
        try{
            PLTest1();
            System.out.println("Test succeeded: TestSuite.PLTest1() \n\n");
            PLTest2();
            System.out.println("Test succeeded: TestSuite.PLTest2() \n\n");
            PLTest3();
            System.out.println("Test succeeded: TestSuite.PLTest3() ");
        }catch (AssertionError e) {
            System.out.println("Test failed: " + e);
        }

        /*
        =======================================================
                        MEASUREMENTS
        =======================================================
        */
        System.out.print("\n\n=======================================================\n" +
                "             TESTING MEASUREMENTS\n" +
                "=======================================================\n");
        //MetersToYards
        System.out.print("=======================================================\n" +
                "          TESTING MetersToYardsConverter\n" +
                "=======================================================\n");
        try{
            MYTest1();
            System.out.println("Test succeeded: TestSuite.MYTest1() \n\n");
            MYTest2();
            System.out.println("Test succeeded: TestSuite.MYTest2() \n\n");
            MYTest3();
            System.out.println("Test succeeded: TestSuite.MYTest3() ");
        }catch (AssertionError e) {
            System.out.println("Test failed: " + e);
        }
        //MilesToKilometers
        System.out.print("\n\n=======================================================\n" +
                "           TESTING MilesToKilometersConverter\n" +
                "=======================================================\n");
        try{
            MKTest1();
            System.out.println("Test succeeded: TestSuite.MKTest1() \n\n");
            MKTest2();
            System.out.println("Test succeeded: TestSuite.MKTest2() \n\n");
            MKTest3();
            System.out.println("Test succeeded: TestSuite.MKTest3() ");
        }catch (AssertionError e) {
            System.out.println("Test failed: " + e);
        }

        /*
        =======================================================
                        TEMPERATURE
        =======================================================
        */
        System.out.print("\n\n=======================================================\n" +
                "              TESTING TEMPERATURE\n" +
                "=======================================================\n");
        //CelsiusToFahrenheit
        System.out.print("=======================================================\n" +
                "       TESTING CelsiusToFahrenheitConverter\n" +
                "=======================================================\n");
        try{
            CFTest1();
            System.out.println("Test succeeded: TestSuite.CFTest1() \n\n");
            CFTest2();
            System.out.println("Test succeeded: TestSuite.CFTest2() \n\n");
            CFTest3();
            System.out.println("Test succeeded: TestSuite.CFTest3() ");
        }catch (AssertionError e) {
            System.out.println("Test failed: " + e);
        }
        //FahrenheitToCelsius
        System.out.print("\n\n=======================================================\n" +
                "       TESTING FahrenheitToCelsiusConverter\n" +
                "=======================================================\n");
        try{
            FCTest1();
            System.out.println("Test succeeded: TestSuite.FCTest1() \n\n");
            FCTest2();
            System.out.println("Test succeeded: TestSuite.FCTest2() \n\n");
            FCTest3();
            System.out.println("Test succeeded: TestSuite.FCTest3() ");
        }catch (AssertionError e) {
            System.out.println("Test failed: " + e);
        }
    }
}
