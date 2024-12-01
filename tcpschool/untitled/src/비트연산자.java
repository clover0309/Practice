import java.util.Arrays;

public class 비트연산자 {
    public static void main(String[] args) {
     int num1 = 8, num2 = -8;
        //00000000 00000000 00000000 00001000을
        //11111111 11111111 11111111 11110111로 반전.
        System.out.println("~ 연산자에 의한 결과 : "+ ~num1);

        //00001000을 00100000로 변경 (왼쪽으로 1이 2칸 옮겨감.)
        System.out.println("<< 연산자에 의한 결과 : "+ (num1 << 2));

        //-8을 오른쪽으로 2비트 이동.
        //00001000이
        //00* 00100000이 되는데 *표시가 되어있는 부분은 사라지고,
        System.out.println(">> 연산자에 의한 결과 : "+ (num2 >> 2));

        //오른쪽으로 3칸 시프트된다.
        //00001000이니 0000000
        System.out.println(">>> 연산자에 의한 결과 : "+ (num1 >>> 2));
        System.out.println(">>> 연산자에 의한 결과 : "+ (num2 >>> 2));

    }
}
