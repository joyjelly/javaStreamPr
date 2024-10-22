package study.practice.ex2;

import java.util.ArrayList;

/**
 * 약수 구하기, 두 수의 최대공약수와 최대공배수 구하기
 * 1~10의 수 중 A의 약수 또는 B의 약수인 경우의 수
 * 1~10의 수 중 A의 약수이면서 B의 약수인 경우의 수
 */
public class Practice {
    //약수

    public ArrayList<Integer> getDivisor(int num){
        ArrayList<Integer> result = new ArrayList<>();
        //절반까지만 돌림

        for (int i = 1; i <= (int)num/2; i++) {
            if(num%i ==0){
                result.add(i);
            }
        }
        result.add(num);

        return result;
    }
    //최대공약수
    public int getGCD(int num1, int num2){
        int gcd = -1;

        ArrayList<Integer> diviserA = getDivisor(num1);
        ArrayList<Integer> diviserB = getDivisor(num2);

        for (int temp : diviserA){
            for(int item : diviserB){
                if(temp ==item){
                    if (temp>gcd){
                        gcd = temp;
                    }
                }
            }
        }

        return gcd;
    }
    //최소공약수
    public  int getLCM(int numA, int numB){
        int lcm = -1;
        lcm = numA*numB/(getGCD(numA,numB));
        return lcm;
    }



}
