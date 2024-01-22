package string;

public class string {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println(s3.compareTo(s2));
        // memory stack and heap memory

        // ispelindrome
        ispelindrome("ana");
    }
    public static void ispelindrome(String str){
        String revString="" ;
        for(int i=0; i<str.length(); i++){
            revString=str.charAt(i)+revString;
        }
        if (str.compareTo(revString)==0) {
            System.out.println(str+ " is pelindrome");
        }else{
            System.out.println(str+ " is not pelindrome");
        }
    }
}
