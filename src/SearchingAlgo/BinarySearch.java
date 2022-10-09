package SearchingAlgo;

public class BinarySearch {

    public int findBinarySearch(int[] nums,int target){
        int slow = 0;
        int fast = nums.length-1;

        while (fast >= slow){
            int mid = ( (slow+fast) / 2);
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                slow =mid+1;
            }
            else {
                fast = mid-1;
            }

        }
        return slow;
    }

}
