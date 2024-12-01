import java.util.Arrays;

public class 기본타입 {
    public static void main(String[] args) {
        /*byte형태는 -128~127까지 밖에 사용못함. */

        byte num1 = 127;
        byte num2 = -128;

        num1++;
        num2--;

        System.out.println(num1); // 언더플로우가 발생해 128이 아닌 -128출력
        System.out.println(num2); // 언더플로우가 발생해 -129가 아닌 127출력
    }
}
