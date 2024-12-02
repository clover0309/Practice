import java.util.Arrays;

public class 배열의활용 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int newLen = 10;

        int[] arr2 = new int[newLen];
        //arr1의 0번째부터, arr2의 0번째부터 안에, arr1.length만큼 집어넣는다.
        // 1 2 3 4 5 0 0 0 0 0 를 출력.
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        //arr2의 길이보다 i가 커질때 반복문 종료.
        //arr2는 newLen에 선언된 10만큼 10칸이 생성됨.
        for (int i = 0; i < arr2.length; i++) {
            //위에서 arr2가 복사 되었고, 10칸으로 늘어났기 때문에
            //똑같이 1 2 3 4 5 0 0 0 0 0 가 출력됨.
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        //arr3는 arr1을 복사하고, 길이를 10칸으로 만드는데
        //인텔리제이 기준으로는 1 2 3 4 5가 출력이되고
        //이클립스 기준으로는 1 2 3 4 5 0 0 0 0 0이 출력이된다.
        //인텔리제이는 의미있는 값만 출력하는 경향이 있어서 그렇다고합니다.
        int[] arr3 = Arrays.copyOf(arr1, 10);

            for(int i = 0 ; i < arr3.length; i++) {
                System.out.print(arr3[i] + " ");
            }
        System.out.println();

        int[] arr4 = (int[])arr1.clone();
            for(int i = 0; i < arr4.length; i++) {
                System.out.print(arr4[i] + " ");
            }
        System.out.println();

            // arr5를 1차원배열로 초기화를 하고, newLen의 값을 받아서
            // 총 10칸의 arr5의 1차원배열을 생성한다.
            int[] arr5 = new int[newLen];
            //반복문 시작, i값은 0, arr1의 길이보다 i값이 커지면 중단, i값은 후연산.
            for(int i = 0 ; i < arr1.length; i++) {
                //arr5은 arr1의 길이만큼(5) 값이 추가됨.
                arr5[i] = arr1[i];
            }
            //반복문시작, i값은 0, arr5의 길이보다 i값이 커지면 중단, i값은 후연산
            for(int i = 0; i < arr5.length; i++) {
                //arr5을 10칸까지 출력.
                //출력 결과값 : 1 2 3 4 5 0 0 0 0 0
                System.out.print(arr5[i] + " ");
            }
    }
}
