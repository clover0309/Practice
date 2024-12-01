import java.util.Arrays;

public class 기타제어문 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //i가 5로 나눴을때, 0이되거나, i가 7로 나눴을때
            //값이 0이 되면 해당되는 숫자만 출력함.
            //즉 5의배수 7의배수만 출력.
            if (i % 5 == 0 || i % 7 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
        int num = 1, sum = 0;
        while(true) {
            //sum에 1~100까지의 합을 더함.
            sum += num;
            //만약 num이 100이되면 수행중단.
            if(num==100) {
                break;
            //아니라면 num을 후연산하여 1증가.
            } else {
                num++;
            }
        }
        System.out.println(sum);
        //반복문에 이름을 allLoop로 지정.
        allLoop :
        //i가 2로 선언, i가 10보다 클때 까지, i는 후연산.
        for (int i = 2; i < 10; i++) {
            //j가 1로 선언, j가 10보다 클때 까지, i는 후연산.
            for (int j = 1; j<10; j++) {
                //만약 i가 5인경우.
                if (i==5) {
                    //allLoop를 중단.
                    break allLoop;
                }
                //반복문이 한번 수행되면 i*j=i*j가 출력.
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
