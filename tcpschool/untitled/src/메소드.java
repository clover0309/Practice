class Car123 {
    private int currentSpeed;
    private int accelerationTime;

    public void accelerate(int speed, int second) {
        System.out.println(second + "초간 속도를 시속"
                + speed + "(으)로 가속함!");
        //3초간 속도를 시속 60(으)로 가속함!을 출력
    }
}
    public class 메소드 {
        public static void main(String[] args) {
            Car123 mycar = new Car123();
            // Car123에 accelerate 메서드에 인자값으로 받는 int spped에 60, int second에 3을 넣는다.
            mycar.accelerate(60, 3);
        }
    }
