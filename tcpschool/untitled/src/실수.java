import java.util.Arrays;

public class 실수 {
    public static void main(String[] args) {
        double num = 0.1;
        for(int i=0; i < 1000; i++) {
            num += 0.1;
        }
        /*컴퓨터에서 실수를 표현할때는 근사치를 표현해서
        100.0999999999859 이런식으로 표시된다. 헷갈리지 않게 유의
         */
        System.out.println(num);

        float num2 = 1.23456789f;
        double num3 = 1.23456789;
        //float형은 소숫점 6자리까지는 표현이 되지만 그이후에는 정확히 표현못함.
        System.out.println(num2);
        //double형은 소숫점 15자리까지 오차없이 표현가능함.
        System.out.println(num3);
    }
}
