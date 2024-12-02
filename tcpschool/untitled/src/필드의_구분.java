import java.util.Arrays;

class Field {
    //클래스 변수는 classVar이 되고,
    //클래스 변수는 클래스 영역에 선언되며, static 키워드 사용
    //모든 인스턴스가 공통된 저장공간 공유(?)
    //인스턴스 생성 없이 '클래스이름.변수명'으로 사용 가능.
    static int classVar = 10;

    //인스턴스 변수는 instanceVar이 되고
    //클래스 영역에서 인스턴스 변수가 선언되고
    //인스턴스가 생성될 때 만들어짐
    //각 인스턴스 마다 독립적인 저장공간을 가지고
    // 인스턴스 생성 후에만 사용이 가능.
    int instanceVar = 20;
    }

public class 필드의_구분 {
    public static void main(String[] args) {
        //여기서 선언된 var는 지역변수.
        //해당 영역에서만 사용되고, 소멸됨.
        int var = 30;

        //지역변수 var의 값 30을 출력하고.
        System.out.println(var + "\n");

        //인스턴스를 생성하는 구간.
        Field myField1 = new Field();
        Field myField2 = new Field();

        //Field의 classVar를 출력. 10
        System.out.println(Field.classVar);
        //Field로 선언된 myField1의 classVar를 출력. 10
        System.out.println(myField1.classVar);
        //Field로 선언된 myField2의 classVar를 출력. 10
        System.out.println(myField2.classVar + "\n");

        //클래스 변수의 값을 100으로 변경함
        myField1.classVar = 100;

        //클래스 변수를 참조함
        //myField1이 Field클래스의 인스턴스를 참조하고있으니, Field의 classVar가 100이 되고
        System.out.println(Field.classVar);
        //myField1의 classVar를 출력. 100
        System.out.println(myField1.classVar);
        //myField2의 classVar를 출력. 100
        System.out.println(myField2.classVar + "\n");

        //인스턴스 변수를 참조함.
        //myField1이 Field를 참조하고 있으므로, Field의 instanceVar를 참조해 20을 출력
        System.out.println(myField1.instanceVar);
        //마찬가지로 Field를 참조하고 있으므로, 20을 출력.
        System.out.println(myField2.instanceVar);

        //인스턴스 변수의 값을 200으로 변경함.
        myField1.instanceVar = 200;

        //인스턴스 변수를 참조함.
        //Field의 instanceVar 값이 200으로 변경 되었으므로, 200을 출력.
        System.out.println(myField1.instanceVar);
        //마찬가지로 Field를 참조하고 있으므로, 200을 출력.
        System.out.println(myField2.instanceVar);
    }
}
