package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("기미찌");
        list.add("기미찌");
        list.add("기미찌");
        list.add("김이찌");
        list.add("김삼찌");
        list.add("시는정");
        list.add("김도현");
        list.add("김도영");
        list.add("김도영");
        list.add("김도현");


        list.stream().distinct().forEach(i-> System.out.print(i +" "));
        System.out.println();


        list.stream().filter(i-> i.startsWith("김")).forEach( j-> System.out.print(j +" "));
        System.out.println();
        list.stream().distinct().filter(i-> i.startsWith("김")).forEach( j-> System.out.print(j +" "));
    }
}
