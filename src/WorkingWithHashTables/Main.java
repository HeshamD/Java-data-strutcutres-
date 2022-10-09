package WorkingWithHashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        String str = "a Green apple";

        System.out.println(charNonRepeated(str));

//        for(var item:map.entrySet()){
//            System.out.println(item.getKey());
//        }

    }

    static char charNonRepeated(String s){
        //the location
        //occurrence of an index

        // keys -> is the character
        // values -> is the occurrence

        // loop through the entire string
        // I am going to put the characters in the hashmap in their order that they received
        // loop from the top return the first occurence that == 1

        s = s.toLowerCase();

        Map<Character,Integer> map = new HashMap<>();
        int count = 1;
        for(var st:s.toCharArray()){
            if(!map.containsKey(st)){
                map.put(st,1);
            }else {
                if(map.containsKey(st)){
                    count = map.get(st);
                    count++;
                    map.put(st,count);
                }
            }
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }

        return 'f';

    }

}
