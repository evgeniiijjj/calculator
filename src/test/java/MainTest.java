import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MainTest {
    static Calculator calc = initCalculator();

    static Calculator initCalculator() {
        return Calculator.instance.get();
    }

    @Test
    public void successCreateCalculator() {
        assertThat(calc, notNullValue());
    }

    @Test
    public void checkPlusCalc() {
        assertThat(calc.plus.apply(5, 3), equalTo(8));
    }

    @Test
    public void checkMinusCalc() {
        assertThat(calc.minus.apply(5, 3), equalTo(2));
    }

    @Test
    public void checkMultiplyCalc() {
        assertThat(calc.multiply.apply(5, 3), equalTo(15));
    }

    @Test
    public void checkDivideCalc() {
        assertThat(calc.divide.apply(27, 3), equalTo(9));
    }

    @Test
    public void checkPowCalc() {
        assertThat(calc.pow.apply(5), equalTo(25));
    }

    @Test
    public void checkAbsCalc() {
        assertThat(calc.abs.apply(-17), equalTo(17));
    }

    @Test
    public void checkDivideException() {
        assertThrows(ArithmeticException.class, () -> calc.divide.apply(5, 0));
    }

}
