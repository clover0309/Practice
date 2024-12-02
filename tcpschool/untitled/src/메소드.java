class Car123 {
    private int currentSpeed;
    private int accelerationTime;

    public void accelerate(int speed, int second) {
        System.out.println(second + "초간 속도를 시속"
                + speed + "(으)로 가속함!");
    }
}
    public class 메소드 {
        public static void main(String[] args) {
            Car123 mycar = new Car123();
            mycar.accelerate(60, 3);
        }
    }
