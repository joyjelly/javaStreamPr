package ch17.sec06.exam1;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Stundent> list = new ArrayList<>();
        list.add(new Stundent("김도현", 90));
        list.add(new Stundent("김이찌", 92));
        list.add(new Stundent("김도현", 90));
        list.add(new Stundent("기미찌", 92));

        list.stream().mapToInt(s->s.getScore()).forEach(i-> System.out.print(i +" "));

    }
}
