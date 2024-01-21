package pattern;

public class BinaryTriangle {
    public static void main(String[] args) {
        int n=5;
        // outer loop
        for(int i=0; i<n; i++){
            // inner loop
            for(int j=0; j<=i; j++){
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
