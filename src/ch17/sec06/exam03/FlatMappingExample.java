package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        //문장 스트림을 단어 스트림으로 변환.
        List<String> list1 = new ArrayList<>();
    list1.add("김도현은 최고의 투수");
    list1.add("김이찌는 노력중");
    list1.add("기미찌는 해낸다");
    list1.add("김도영 40-40 해낸다");

    list1.stream().
    flatMap(data ->
            Arrays.stream(data.split(" ")))
            .forEach(word -> System.out.print( word+" "));

    List<String> list2 = new ArrayList<>();
    list2.add("10,100,30");
    list2.add("40,40");

    list2.stream().flatMapToInt(data ->{
        String[] arr = data.split(",");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i].trim());

        }
        return Arrays.stream(intArr);
    }).sorted().forEach( in ->System.out.println(in));


    }
}
