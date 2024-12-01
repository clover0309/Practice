import java.util.Arrays;

public class 타입변환 {
    public static void main(String[] args) {
        //묵시적 타입 변환.
        double num1 = 10;
        // int num2 = 3.14;
        double num3 = 7.0f + 3.14;

        //자동적으로 dobule형으로 변환되어 10.0 출력.
        System.out.println(num1);
        //자동적으로 double형으로 변환되어
        //7.0f가 dobule으로 바뀌고, 7.0+3.14를 더하여
        //10.14가 출력됨.
        System.out.println(num3);

        byte a1 = 100; //byte는 100까지 표기가능.
        //  byte a2 = 200; 타입이 매칭되지않아서 오류발생.
        //  int a3 = 9876543210; 최대범위에 벗어나서 오류발생.
        //  long a4 = 9876543210; 최대범위에 벗어나서 오류발생.
        //  float a5 = 3.14; 타입이 매칭안되서 오류발생.
        //  int a6 = 9876543210l; 타입이 매칭되지않아서 오류발생.
        //                        int형 표기 범위를 벗어났기 때문.
        long a7 = 9876543210L; //

        //명시적 타입 변환

        int b1 = 1, b2 = 4;
        double result1 = b1 / b2;
        //다른 타입형태로 변환을 원할시 (타입형태) b1/b2;를 사용해야함.
        double result2 = (double) b1 / b2;

        //그냥 정수형 int로 표기되기 때문에 0.0을 표기함.
        System.out.println(result1);
        //dobule형으로 계산식을 변경했기 때문에 0.25를 표기함.
        System.out.println(result2);
    }
}
