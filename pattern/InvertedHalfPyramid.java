package pattern;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n=5;
        // outer loop
        for(int i=n; i>=1; i--){
            // inner loop
            for(int j=0; j<i; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
