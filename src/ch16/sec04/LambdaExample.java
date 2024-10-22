package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 두개이상일경우
        person.action((x,y)->{
            double result = x+y;
            return  result;
        });
        //실행문이 한줄일경우
        person.action((x,y) -> (x+y));

        //리턴문이 하나만 있을 경우

        person.action((x,y) -> sum(x,y));


    }
    private static double sum( double x,double y){
        return x+y;
    }
}
