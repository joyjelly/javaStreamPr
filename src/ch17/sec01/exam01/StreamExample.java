package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("미찌");
        set.add("이찌");
        set.add("삼찌");

        //스트림을 이용한 요소 반복 처리
        Stream<String> stream = set.stream();
        stream.forEach(name ->System.out.println(name));

    }
}
