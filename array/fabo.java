package array;

public class fabo {
    public static void main(String[] args) {
        fib(10);
    }
    public static void fib(int n){
       int n1=0;
       int n2=1;
       System.out.print(n1+" "+n2+" ");
       for(int i=0; i<n-2; i++){
        int n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(n3+" ");
       } 
    }
}
