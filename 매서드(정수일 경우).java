package Portfolio;

class Test5 {

    void setValue(int a) {
        a = 100;
    }
}

public class 매서드5 {
    public static void main(String[] args) {
        int a = 56;
        Test5 t5 = new Test5();

        t5.setValue(a);//숫자만 가져간다는 의미
        System.out.println(a);

        System.out.println("===");

        int b = 20;//위에 내용을 이해시키는 설명
        int c = b;
        c = 100;
        System.out.println(b);
    }
}
