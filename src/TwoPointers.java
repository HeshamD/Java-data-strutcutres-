import java.util.*;

public class TwoPointers {

    public static void main(String[] args) {

        int[] nums = new int[]{5,23,0,1,2};

        System.out.println(threeSum(nums));

    }

    static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);

        //iterate through the loop
        for(int i=0; i<nums.length;i++){

            // we don't want to reuse the same element at the same position twice

            if( i==0 ||( i > 0 && nums[i] != nums[i-1])){ //i > 0 so this value is not the first value in the input array

                //look for a pair of numbers
                int low = i+1;
                int high = nums.length-1;

                int sum = 0 - nums[i];

                while (low<high){
                    if(nums[low] + nums[high] == sum){
                        res.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    }
                    while (low<high && nums[low] == nums[low+1]){
                        low++;
                    }
                    while (low<high && nums[high] == nums[high+1]){
                        high--;
                    }
                    low++;
                    high--;
                }
            }
        }


        return res;
    }

}
