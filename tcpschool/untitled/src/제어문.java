import java.util.Arrays;
import java.util.Scanner;

public class 제어문 {
    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        ch = scan.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("해당 문자는 영문 대문자입니다.");
        } else {
            System.out.println("해당 문자는 영문자가 아닙니다.");
        }
        switch (ch) {
            case 'a' :
                System.out.println("해당 문자는 A입니다.");
                break;
            case 'e' :
                System.out.println("해당 문자는 E입니다.");
                break;
            case 'o' :
                System.out.println("해당 문자는 O입니다.");
                break;
            case 'u' :
                System.out.println("해당 문자는 U입니다.");
                break;
            default :
                System.out.println("해당 문자는 모음이 아닙니다.");
                break;
        }
        switch (ch) {

            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':

                System.out.println("해당 문자는 소문자 모음입니다.");

                break;

            case 'A':

            case 'E':

            case 'I':

            case 'O':

            case 'U':

                System.out.println("해당 문자는 대문자 모음입니다.");

                break;

            default:

                System.out.println("해당 문자는 모음이 아닙니다.");

                break;

        }
    }
}
