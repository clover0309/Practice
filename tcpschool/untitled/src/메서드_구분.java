import java.util.Arrays;

class Method {
    int a = 10, b = 20; //인스턴트 변수
    int add() {
        return a + b;
    }
    static int add(int x, int y) { //클래스 메서드
        return x + y;
    }
}

public class 메서드_구분 {
    public static void main(String[] args) {
        // 클래스 메서드 호출
        // x는 20, y는 30 x+y= 50
        System.out.println(Method.add(20,30));
        // 인스턴스 생성
        Method myMethod = new Method();
        // 인스턴스 메서드 호출
        // 인스턴스 메서드의 a,b를 호출.
        // a+b = 30
        System.out.println(myMethod.add());
    }
}
