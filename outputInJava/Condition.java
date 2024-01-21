package outputInJava;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
       int b=545;
    Scanner sc = new Scanner(System.in);
       switch(b){
           case 10:
               System.out.println("b is 10");
               break;
           case 20:
               System.out.println("b is 20");
               break;
           default:
               System.out.println("b is not 10 or 20");
       }
    
       boolean isTrue = false;

       System.out.println("Do yuo want to continue?");
       isTrue = sc.nextBoolean();
    do{
        System.out.println("Pls continue😁");
        isTrue = sc.nextBoolean();
    }while(isTrue != true);   
    }       

}
