import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[] args) {

        //declaring a map
        //  Key      Value  // keys are unique
        Map<Integer,Person> map = new HashMap<>();

        //Insert into the map
        map.put(1,new Person("Alex"));
        map.put(2,new Person("Alexa"));
        map.put(3,new Person("Mariem"));

//        System.out.println(map); // to print the keys and the values in an array format
//        System.out.println(map.size());// to get the size
//        System.out.println(map.get(1)); // to get a specific key
//        System.out.println(map.containsKey(4)); //to check if it contains this key
//        System.out.println(map.entrySet()); // to get all the entries
//        System.out.println(map.keySet()); // to get all the keys
//        System.out.println(map.remove(3)); // to remove specific key

        // loop though
//        map.forEach(((key, person) -> {
//            System.out.println(key + "- " + person);
//        }));


        int[] nums = new int[]{1,2,3,1};

            System.out.println(containsDuplicate(nums));


    }


    //217
    static boolean containsDuplicate(int[] nums) {

        // return true if the array has duplicates
        // return false if not

        // loop through the array
        // create a hashmap
        // store each index value as a key, and it's existence as value for that key
        // if this key exists in the array increment the value and return true
        // at the end return false

        Map<Integer,Integer> map = new HashMap<>();
        int count =1;

        for(int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],count);
                count++;
                return true;
            }
            map.put(nums[i],count);

        }

        return false;


    }

    record Person(String name){

    }

}
