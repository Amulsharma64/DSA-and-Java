package outputInJava;
import java.util.Scanner;

public class DataType {
    // Primitive data types are the most basic data types available within the Java language.
    byte b = 127;
    short s = 32767;
    int i = 2147483647;
    long l = 9223372036854775807L;
    float f = 3.4028235E38F;
    double d = 1.7976931348623157E308;
    boolean bool = true;
    char c = 'a';
    // String, Array, Object, Class, Interface are not a primitive data type, but it is a built-in data type.
    String str = "Hello World!";
    int[] arr = {1, 2, 3, 4, 5};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name: ");
        String inputStr = sc.nextLine();
        System.out.println("Enter a Age: ");
        int input = sc.nextInt();

        if(input >= 18) {
            System.out.println(inputStr + " is an Adult.");
        } else {
            System.out.println(inputStr + " is a Child.");
        }
    }
}
