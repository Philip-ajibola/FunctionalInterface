import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionExample {
    public static void main(String[] args) {
        ToLongBiFunction<Integer,Double> function = (value1,value2)-> (long)((value2 * value1)/2);
        System.out.println(function.applyAsLong(5, 9.6));
    }
}
