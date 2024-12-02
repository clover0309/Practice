import java.util.Arrays;

public class 일차원배열 {
    public static void main(String[] args) {
        int sum = 0;
        //정수형 grade를 1차원 배열을 선언, 길이를 3으로 초기화.
        int[] grade1 = new int[3];
        int[] grade2 = new int[3];

        //배열은 0번부터 시작. 0 1 2에 85,65,90을 추가.
        grade1[0] = 85;
        grade1[1] = 65;
        grade1[2] = 90;

        grade2[0] = 85;

        //반복문 시작, i가 grade1배열의 길이보다 크면 정지, i값은 후연산됨.
        for (int i = 0; i < grade1.length; i++) {
            //grade1 배열에 있는 85 65 90 이 출력됨
            System.out.print(grade1[i] + "\t \n");
        }
        //반복문 시작, i가 grade2배열의 길이보다 크면 정지, i값은 후연산됨.
        for (int i = 0; i < grade2.length; i++) {
            // grade2 배열에 있는 85가 나오고
            // 그뒤에 배열안에 값이 존재 하지 않아서, int의 기본 배열값은 0이 있기 때문에
            // 1,2번째 칸에는 0이 나옴.
            System.out.println(grade2[i] + "");
        }
        for (int i = 0; i< grade1.length; i++) {
            sum += grade1[i];
        }
        System.out.println("과목 점수의 합 : " + sum);
        System.out.println("과목들의 평균 점수 : " + (sum/grade1.length));
    }
}
