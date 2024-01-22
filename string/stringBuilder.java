package string;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Amul");
        // set insert delete append 
        sb.setCharAt(0,'B');

        sb.insert(0,"A");

        sb.delete(1, 2);

        sb.append(" Sharma");
        System.out.println(sb);
        
        //find reverString
        for(int i=0; i<sb.length()/2; i++){
            
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            
            sb.setCharAt(front, backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}
    