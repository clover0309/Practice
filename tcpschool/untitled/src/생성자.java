class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}
class Car2 {
    private String modelName = "쏘나타";
    private int modelYear = 2016;
    private String color = "파란색";

    public String getModel() {
        return this.modelYear + "년식 " + this.color + " " + this.modelName;
    }
}

class Car3 {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    Car3() {
        this.modelName = "마티즈";
        this.modelYear = 2024;
        this.color = "흰색";
        this.maxSpeed = 200;
        this.currentSpeed = 0;
    }
    Car3(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}

public class 생성자 {
    public static void main(String[] args) {
        Car myCar = new Car("아반떼", 2017, "흰색", 200);
        System.out.println(myCar.getModel());

        Car2 myCar2 = new Car2();
        System.out.println(myCar2.getModel());

        Car3 myCar3 = new Car3();
        System.out.println(myCar3.getModel());
    }
}
