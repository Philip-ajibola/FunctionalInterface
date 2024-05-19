import java.util.function.LongFunction;

public class LongFunctionExample {
    public static void main(String[] args) {
        LongFunction<Long> function = (value)-> value*2;
        System.out.println(function.apply(10));
    }
}
