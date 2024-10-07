package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = Arrays.stream(arr).
                filter(i -> i % 2 == 1)
                .peek(n -> System.out.println(n))
                .sum();
        System.out.println("총 합 :" +sum);
        System.out.println();

        Arrays.stream(arr).filter(i -> i%2==0)
                .forEach( i-> System.out.println(i));

    }
}
