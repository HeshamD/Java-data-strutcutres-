import java.lang.reflect.Array;
import java.util.*;

public class arrays {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4};

        System.out.println(productExceptSelf(nums));
    }

    static int maxProfit(int[] prices) {

        int leftPointerBuyDay=0;
        int rightPointerSellDay=0;

        int maxProfit = 0;
        int profit=0;

        while(rightPointerSellDay < prices.length){
            //profitable Transaction
            if(prices[leftPointerBuyDay] < prices[rightPointerSellDay]){
                profit = prices[rightPointerSellDay] - prices[leftPointerBuyDay];
                maxProfit = Math.max(maxProfit,profit);
            }
            else {
                leftPointerBuyDay = rightPointerSellDay;
            }

            rightPointerSellDay++;
        }

        return maxProfit;
    }

//    //getting a string, and we're looking if the first index of name exist in the first sentence in lyrics
//    static boolean is_Valid(String lyrics,String name){
//
//        //do the validation that the lyrics and names only small capitalized
//        //first I want to separate each word in an array
//        //look for the first index letter in name if it exists in each sentence in order
//        //if the sentence separation array length == to the name.length increment the name index
//        // if name_index == name.length
//        //return true
//        //otherwise return false
//
//        String lyricsStandarized = lyrics.toLowerCase();
//        String nameStrandarlized = name.toLowerCase();
//
//        var n= lyricsStandarized.split(" ");
//
//        int name_index = 1;
//
//        for(String nn :n){
//
//        }
//    }


    static int[] twoSum(int[] nums,int target){

        //using a hashmap
        //  Creating a hashmap
        //  I am going to loop through the array
        //  while looping
        //      we want to look for the difference between the element and target in the hashmap
        //      mapping the value to the index


        Map<Integer,Integer> prevMap = new HashMap<>(); // mapping the values {key} of the array to the indexes of the array

        int difference = 0;

        //iterate through the array
        for(int i=0;i<nums.length;i++){
            difference = target - nums[i];
            if(prevMap.containsKey(difference)){
                return new int[] {prevMap.get(difference),i};
            }
            //update the hashmap
            prevMap.put(nums[i],i);
        }

        return new int[]{};
    }

    static int findPivotIndex(int[] nums){
        // so the pivotindex happens if the sum of all the elements in the left == to the sum of the right elements
        // if none return 0

        //so we will have two variables >> one to have all the sum of the left elements,
                            // another to have all the sum of the right elements
        // loop
            // we will get the total of all the elements,
            // so we're going to sum all the elements on the right side of the current element that we currently at
            // then subtract >> currently elements - the total right elements

        int total =0;
        for(int i : nums){
            total+=i;
        }

        int leftSum = 0;
        int rightSum = 0;
        for(int i=0;i<nums.length;i++){
            rightSum = total - nums[i] -leftSum;
            if (leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        /*
        1. loop through each string in the input
        2. sort the string
        3. insert into the hashmap
        4. iterate through the hashmap and put each value in the result array
        5. return the result array
        * */

        List<List<String>> result = new ArrayList<>();

        HashMap<String,List<String>> map=new HashMap<>();

        //loop through each string

        for(String str:strs){
            //sort
            char[] tempArray = str.toCharArray();
            Arrays.sort(tempArray); // sorting the string
            String sortedString = new String(tempArray); // convert the array of sorted character to string

            //insert to hashmap
            if(map.containsKey(sortedString)){
                map.get(sortedString).add(str);
            }else {
                List<String> tempList = new ArrayList<>();
                result.add(tempList);
                tempList.add(str);
                map.put(sortedString,tempList);
            }

        }

//        //iterate through the hashmap
//        for(Map.Entry<String,List<String>> entry:map.entrySet()){
//            result.add(entry.getValue());
//        }

        return result;


    }

    static int[] twoSum_ (int[]nums,int target){
        //BruteForce Solution
//
//        for(int i=0; i<nums.length;i++){
//            for(int j=i+1; j<nums.length;j++){
//                if(nums[i]+nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//
//        return null;

        //by hashmap

        // mapping each value to the index of each value

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length ;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),diff};
            }
            map.put(diff,i);
        }

        return null;
    }

//    static List<List<Integer>> threeSum(int[] nums){
//        List<List<Integer>> result = new ArrayList<>();
//
//        //sort the input array
//
//        Arrays.sort(nums);
//
//        for(int i=0;i<nums.length;i++){
//            int a=0;
//            if(i>0 && nums[i] == nums[i+1]){
//                //meaning it's not the first value in the input array
//                // this means this is the same value as before so we don't need to have the same value
//                continue; //continue to the next iteration of the loop
//            }
//            //next we going to use two pointer solution
//            int l= i+1;
//            int r = nums.length-1;
//            while (l<r){
//                //compute the sums
//                var threeSum = nums[i] + nums[l]+nums[r];
//                if (threeSum>0){
//                    r -=1;
//                } else if (threeSum <0) {
//                    l +=1;
//                }else {
//                    result.add()//append all three numbers;
//                }
//            }
//        }
//
//
//    }


    static List<List<String>> groupAnagrams2(String[] strs) {
         /*
        1. loop through each string in the input
        2. sort the string
        3. insert into the hashmap
        4. iterate through the hashmap and put each value in the result array
        5. return the result array
        * */

        // create a list of lists that will contain the results
        List<List<String>> results = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(var str : strs){


            char[] tempChar = str.toCharArray();
            Arrays.sort(tempChar); //sorting the string
            //convert the array of sorted character to string
            String sortedString = new String(tempChar);

            // insert into the hasMap
            // insert the sorted string as a key and the list of values are going to be the str

            if(map.containsKey(sortedString)){
                map.get(sortedString).add(str);
            }else {
                List<String> tempList = new ArrayList<>();
                results.add(tempList);
                tempList.add(str);
                map.put(sortedString,tempList);
            }
        }

        return results;

    }

    public static int[] productExceptSelf(int[] nums) {

//        // solution using the division operation
//        List<Integer> list = new ArrayList<>();
//
//        int prodResult = 0;
//        int result = 1;
//        for (var i : nums){ // 1 // 2 // 3
//            result = result*i; // 1*1 =1 // 1*2 = 2 // 2*3
//        }
//        int finalN =1;
//        for(var n: nums){
//            finalN = result/n;
//            list.add(finalN);
//        }
//
//        return list;

        int[] result = new int[nums.length];

        int prefix = 1;

        for(int i=0;i< result.length;i++){ // 1 // 2 //
            result[i] = prefix; //  = 1 // 1 //
            prefix = prefix * nums[i]; //  = 1*1=1 //  = 1*2=2 //
        }

        int postfix = 1;
        for(int i=result.length-1; i>=0;i--){
            result[i] *= postfix;
            postfix *= nums[i];
        }

        for(var i : result){
            System.out.print(i+" ");
        }

        return result;

    }

    static int maxSubArray(int[] nums){
        int maxSub = nums[0];

        int curSum = 0;

        for(var n : nums){
            if (curSum < 0){
                curSum = 0;
            }
            curSum += n;
            maxSub = Math.max(maxSub,curSum);
        }

        return maxSub;

    }

}
