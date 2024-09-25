package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
private static int sum;
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,100);

       intStream.forEach(i -> sum+=i);
        System.out.println(sum);
    }
}
