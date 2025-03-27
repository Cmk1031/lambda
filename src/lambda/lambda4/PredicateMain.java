package lambda.lambda4;

import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        System.out.println(predicate.test(10));

        Predicate<Integer> predicate1 = (i) -> i%2==0;
        System.out.println(predicate1.test(10));
    }
}




