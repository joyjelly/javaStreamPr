package study.practice.ex1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        //자바에서 집합 사용
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1);//인덱스가 아니라 값 바로 삭제
        System.out.println("set1.size() = " + set1.size());

        //집합연산
        System.out.println("---집합연산---");

        //교집합
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(2,4,6,8,10));
        //교집합 매서드
        //a.retainAll(b);

       // System.out.println("교집합 연산 a = " + a);
        // 합집합 메서드
//        a.addAll(b);
//        System.out.println("합집합 연산 a = " + a);

        //차집합
        a.retainAll(b);
        System.out.println("차집합 연산 a = " + a);


    }
}
