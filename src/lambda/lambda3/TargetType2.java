package lambda.lambda3;

import java.util.function.Function;

// 자바가 기본적으로 제공하는 Function 사용
public class TargetType2 {
    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        String result1 = upperCase.apply("hello");
        System.out.println("result1 = " + result1);
    }
}





