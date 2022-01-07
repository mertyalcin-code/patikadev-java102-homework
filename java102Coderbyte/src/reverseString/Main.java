package reverseString;
import java.util.*;
class Main {
//1. For input "1 1 1 1 1 1" the output was incorrect. The correct output is 1 1 1 1 1 1
//
//2. For input "23 23 23 566 76" the output was incorrect. The correct output is 76 566 23 23 23

    public static String NumberReverse(String str) {
        StringBuilder result= new StringBuilder();
        int lastIndex=str.length()-1;
        for(int i=str.length()-1;i>=0;i--){
            if(i>0 && str.charAt(i)==' '){
                result.append(str, i+1, lastIndex + 1).append(" ");
                lastIndex=i-1;
            }

            else if(i==0){
                result.append(str.substring(0, lastIndex + 1));

            }
        }

        return result.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(NumberReverse(s.nextLine()));
    }

}