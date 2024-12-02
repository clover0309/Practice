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
        Car1234 tcpcar = new Car1234();
        System.out.println(tcpcar.getModel());
    }
}