package lambda.lambda4;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorMain {
    public static void main(String[] args) {
        UnaryOperator<Integer> square1 = x -> x * x;
        System.out.println(square1.apply(5));

        BinaryOperator<Integer> addition1 = (a, b) -> a + b;
        System.out.println(addition1.apply(3,5));
    }
}


