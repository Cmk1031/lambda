package lambda.lambda3;

public class GenericMain3 {
    public static void main(String[] args) {
       Function<String, String> toUpperCase = str -> str.toUpperCase();
       Function<String, Integer> stringLength = str -> str.length();
       Function<Integer, Integer> square = x -> x * x;
       Function<Integer, Boolean> isEven = num -> num % 2 == 0;

        System.out.println(toUpperCase.apply("hello"));
        System.out.println(stringLength.apply("aaabbbccc"));
        System.out.println(square.apply(10));
        System.out.println(isEven.apply(5));
    }

    @FunctionalInterface
    interface Function<T, R> {
        R apply(T t);
    }
}





