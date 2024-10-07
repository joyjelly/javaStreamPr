package ch17.sec09;

import java.util.Arrays;

public class MatchingExample {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,9};

        boolean result = Arrays.stream(arr).
                allMatch(i -> i % 2 == 0);
        System.out.println("모두 2의 배수인가? "+result);

        result = Arrays.stream(arr)
                .anyMatch(i -> i % 3 == 0);

        System.out.println("3의 배수가 있나?? "+result);
        result = Arrays.stream(arr)
                .noneMatch(i->i%9==0);
        System.out.println("9의 배수가 하나도 없니?? "+result);


    }
}
