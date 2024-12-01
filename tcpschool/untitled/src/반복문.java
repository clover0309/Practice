public class 반복문 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) { // i가 5보다 커질때까지 반복.
            System.out.println("while 문이 " + (i + 1) + "번째 반복 실행중입니다.");
            i++; // 무한루프 방지.
        }
        //while문을 마치고, 증가된 i값이 밑에서 출력됨.
        System.out.println("while 문이 종료된 후 변수 i의 값은 "+i+"입니다.");
    }
}
