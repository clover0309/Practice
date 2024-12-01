import java.util.Arrays;

public class 인스턴스오브 {

    public static void main(String[] args) {
        class A{}
        class B extends A{}
        A a = new A();
        B b = new B();
        //클래스나 인터페이스로부터 생성되었으면 true반환, 아니면 false반환
        System.out.println(a instanceof A); //a는 A임으로 참
        System.out.println(b instanceof A); //b는 A의 자식임으로 참
        System.out.println(a instanceof B); //a는 b의 자식임으로 거짓.
        System.out.println(b instanceof B); //b는 B임으로 참
    }
}
