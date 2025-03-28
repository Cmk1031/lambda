package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import static lambda.lambda5.map.MapMainV1.mapStringToLength;

public class MapMainV2 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

         // 문자열을 숫자로 변환
        List<Integer> numbers = map(list, s->Integer.valueOf(s));
        System.out.println("numbers = " + numbers);

        // 문자열의 길이 반환
        List<Integer> lengths = map(list, s -> s.length());
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> map(List<String> list, Function<String, Integer> function) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            numbers.add(function.apply(s));
        }
        return numbers;
    }
}
