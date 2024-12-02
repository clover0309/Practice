public class 다차원배열 {
    public static void main(String[] args) {
        //2차원 배열 arr생성, 2차원배열 2칸, 1차원 배열을 3칸으로 초기화
        // 0,0 0,1 0,2
        // 1,0 1,1 1,2 로 초기화된다. (2차원이 세로, 1차원이 가로.)
        int[][] arr = new int[2][3];

        //값을 더해주기 위한 k를 10으로 선언.
        int k = 10;
        //반복문 시작, i가 arr의 길이보다 커지면 종료, i는 후연산.
        for (int i = 0; i < arr.length; i++) {
            //2중반복문 시작, j가 arr[i]번째(1차원배열) 길이보다 커지면 종료, j는 후연산.
            for (int j = 0; j < arr[i].length; j++)
                //k값을 이용한 초기화.
                arr[i][j] = k;
                //k의 값이 10씩 증가함.
                k += 10;
            }
        //반복문 시작, i가 arr의 길이보다 커지면 종료, i는 후연산.
        for (int i = 0; i < arr.length; i++) {
            //2중반복문 시작, j가 arr[i]번째(1차원배열) 길이보다 커지면 종료, j는 후연산
            for (int j = 0; j < arr[i].length; j++) {
                //arr의 1차원배열 i번째와 2차원배열 j번째를 출력함.
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }
        }
    }

