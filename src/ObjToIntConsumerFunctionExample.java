import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;

public class ObjToIntConsumerFunctionExample {
    public static void main(String[] args) {
        ObjIntConsumer<Integer> objIntConsumer = (value, integer) -> System.out.println(value += integer);
        objIntConsumer.accept(10, 20);
    }
}
