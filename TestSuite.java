import TinyTestJ.Test;
import patterns.ConverterAbstractFactory;
import patterns.ConverterFactoryProducer;
import patterns.ConverterSingleton;
import src.converters.*;

import static TinyTestJ.Assert.*;

class TestSuite {
/*
=======================================================
                HOMEWORK 2
=======================================================
*/
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


/*
=======================================================
                    HOMEWORK 4
=======================================================
 */

        /*
        =======================================================
                            CURRENCY
        =======================================================
         */
        //DollarToEuro
        @Test public static void FactoryDETest1() throws Exception {
            //Using FACTORY PATTERN with ABSTRACT FACTORY
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("DollarToEuro");
            double result = tstFactory.convert(10000);
            tstFactory.print();
            assertEquals(8600,result,0.001);
        }
        @Test public static void FactoryDETest2()throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("DollarToEuro");
            double result = tstFactory.convert(550);
            tstFactory.print();
            assertEquals(473,result,0.001);
        }
        @Test public static void FactoryDETest3() throws Exception {
            ConverterSingleton tstSingleton = ConverterSingleton.getInstance();
            UnitConverter tstFactory = tstSingleton.getConverter("DollarToEuro");
            double result = tstFactory.convert(550);
            tstFactory.print();
            assertEquals(473,result,0.001);
        }
        @Test public static void FactoryDETest4()throws Exception{
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("DollarToEuro");
            double result = tstFactory.convert(-1);
            tstFactory.print();
            assertEquals(1,result,0.001);
        }

        //PoundToLira
        @Test public static void FactoryPLTest1() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("PoundToLira");
            double result = tstFactory.convert(10000);
            tstFactory.print();
            assertEquals(50500,result,0.001);
        }
        @Test public static void FactoryPLTest2() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("PoundToLira");
            double result = tstFactory.convert(583);
            tstFactory.print();
            assertEquals(2944.15,result,0.001);
        }
        @Test public static void FactoryPLTest3() throws Exception {
            ConverterSingleton tstSingleton = ConverterSingleton.getInstance();
            UnitConverter tstFactory = tstSingleton.getConverter("PoundToLira");
            double result = tstFactory.convert(583);
            tstFactory.print();
            assertEquals(2944.15,result,0.001);
        }
        @Test public static void FactoryPLTest4() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("PoundToLira");
            double result = tstFactory.convert(-1);
            tstFactory.print();
            assertEquals(1,result,0.001);
        }

        /*
        =======================================================
                            MEASUREMENTS
        =======================================================
         */

        //MetersToYards
        @Test public static void FactoryMYTest1() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("MetersToYards");
            double result = tstFactory.convert(10000);
            tstFactory.print();
            assertEquals(10936.13,result,0.001);
        }
        @Test public static void FactoryMYTest2() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("MetersToYards");
            double result = tstFactory.convert(257);
            tstFactory.print();
            assertEquals(281.059,result,0.001);
        }
        @Test public static void FactoryMYTest3() throws Exception {
            ConverterSingleton tstSingleton = ConverterSingleton.getInstance();
            UnitConverter tstFactory = tstSingleton.getConverter("MetersToYards");
            double result = tstFactory.convert(257);
            tstFactory.print();
            assertEquals(281.059,result,0.001);
        }
        @Test public static void FactoryMYTest4() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("MetersToYards");
            double result = tstFactory.convert(-1);
            tstFactory.print();
            assertEquals(1,result,0.001);
        }

        //MilesToKilometers
        @Test public static void FactoryMKTest1() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("MilesToKilometers");
            double result = tstFactory.convert(10000);
            tstFactory.print();
            assertEquals(16093.44,result,0.001);
        }
        @Test public static void FactoryMKTest2() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("MilesToKilometers");
            double result = tstFactory.convert(386);
            tstFactory.print();
            assertEquals(621.207,result,0.001);
        }
        @Test public static void FactoryMKTest3() throws Exception {
            ConverterSingleton tstSingleton = ConverterSingleton.getInstance();
            UnitConverter tstFactory = tstSingleton.getConverter("MilesToKilometers");
            double result = tstFactory.convert(386);
            tstFactory.print();
            assertEquals(621.207,result,0.001);
        }
        @Test public static void FactoryMKTest4() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("MilesToKilometers");
            double result = tstFactory.convert(-1);
            tstFactory.print();
            assertEquals(1,result,0.001);
        }


            /*
            =======================================================
                                TEMPERATURE
            =======================================================
             */

        //CelsiusToFahrenheit
        @Test public static void FactoryCFTest1() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("CelsiusToFahrenheit");
            double result = tstFactory.convert(100);
            tstFactory.print();
            assertEquals(212,result,0.001);
        }
        @Test public static void FactoryCFTest2()throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("CelsiusToFahrenheit");
            double result = tstFactory.convert(50);
            tstFactory.print();
            assertEquals(122,result,0.001);
        }
        @Test public static void FactoryCFTest3()throws Exception {
            ConverterSingleton tstSingleton = ConverterSingleton.getInstance();
            UnitConverter tstFactory = tstSingleton.getConverter("CelsiusToFahrenheit");
            double result = tstFactory.convert(50);
            tstFactory.print();
            assertEquals(122,result,0.001);
        }
        @Test public static void FactoryCFTest4() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("CelsiusToFahrenheit");
            double result = tstFactory.convert(-1);
            tstFactory.print();
            assertEquals(1,result,0.001);
        }

        //FahrenheitToCelsius
        @Test public static void FactoryFCTest1() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("FahrenheitToCelsius");
            double result = tstFactory.convert(100);
            tstFactory.print();
            assertEquals(37.7808,result,0.001);
        }
        @Test public static void FactoryFCTest2() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("FahrenheitToCelsius");
            double result = tstFactory.convert(12);
            tstFactory.print();
            assertEquals(-11.1111,result,0.001);
        }
        @Test public static void FactoryFCTest3() throws Exception {
            ConverterSingleton tstSingleton = ConverterSingleton.getInstance();
            UnitConverter tstFactory = tstSingleton.getConverter("FahrenheitToCelsius");
            double result = tstFactory.convert(12);
            tstFactory.print();
            assertEquals(-11.1111,result,0.001);
        }
        @Test public static void FactoryFCTest4() throws Exception {
            ConverterAbstractFactory theF = ConverterFactoryProducer.getFactory();
            UnitConverter tstFactory = theF.callFactory("FahrenheitToCelsius");
            double result = tstFactory.convert(-1);
            tstFactory.print();
            assertEquals(1,result,0.001);
        }

/*
=======================================================
                    HOMEWORK 2
=======================================================
 */
    public static void testInput(){
        System.out.print("=======================================================\n" +
                "                STARTING TEST SUITE HW 2\n" +
                "=======================================================\n");

        /*
        =======================================================
                        CURRENCY
        =======================================================
        */
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
            System.err.println("HW 2 - Test failed: " + e);
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
            System.err.println("HW 2 - Test failed: " + e);
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
            System.err.println("HW 2 - Test failed: " + e);
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
            System.err.println("HW 2 - Test failed: " + e);
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
            System.err.println("HW 2 - Test failed: " + e);
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
            System.err.println("HW 2 - Test failed: " + e);
        }

        System.out.print("=======================================================\n" +
                "                ENDING TEST SUITE HW 2\n" +
                "=======================================================\n");

        System.out.print("=======================================================\n" +
                "*******************************************************\n" +
                "=======================================================\n");

        System.out.print("=======================================================\n" +
                "                STARTING TEST SUITE HW 4\n" +
                "=======================================================\n");

        /*
        =======================================================
                        CURRENCY
        =======================================================
        */
        System.out.print("\n=======================================================\n" +
                "                    TESTING CURRENCY\n" +
                "=======================================================\n");
        //DollarToEuro
        System.out.print("=======================================================\n" +
                "             TESTING DollarToEuroConverter\n" +
                "=======================================================\n");
        try{
            FactoryDETest1();
            System.out.println("Test succeeded: TestSuite.FactoryDETest1() \n\n");
            FactoryDETest2();
            System.out.println("Test succeeded: TestSuite.FactoryDETest2() \n\n");
            FactoryDETest3();
            System.out.println("Test succeeded: TestSuite.FactoryDETest3() \n\n");
            FactoryDETest4();
            System.out.println("Test succeeded: TestSuite.FactoryDETest4() \n\n");
        }catch (AssertionError e) {
            System.err.println("HW 4 - Test failed: " + e);
        }catch (Exception e) {
            System.err.println("HW 4 - Test failed: " + e);
        }
        //PoundToLira
        System.out.print("\n\n=======================================================\n" +
                "             TESTING PoundToLiraConverter\n" +
                "=======================================================\n");
        try{
            FactoryPLTest1();
            System.out.println("Test succeeded: TestSuite.FactoryPLTest1() \n\n");
            FactoryPLTest2();
            System.out.println("Test succeeded: TestSuite.FactoryPLTest2() \n\n");
            FactoryPLTest3();
            System.out.println("Test succeeded: TestSuite.FactoryPLTest3() \n\n");
            FactoryPLTest4();
            System.out.println("Test succeeded: TestSuite.FactoryPLTest4() \n\n");
        }catch (AssertionError e) {
            System.err.println("HW 4 - Test failed: " + e);
        }catch (Exception e) {
            System.err.println("HW 4 - Test failed: " + e);
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
            FactoryMYTest1();
            System.out.println("Test succeeded: TestSuite.FactoryMYTest1() \n\n");
            FactoryMYTest2();
            System.out.println("Test succeeded: TestSuite.FactoryMYTest2() \n\n");
            FactoryMYTest3();
            System.out.println("Test succeeded: TestSuite.FactoryMYTest3() \n\n");
            FactoryMYTest4();
            System.out.println("Test succeeded: TestSuite.FactoryMYTest4() \n\n");
        }catch (AssertionError e) {
            System.err.println("HW 4 - Test failed: " + e);
        }catch (Exception e) {
            System.err.println("HW 4 - Test failed: " + e);
        }
        //MilesToKilometers
        System.out.print("\n\n=======================================================\n" +
                "           TESTING MilesToKilometersConverter\n" +
                "=======================================================\n");
        try{
            FactoryMKTest1();
            System.out.println("Test succeeded: TestSuite.FactoryMKTest1() \n\n");
            FactoryMKTest2();
            System.out.println("Test succeeded: TestSuite.FactoryMKTest2() \n\n");
            FactoryMKTest3();
            System.out.println("Test succeeded: TestSuite.FactoryMKTest3() \n\n");
            FactoryMKTest4();
            System.out.println("Test succeeded: TestSuite.FactoryMKTest4() \n\n");
        }catch (AssertionError e) {
            System.err.println("HW 4 - Test failed: " + e);
        }catch (Exception e) {
            System.err.println("HW 4 - Test failed: " + e);
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
            FactoryCFTest1();
            System.out.println("Test succeeded: TestSuite.FactoryCFTest1() \n\n");
            FactoryCFTest2();
            System.out.println("Test succeeded: TestSuite.FactoryCFTest2() \n\n");
            FactoryCFTest3();
            System.out.println("Test succeeded: TestSuite.FactoryCFTest3() \n\n");
            FactoryCFTest4();
            System.out.println("Test succeeded: TestSuite.FactoryCFTest4() \n\n");
        }catch (AssertionError e) {
            System.err.println("HW 4 - Test failed: " + e);
        }catch (Exception e) {
            System.err.println("HW 4 - Test failed: " + e);
        }
        //FahrenheitToCelsius
        System.out.print("\n\n=======================================================\n" +
                "       TESTING FahrenheitToCelsiusConverter\n" +
                "=======================================================\n");
        try{
            FactoryFCTest1();
            System.out.println("Test succeeded: TestSuite.FactoryFCTest1() \n\n");
            FactoryFCTest2();
            System.out.println("Test succeeded: TestSuite.FactoryFCTest2() \n\n");
            FactoryFCTest3();
            System.out.println("Test succeeded: TestSuite.FactoryFCTest3() \n\n");
            FactoryFCTest4();
            System.out.println("Test succeeded: TestSuite.FactoryFCTest4() \n\n");
        }catch (AssertionError e) {
            System.err.println("HW 4 - Test failed: " + e);
        }catch (Exception e) {
            System.err.println("HW 4 - Test failed: " + e);
        }

        System.out.print("=======================================================\n" +
                "                ENDING TEST SUITE HW 4\n" +
                "=======================================================\n");

        System.out.print("=======================================================\n" +
                "*******************************************************\n" +
                "=======================================================\n");
    }
}
