package recursion;

public class sumOfnNumber {
    public static int findSum(int n, int sum){
        if (n==0) {
            return sum;
        }
        sum +=n;
        return findSum(n-1,sum);
    }
    public static void main(String[] args) {
        int sum = findSum(5,0);
        System.out.println(sum);
    }
}
