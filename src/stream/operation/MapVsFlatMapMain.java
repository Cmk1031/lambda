package stream.operation;

import java.util.ArrayList;
import java.util.List;

public class MapVsFlatMapMain {
    public static void main(String[] args) {
        List<List<Integer>> outerList = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );
        System.out.println("outerList = " + outerList);

        // for
        List<Integer> forResult = new ArrayList<>();
        for (List<Integer> list : outerList) {
            for (Integer i : list) {
                forResult.add(i);
            }
        }
        System.out.println("forResult = " + forResult);

        // map
        List<Integer> list1 = outerList.stream()
                .flatMap(list -> list.stream())
                .toList();

        System.out.println(list1);

    }
}
