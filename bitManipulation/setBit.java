package bitMenupulation;

public class setBit {
    public static void main(String[] args) {
         // Set Bit
        // Set the third bit (postion=2) of number n. (n= 0101)
        // Bit Mask : 1<<i
        // operation: OR   
        int n=5;
        int pos=1;
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);

    }
}
