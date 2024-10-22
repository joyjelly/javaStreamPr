package study.practice.ex1;

import java.util.ArrayList;

class Myset {
    ArrayList<Integer> list;

    //생성자 1
    Myset() {
        this.list = new ArrayList<>();
    }

    //생성자 2
    Myset(int[] arr) {
        this.list = new ArrayList<>();

        for (int temp : arr) {
            this.list.add(temp);
        }

    }

    //원소 추가 (중복 X)
    public void add(int x) {
        for (int temp : list) {
            if (x == temp) {
                return;
            }
        }
        this.list.add(x);
    }

    //교집합
    public Myset retainAll(Myset b) {
        Myset result = new Myset();
        for (int temp : this.list) {
            for (int temp2 : b.list) {
                if (temp == temp2) {
                    result.add(temp);
                }
            }
        }
        return result;

    }

    //합집합
    public Myset addAll(Myset b){
        Myset result = new Myset();
        for (int temp: this.list){
            result.add(temp);
        }

        for (int temp: b.list){
            result.add(temp);
        }
        return result;
    }


    //차집합
    public Myset removeAll(Myset b){
        Myset result = new Myset();
        for (int temp : this.list){
            boolean flag = false;
            for (int item: b.list){
                if(temp==item){
                    flag =true;
                    break;
                }

            }
            if(!flag){//리스트에 같은 값이 없다!
                result.add(temp);
            }

        }
    return result;
    }

}

public class Practice {
}
