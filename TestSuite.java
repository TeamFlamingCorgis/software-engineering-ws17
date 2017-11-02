import TinyTestJ.Test;
import src.converters.DollarToEuroConverter;
import src.converters.UnitConverter;

import static TinyTestJ.Assert.*;

class TestSuite {
  @Test public static void DETest1() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(10000);
    assertEquals(8500,result,0.001);
  }
  @Test public static void DETest2() {
    UnitConverter test = new DollarToEuroConverter();
    double result = test.convert(-1);
    assertEquals(1,result,0.001);
  }
}
