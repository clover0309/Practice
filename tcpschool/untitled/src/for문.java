import java.util.Arrays;

public class for문 {
    public static void main(String[] args) {
        for (int i=0; i < 3; i++) {
            System.out.println("for문이 " + (i+1) + "번쨰 반복 실행중입니다.");
        }
        // System.out.println(i); 위의 for문에서 i가 소멸되었으므로, i값은 출력불가.
        for (int i=0; i < 3; i++) {
            System.out.println("for문이 " + (i+1) + "번째 반복 실행중입니다.");
        }
    }
}
