package bitManipulation;

public class clearBit {
    public static void main(String[] args) {
        // Clear bit
        // Get the third bit (postion=2) of number n. (n= 0101)
        // Bit Mask : 1<<i
        // operation: AND with NOT
        
        int n=5;
        int pos=2;
        int bitMask = 1<<pos;
        int newNumber = (~bitMask) & n;
        System.out.println(newNumber);
    }
}
