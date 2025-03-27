package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExamplePrac {
    // 고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map(List<String> list, StringFunction func) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            result.add(func.apply(s));
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);
        // 1. 대문자 변환
        // 익명 클래스
        List<String> list1 = map(words, new StringFunction() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        });
        System.out.println(list1);

        // 람다
        List<String> list3 = map(words, s -> s.toUpperCase());
        System.out.println(list3);


        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        List<String> list2 = map(words, new StringFunction() {
            @Override
            public String apply(String s) {
                return "***" + s + "***";
            }
        });
        System.out.println(list2);

        // 람다
        List<String> list4 = map(words, s -> "***" + s + "***");
        System.out.println(list4);
    }

}
