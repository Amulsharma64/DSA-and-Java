package pattern;

public class FloydTriangle {
    public static void main(String[] args) {
        int n=7;
        int count=1;
        // outer loop
        for(int i=0; i<n; i++){
            
            // inner loop
            for(int j=0; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
