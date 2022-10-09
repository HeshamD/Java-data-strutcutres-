public class Solutions {
    public static void main(String[] args) {


        int[] nums = new int[]{1,2,3,4,3};

        String n ="0P";
        System.out.println(isPalindrome(n));

        //removeElement(nums,3);
    }

    static boolean isPalindrome(String s) {

        // will here we checking if the string is Palindrome or not
        // we need to normalize the string input
        // making the string trim from all the whiteSpacing, lower case the string
        // having 2 pointers
        // convert the string to array of char >> .toCharArray()
        // one going to start from the begining of the array and the other will going to
        // start at the end of the array
        // if(! both are equal )
        // return false
        // end return true

        // we need to normalize the string input

        int leftPointer =0;
        int rightPointer = s.length()-1;

        while (leftPointer<rightPointer){
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(leftPointer))){
                leftPointer++;
            }

            while (leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(rightPointer))){
                rightPointer--;
            }

            if( leftPointer<rightPointer && Character.toLowerCase(s.charAt(leftPointer++)) != Character.toLowerCase(s.charAt(rightPointer--))){
                return false;
            }

        }

        return true;

    }

    static String normalizeString(String s){
        if(s == null){
            return null;
        }

        //replacing all the numeric values to empty
        String result = s.replaceAll("\\d","").trim().replaceAll("\\s+","").replaceAll("\\W","").toLowerCase();

        return result;
    }
    static int removeElement(int[] nums, int val) {

        // assuming the array never = null
        // I need to delete the values in the nums array that are = val (paramter)
        // return the array.length that actually holds a value inside not the array.length that actually given

        //so we can create a pointer that will go with the iterator and whenever the index value != val,
        // so I am going to replace it with the pointer value
        
        int index = 0;

        for(int i=0; i<nums.length;i++){
            if (nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }

        return index;

    }

}
