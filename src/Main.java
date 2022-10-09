import WorkingWithArray.ArrayClass;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayClass numbers = new ArrayClass(3);
        int[] n = new int[]{3,4,10,50,20};
        numbers.insert(4);
        numbers.insert(24);
        numbers.insert(10);
        numbers.insert(20);
        //numbers.arrayMax();
        //numbers.reversedArray();
        //System.out.println(Arrays.toString(numbers.intersect(n).toArray()));
        //numbers.print();
        //numbers.intersect(n);
        numbers.insertAt(4,0);

    }

    static Character SearchingChallenge(String str) {
        // code goes here

        // so i am going to have a hashmap that will map the elements as key and values as thier count of presences
        // afer i finish looping i will return the key that has the value 1 which it means. this element only appears once
        // but firs i need to convert the string to array of chars

        char[] charStr = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();

        int count = 1;

        for (char c : charStr) {
            if (map.containsKey(c)) {
                map.put(c, count);
                count++;
            }
            map.put(c, count);
        }

        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Comparator.naturalOrder());

        return null;
    }
    static StringBuffer encrypt(String text, int s) {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
    static int divisor_sum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }

}