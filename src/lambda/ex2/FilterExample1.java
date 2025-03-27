package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExample1 {

    public static List<Integer> filter(List<Integer> list, MyPredicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer val : list) {
            if(predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트: " + numbers);

        // 1. 음수(negative)만 뽑아내기
        // 익명클래스
        List<Integer> list = filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value < 0;
            }
        });
        System.out.println(list);

        // 람다
        /*List<Integer> list = filter(numbers, (value) -> value < 0);
        System.out.println(list);*/


        // 2. 짝수(even)만 뽑아내기
        // 익명클래스
        List<Integer> list1 = filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });
        System.out.println(list1);

        // 람다
        List<Integer> list2 = filter(numbers, value -> value % 2 == 0);
        System.out.println(list2);


    }
}
