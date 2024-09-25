package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] arr = {"이찌","일찌","삼찌"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(i -> System.out.print(i + " "));

        int[] intArr = {1,2,3,4,5};
        IntStream integerStream = Arrays.stream(intArr);

        integerStream.forEach(i-> System.out.print(i +" "));


    }
}
