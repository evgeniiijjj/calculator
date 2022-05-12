public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);// b равно 0;

        try {
            calc.divide.apply(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
