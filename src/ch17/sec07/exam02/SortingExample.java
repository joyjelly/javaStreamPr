package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("홍길동",30));
        list.add(new Student("김자바",100));
        list.add(new Student("이자바",80));
        //점수를 기준으로 오름차순 정렬

        list.stream().sorted().forEach(i -> System.out.println(i.getName()+" "+i.getScore()));

        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i.getName()+" "+i.getScore()));
    }
}
