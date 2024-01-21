package pattern.advance;

public class butterfly {
    public static void main(String[] args) {
        int  n=4;
        // outer loop
        for(int i=1; i<=n; i++){
            // upper first half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // upper space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // upper second half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower outer loop
         // outer loop
         for(int i=n; i>=1; i--){
            // Lower first half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Lower space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // Lower second half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
