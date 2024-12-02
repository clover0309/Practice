class Car1234 {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car1234(String modelName, int modelYear, String color, int maxSpeed) {
     this.modelName = modelName;
     this.modelYear = modelYear;
     this.color = color;
     this.maxSpeed = maxSpeed;
     this.currentSpeed = 0;
    }
    Car1234() {
        this("쏘나타", 2012, "검정색", 160);
    }
    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}

public class 디스 {
    public static void main(String[] args) {
        //Car1234의 타입을 갖는 tcpcar를 Car1234로 초기화
        Car1234 tcpcar = new Car1234();
        //Car1234에 있는 인자값, "쏘나타", 2012, "검정색", 160을 인자값으로 받는다.
        //여기서 maxSpeed는 선언이 되어있지만, getModel에서 받는것이 없으므로, 160이 사용되지 않아도
        //메모리에서는 객체가 소멸될 때 까지 160이 그대로 남아있다.
        System.out.println(tcpcar.getModel());
    }
}