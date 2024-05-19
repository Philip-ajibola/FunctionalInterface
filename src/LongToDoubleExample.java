import java.util.function.LongToDoubleFunction;

public class LongToDoubleExample {
    public static void main(String[] args) {
        LongToDoubleFunction longToDoubleFunction = (a) -> a / 2 ;
        System.out.println(longToDoubleFunction.applyAsDouble(20L));
    }
}
