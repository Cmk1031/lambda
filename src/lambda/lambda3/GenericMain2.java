package lambda.lambda3;

public class GenericMain2 {
    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        String result1 = upperCase.apply("hello");
        System.out.println("result3 = " + result1);

        Function<Integer, Integer> square = s -> s * s;
        int result2 = square.apply(10);
        System.out.println("result2 = " + result2);
    }

    @FunctionalInterface
    interface Function<T, R> {
        R apply(T t);
    }
}




