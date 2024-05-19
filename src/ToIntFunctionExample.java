import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
    public static void main(String[] args) {
        ToIntFunction<Double> function = (value)-> (int)(value * 2);
        System.out.println(function.applyAsInt(10.7));
    }
}
