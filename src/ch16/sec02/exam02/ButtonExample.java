package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOk = new Button();

        //버튼 객체에 람다식 주입
        btnOk.setClickListener(() ->{
            System.out.println("Ok 버튼을 클릭하셨습니다.");
        });

        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> {
            System.out.println("Cancel 버튼을 클릭했습니다.");
        });

        btnCancel.click();
    }
}
