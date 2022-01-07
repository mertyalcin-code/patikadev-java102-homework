package sumMultiplier;

import java.util.*;
import java.io.*;

class Main {
//new int[] {2, 5, 6, -6, 16, 2, 3, 6, 5, 3}
    public static String SumMultiplier(int[] arr) {
        int sum =0;
        for(int i:arr){
            sum+=i;
        }
        int max =-900000;
        for(int i = 0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if((arr[i]*arr[j]>max && i!=j)){
                    max=arr[i]*arr[j];
                }
            }
        }

        if(max>(sum*2)){
            return "true";
        }else return "false";

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        // System.out.print(SumMultiplier(s.nextLine()));
    }

}