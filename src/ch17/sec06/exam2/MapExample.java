package ch17.sec06.exam2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(arry);

        intStream.asDoubleStream()
                .forEach(i-> System.out.print(i +" "));
        intStream = Arrays.stream(arry);

        intStream.boxed()
                .forEach(o -> System.out.println(o.intValue() +" "));


    }
}
