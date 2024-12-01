import java.util.Arrays;

public class 논리연산자 {
    public static void main(String[] args) {
        char ch1 = 'b', ch2 = 'B';
        boolean result1, result2;

        //하나라도 거짓이 나오면 거짓.
        result1 = (ch1 > 'a') && (ch1 < 'z');
        //하나라도 참이 나오면 참.
        result2 = (ch2 < 'A') || (ch2 < 'Z');

        //거짓
        System.out.println("&& 연산자 결과 : " + result1);
        //참
        System.out.println("|| 연산자 결과 : " + result2);
        //논리식 결과를 반대로 치환, 참이였으니 거짓으로 출력됨.
        System.out.println("! 연산자 결과 : " + !result2);
    }
}
