package ch17.sec10;

import java.util.Arrays;

/**
 * 요소 기본 집계
 */
public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //카운팅
        long count = Arrays.stream(arr)
                .filter(i -> i%2==0 )
                .count();
        System.out.println("2의 배수의 개수 = " + count);

        long sum = Arrays.stream(arr)
                .filter(i -> i%2==0)
                .sum();
        System.out.println("2의 배수의 합 = " + sum);

        //평균
        double avg = Arrays.stream(arr)
                .filter(i -> i%2==0)
                .average()
                .getAsDouble();
        System.out.println("2의 배수의 평균 = " + avg);


        //최대 최소
        int max = Arrays.stream(arr)
                .filter(i -> i%2==0)
                .max()
                .getAsInt();
        System.out.println("최대값 = " + max);

        int min = Arrays.stream(arr)
                .filter(i -> i%2==0)
                .min()
                .getAsInt();
        System.out.println("최소값 = " + min);

        //첫번째 요소
        int first = Arrays.stream(arr)
                .filter(i -> i%3==0)
                .findFirst()
                .getAsInt();
        System.out.println("첫번째 3의 배수 = " + first);
    }
}
