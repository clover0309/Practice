class Test {
    //Test클래스에서 선언된 display에 int를 중복적으로 사용하려면
    //int값을 2개를 주거나, 아예 안써야한다.
    //이유는 자바컴파일러가 int가 하나씩만 선언되어있다면, 동일한 값으로 생각하기 때문에
    //오류를 표기하고, 오류를 발생시킨다고 한다. (단일로는 생성자에서 동일 타입(int,String,double ..)
    // 선언이 불가능함.

    //myfunc.display에서 10을 받아와 10 출력
    static void display(int num1) {
        System.out.println(num1);
    }
    //myfunc.display에서 10,20을 받아와 200 출력.
    //myfunc.display에서 10,a를 받아오는데, a는 아스키코드에서 97을 표기함으로
    //10*97을 계산하게 되어 970을 출력하게됨.
    static void display(int num1, int num2) {
        System.out.println(num1*num2);
    }

    //myfunc.display에서 10, 3.14를 받아와, 13.14를 출력.
    static void display(int num1, double num2) {
        System.out.println(num1 + num2);
    }
}

public class 오버로딩 {
    public static void main(String[] args) {
        Test myfunc = new Test();

        //num1 값에 10 추가
        myfunc.display(10);
        myfunc.display(10,20);
        myfunc.display(10, 3.14);
        myfunc.display(10, 'a');
    }
}
