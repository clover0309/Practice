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
        //위에서 생성된 car 생성자 인자값에, 아반떼, 2017, 흰색, 200이 넣어짐.
        Car myCar = new Car("아반떼", 2017, "흰색", 200);
        //출력값은 2017년식 아반떼 흰색
        System.out.println(myCar.getModel());

        //Car2에서 선언된  modelname, modelyear, color가 값에 들어가고
        Car2 myCar2 = new Car2();
        // 2016년식 쏘나타 파란색 출력.
        System.out.println(myCar2.getModel());

        //Car3의 Car3생성자에 지정된  마티즈, 2024, 흰색을 출력해준다.
        Car3 myCar3 = new Car3();
        System.out.println(myCar3.getModel());
    }
}
