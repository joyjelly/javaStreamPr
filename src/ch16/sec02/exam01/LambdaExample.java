package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        //실행문이 두개 이상인 경우 중괄호 필요
        person.action(() ->{
            System.out.println("출근을 하자");
            System.out.println("뭐야 취직시켜줘요");
        });

        person.action(()-> System.out.println("퇵은합시더"));
    }
}
