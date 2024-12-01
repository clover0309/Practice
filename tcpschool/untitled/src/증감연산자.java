import java.util.Arrays;

public class 증감연산자 {
    public static void main(String[] args) {
        int num1 = 7, num2 = 7;
        int result1, result2;
        
        result1 = --num1 + 4;
        result2 = num2-- + 4;

        // 선계산. 6+4가 되어 10이 출력되고, num1값이 6이 된다.
        System.out.println("전위 감소 연산자에 의한 결과 : "
        + result1 + ", 변수의 값 : " + num1);
        // 후계산. 7+4가 되어 11이 출력됨, num2값이 6이 된다.
        System.out.println("후위 감소 연산자에 의한 결과 : "
                + result2 + ", 변수의 값 : " + num2);

        int x = 10;
        int y = x-- + 5 + --x;
        //10(초기값 그대로 사용) + 5 + (후연산되서 9, 그뒤에 선연산되서 8)
        //y에서 x가 후연산 되어 9가 되었고, 9에서 선연산 되어 8이 되었다.
        System.out.println("x : "+x+", y : " + y);
    }
}
