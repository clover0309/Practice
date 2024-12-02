class Math {
    static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n-1);
        // 1, 2+1=3, 3+3=6, 6+4=10, 10+5=15, 6+15=21, 21+7=28, 28+8=36, 36+9=45, 45+10=55
        // 각 호출은 스택 메모리에 쌓이게 된다.
        // 따라서 값은 1부터 10까지의 합인 55가 출력된다.
    }
}

public class 재귀호출 {
    public static void main(String[] args) {
        System.out.println(Math.recursiveSum(10));
    }
}
