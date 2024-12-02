class Math {
    static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n-1);
    }
}

public class 재귀호출 {
    public static void main(String[] args) {
        System.out.println(Math.recursiveSum(10));
    }
}
