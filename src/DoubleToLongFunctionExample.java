import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionExample {
    public static void main(String[] args) {
        DoubleToLongFunction doubleToLongFunction = (value)-> (long) (value * 3L);
        System.out.println(doubleToLongFunction.applyAsLong(56.67));
    }
}
