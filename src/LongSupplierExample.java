import java.util.function.LongSupplier;

public class LongSupplierExample {
    public static void main(String[] args) {
        LongSupplier longSupplier = ()-> 50L;
        System.out.println(longSupplier.getAsLong());
    }
}
