package array;

/**
 * sumOfOddNumbers
 */
public class sumOfOddNumbers {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(sumOfArray(array));
    }

    public static int sumOfArray(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if((arr[i]%2)!=0){
                sum+=arr[i];
            }
        }
        return sum;
    }
    
}