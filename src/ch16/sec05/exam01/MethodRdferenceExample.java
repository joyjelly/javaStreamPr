package ch16.sec05.exam01;

public class MethodRdferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        //정적 매서드의 경우
        //람다식
        //person.action((x,y) -> Computer.staticMethod(x,y));
        //매서드 참조
        person.action(Computer::staticMethod);

        //인스턴스 매서드의 경우
        Computer computer = new Computer();

        //람다식
        //person.action((x,y) -> computer.instanceMethod(x,y));
        //매서드 참조
        person.action(computer::instanceMethod);

    }
}
