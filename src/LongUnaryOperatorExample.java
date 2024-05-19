import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorExample {
    public static void main(String[] args) {
        LongUnaryOperator longUnaryOperator = value -> -value * 5;
        System.out.println(longUnaryOperator.applyAsLong(100));
    }
}
