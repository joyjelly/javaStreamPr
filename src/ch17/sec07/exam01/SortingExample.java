package ch17.sec07.exam01;

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
        //순서대로 오면 오름차순인가?
        list.stream().
                sorted((s1,s2)->Integer.compare(s1.getScore(),s2.getScore())).
                forEach(i -> System.out.println(i.getName()+" "+i.getScore()));
        //순서를 바꾸면 내림차순!
        list.stream().
                sorted((s2,s1)->Integer.compare(s1.getScore(),s2.getScore())).
                forEach(i -> System.out.println(i.getName()+" "+i.getScore()));
    }
}
