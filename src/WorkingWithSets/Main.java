package WorkingWithSets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    }

    //first repeated characters
    public static char findFirstRepeatedChar(String str){
        Set<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            //if the set contains this character then we return >> so return immediately
            if(set.contains(str.charAt(i))){
                return str.charAt(i);
            }
            set.add(str.charAt(i));
        }
        return Character.MIN_VALUE;
    }
}
