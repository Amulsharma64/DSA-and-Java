package recursion;

public class findfib {
    public static int fib(int a, int b, int n){
        if(n==0){
            return 0;
        }
        int c=a+b;
        System.out.print(c+" ");
        return fib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0,b=1,n=7;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fib(a,b,n-2);
    }
}
