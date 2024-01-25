package bitManipulation;

public class bitOperation {
    public static void main(String[] args) {
        
        // Get Bit
        // Get the third bit (postion=2) of number n. (n= 0101)
        // Bit Mask : 1<<i
        // operation: AND
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
       if(( bitMask & n)==0)
        System.out.println("Bit was zero");
        else{
            System.out.println("bit was one");
        }
         
    }
}
