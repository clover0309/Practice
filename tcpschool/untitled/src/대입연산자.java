import java.util.Arrays;

public class 대입연산자 {
    public static void main(String[] args) {
        int num1 = 7, num2 = 7 , num3 = 7;
        num1 = num1 - 3;
        num2 -= 3;
        num3 =- 3;

        System.out.println("- : " + num1); // 7-3 = 4
        System.out.println("-= : " + num2);// 7-3 = 4
        System.out.println("=- : " + num3);// num3 = -3
        //12번줄은 단순히 num3에 -3을 대입한다.
    }
}
