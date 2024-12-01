public class 두_와일 {
    public static void main(String[] args) {
        int i = 1, j = 1;

        while (i < 1) { //while문을 한번 반복
            System.out.println("while 문이" + i + "번째 반복 실행중입니다");
            i++; // 무한루프 방지
        }
        //i값은 1
        System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
        do { // do/while문이 1번 반복.
            System.out.println("do / while 문이 " + i + "번째 반복 실행중입니다.");
            j++; // 무한루프 방지
        } while (j < 1); // j값이 후연산 되었으므로 2
        //j의 값은 2.
        System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
    }
}

