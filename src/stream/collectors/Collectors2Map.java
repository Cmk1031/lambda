package stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {
    public static void main(String[] args) {

        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name,  // keyMapper
                        name -> name.length()  // valueMapper
                ));
        System.out.println("map1 = " + map1);

        // 키 중복 대안 (병합)
        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Banana")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length(),
                        (oldVal, newVal) -> oldVal + newVal // 중복될 경우
                ));
        System.out.println("map3 = " + map3);

        // Map의 타입 지정
        LinkedHashMap<String, Integer> map4 = Stream.of("Apple", "Apple", "Banana")
                .collect(Collectors.toMap(
                        name -> name,
                        String::length,
                        (oldVal, newVal) -> oldVal + newVal,
                        LinkedHashMap::new
                ));
        System.out.println("map4 = " + map4);
    }
}
