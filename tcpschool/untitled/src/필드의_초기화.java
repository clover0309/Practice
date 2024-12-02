import java.util.Arrays;

class cha {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    { // 인스턴스 초기화 블록.
        //cha클래스 영역에 currentSpeed를 0으로 초기화.
        this.currentSpeed = 0;
    }

    cha() {
    }

    cha(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return currentSpeed;
    }
}

    class InitBlock {
        //클래스 변수 선언.
        static int classVar;
        //인스턴스 변수 선언.
        int instanceVar;

        //클래스 초기화 블록을 이용해 초기화
        static {
            classVar = 10;
        }
    }

    class init {
    static int classVar = 10;
    int instanceVar = 10;
    static {classVar = 20;}
        {instanceVar = 20;}
        init() {instanceVar = 30;}
    }

    public class 필드의_초기화 {
        public static void main(String[] args) {
            //인스턴스 생성.
            cha mycha = new cha();
            //cha의 getSpeed를 호출.
            //출력값은 0
            System.out.println(mycha.getSpeed());

            //클래스 변수에 접근
            //클래스 초기화 블록에서 10을 받아와 10을 출력.
            System.out.println(InitBlock.classVar);

            //init 클래스 초기화 블록을 이용한 초기화
            // 20 출력.
            System.out.println(init.classVar);
            //인스턴스 초기화 블록을 이용한 초기화로 값을 받아옴.
            init myInit = new init();
            //init의 instanceVar를 출력.
            //30을 출력함.
            System.out.println(myInit.instanceVar);
        }
    }