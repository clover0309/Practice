import java.util.Arrays;

public class 비교연산자 {
    public static void main(String[] args) {
        char ch1 = 'a', ch2 = 'A';
        //아스키 코드에서 a는 97, A는 65 임으로 거짓.
        System.out.println("== 연산자 결과 "+(ch1 == ch2));
        // 97 > 65 임으로 참.
        System.out.println("> 연산자 결과 "+(ch1 > ch2));
    }
}
