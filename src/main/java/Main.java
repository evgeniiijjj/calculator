public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);// b равно 0;

        if (calc.isPositive.test(b)) calc.println.accept(calc.devide.apply(a, b).toString());// перед делением необходима проверка делителя на равенство нулю;
        else calc.println.accept("делитель равен нулю");
    }
}
