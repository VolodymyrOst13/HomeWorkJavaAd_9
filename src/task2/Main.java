package task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int i = list.stream()
                .mapToInt(e -> (int) Math.pow(e, 2))
                .sum();
        System.out.println( i );
    }
}
