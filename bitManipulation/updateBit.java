package bitManipulation;
import java.util.Scanner;

public class updateBit {
     public static void main(String[] args) {
     // update the third bit (postion=2) of number n. (n= 0101)
     // Bit Mask : 1<<i
     Scanner sc = new Scanner(System.in);
     int n=5;

     System.out.println("Enter the position which you want to change");
     int pos = sc.nextInt();

     System.out.println("Enter the bit value 0 or 1");
     int bit = sc.nextInt();

     int bitMask = 1<<pos;
     // for zero
     if (bit==0) {
          int newNumber = (~bitMask) & n;
          System.out.println(newNumber);
     }else if (bit == 1) { //for ones
          int newNumber = bitMask | n;
          System.out.println(newNumber);
     }else{
          System.out.println("invalid input");
     }

     }
}
