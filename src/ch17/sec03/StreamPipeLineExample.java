package ch17.sec03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 중간처리와 최종처리
 */
public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("기미찌",100));
        list.add(new Student("이찌",90));
        list.add(new Student("미찌",80));

        /*IntStream intStream = list.stream().mapToInt(Student::getScore);

        double avg = intStream.average().getAsDouble();
        System.out.println(avg);*/

        double avg = list.stream()
                .mapToInt(student ->student.getScore())
                .average().
                getAsDouble();

        System.out.println(avg);

    }
}
