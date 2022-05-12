import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    static Calculator calc = initCalculator();

    static Calculator initCalculator() {
        return Calculator.instance.get();
    }

    @Test
    public void successCreateCalculator() {
        Assertions.assertNotNull(calc);
    }

    @Test
    public void checkPlusCalc() {
        int arg1 = 5;
        int arg2 = 3;
        int expectedResult = 8;
        int result = calc.plus.apply(arg1, arg2);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void checkMinusCalc() {
        int arg1 = 5;
        int arg2 = 3;
        int expectedResult = 2;
        int result = calc.minus.apply(arg1, arg2);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void checkMultiplyCalc() {
        int arg1 = 5;
        int arg2 = 3;
        int expectedResult = 15;
        int result = calc.multiply.apply(arg1, arg2);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDivideCalc() {
        int arg1 = 21;
        int arg2 = 3;
        int expectedResult = 7;
        int result = calc.divide.apply(arg1, arg2);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void checkPowCalc() {
        int arg = 5;
        int expectedResult = 25;
        int result = calc.pow.apply(arg);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void checkAbsCalc() {
        int arg = -17;
        int expectedResult = 17;
        int result = calc.abs.apply(arg);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void checkDivideException() {
        int arg1 = 5;
        int arg2 = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> calc.divide.apply(arg1, arg2));
    }

}
