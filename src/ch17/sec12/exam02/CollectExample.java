package ch17.sec12.exam02;

import ch17.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 요소 그룹핑
 */
public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();

        totalList.add(new Student("홍길동", "남",92));
        totalList.add(new Student("김수영", "여",95));
        totalList.add(new Student("신용권", "남",87));
        totalList.add(new Student("박수미", "여",93));

        Map<String, List<Student>> map = totalList.stream().collect(Collectors.groupingBy(s -> s.getGender())
        );

        List<Student> maleList = map.get("남");
        maleList.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println();


        List<Student> femaleList = map.get("여");
       femaleList.stream().forEach(s -> System.out.println(s.getName()));

        Map<String, Double> map1 = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getGender(),
                                Collectors.averagingDouble(s -> s.getScore())
                        )
                );

        System.out.println("map1 = " + map1);
    }
}
