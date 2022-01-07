package alphabet;

import java.util.*;
import java.io.*;

class Main {

    public static String AlphabetSearching(String str) {
        str=str.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<str.length();i++){
            set.add(str.charAt(i));
        }
        // 97-122
        List<Character> alphabet= new ArrayList<>();
        for(int i= 97; i<123;i++){
            alphabet.add((char) i);
        }
        for(Character c:set){
            if(alphabet.contains(c)){
                alphabet.remove(c);
            }
        }
        return alphabet.size()==0 ? "true" : "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(AlphabetSearching(s.nextLine()));
    }

}