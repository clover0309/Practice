import java.util.Arrays;

public class 삼항연산자 {
    public static void main(String[] args) {
        int num1 = 5, num2 = 7;
        int result;

        //물음표 앞에 조건식에 따라 결괏값이 참이면 num1 반환, 거짓이이면 num2가 반환
        result = (num1 - num2 > 0) ? num1 : num2;
        System.out.println("두 정수 중 더 큰 수는 " + result +"입니다.");




    }
}
