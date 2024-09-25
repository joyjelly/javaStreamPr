package ch17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("일찌");
        list.add("이찌");
        list.add("미찌");
        list.add("삼찌");
        list.add("사찌");


        //병렬 처리
        Stream<String>stream = list.parallelStream();

        stream.forEach( name ->
                {
                    System.out.println(name +" : "+ Thread.currentThread().getName());
                }
                );

    }
}
