package pattern;

public class rectangle {
    public static void main(String[] args) {
        int col = 5;
        int row = 3;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
