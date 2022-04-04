import java.util.function.*;

public class Calculator {

    public static final Supplier<Calculator> instance = Calculator::new;

    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    public BinaryOperator<Integer> devide = (x, y) -> x / y;

    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : -x;

    public Predicate<Integer> isPositive = x -> x > 0;
    public Predicate<Integer> is0 = x -> x == 0;

    public Consumer<String> println = System.out::println;
}
