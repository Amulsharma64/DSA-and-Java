package pattern;

public class RotatedHalfPyramid {
    public static void main(String[] args) {
        int n=5;
        // outer loop
        for(int i=0; i<n; i++){
            // inner loop
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
            for(int j=0; j<=i; j++){
                System.out.print(" ");
            }
        }
    }
}
