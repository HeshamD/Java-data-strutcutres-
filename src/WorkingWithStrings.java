import java.util.*;
import java.util.LinkedList;

public class WorkingWithStrings {
    public static void main(String[] args) {


        String s ="foo";
        String t="bar";
        System.out.println(isomorphicStrings(s,t));
    }


    static String reverseWords(String s) {

        // s is a string
        // loop through the string and add from the end to the array
        //

        char[] reversed = s.toCharArray();

        return null;

    }

    static void reverseString(char[] s) {

        // by stack // using extra space
        // since stack is first in last out
        // so we going to pop first element from the stack and save it in the first position element s

//        Stack<Character> stack = new Stack<>();
//
//        for(var i: s){
//            stack.push(i);
//        }
//
//        int i=0;
//        while (!stack.empty()){
//            s[i] = stack.pop();
//            i++;
//        }

        // swapping values
        // two pointers

        int l=0;
        int r=s.length-1;
        char temp=' ';

        while (l<r){
            temp = s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }


    }

    static int pivotIndex(int[] nums) {

        //pivit index >> starting from the left most side
        //  >> is the sum of all left side of the pivit index ?= to the sum of all right side           //   of the pivit index

        // so we need to
        //   calculate the left elements of the assumed pivet
        //               calculate the right elements of the assumed pivet


        int total =0;


        for(int i : nums){ // O(n)
            total+=i;
        }

        int leftSumElements =0;
        int rightSumElements =0;
        for(int i=0;i<nums.length;i++){

            rightSumElements  = total-nums[i]-leftSumElements;
            if(leftSumElements == rightSumElements){
                return i;
            }
            leftSumElements += nums[i];
        }

        return -1;

    }

    static boolean isomorphicStrings(String s,String t){
        //two hashMap

        Map<Character, Character> mapST = new HashMap<>();

        Map<Character, Character> mapTS = new HashMap<>();

        char c1=' ';
        char c2=' ';

        for(int i=0; i<s.length();i++){
            //get the character at both of the string from s and t
            c1 = s.charAt(i);
            c2 = t.charAt(i);

            //we need to check if any has different mapping

            if( (mapST.containsKey(c1) && mapST.get(c1) != c2) ||
                    (mapTS.containsKey(c2) && mapTS.get(c2) != c1)){
                return false;

            }

            mapST.put(c1,c2);
            mapTS.put(c2,c1);


        }

        return true;

    }

    static boolean isSubsequence(String s,String t){
        // two strings
        // first string letters needs to be existed in the second string letters
        // going to save the first string in a queue
        // loop through the string t
        // if the char exists in the stack dequeue it
        // if the queue is empty return true
        // if not return false

        // two pointers

        int i=0,j =0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }
        }

        if(i==s.length()){
            return true;
        }
        return false;

    }
}
