package ch16.sec05.exam01;


import ch16.sec04.Calcuable;

public class Person {
    public void action(Calcuable calculable){
        double result = calculable.calc(10,4);

        System.out.println("result = " + result);
        
    }
}
