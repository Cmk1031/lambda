package lambda.ex2;

import java.util.List;

public class ReduceExamplePrac {
    // 함수를 인자로 받아, 리스트 요소를 하나로 축약(reduce)하는 고차 함수
    public static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        int result = initial;
        for (Integer i : list) {
            result = reducer.reduce(result, i);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);
        // 1. 합 구하기 (초기값 0, 덧셈 로직)
        int sum1 = reduce(numbers, 0, new MyReducer() {
            @Override
            public int reduce(int a, int b) {
                return a + b;
            }
        });
        System.out.println(sum1);

        int sum2 = reduce(numbers, 0, (a, b) -> a+b);
        System.out.println(sum2);


        // 2. 곱 구하기 (초기값 1, 곱셈 로직)
        int mul1 = reduce(numbers, 1, new MyReducer() {
            @Override
            public int reduce(int a, int b) {
                return a * b;
            }
        });
        System.out.println(mul1);

        int mul2 = reduce(numbers, 1, (a,b) -> a*b);
        System.out.println(mul2);
    }
}
