import java.util.function.DoublePredicate;

public class DoublePredicateExample {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = (a)-> a==3.0;
        System.out.println(doublePredicate.test(2.0));
        System.out.println(doublePredicate.test(3.0));
        System.out.println(doublePredicate.test(6.0));
    }
}
