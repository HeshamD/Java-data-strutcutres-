import java.lang.reflect.Array;
import java.util.*;

public class Working2DArrays {
    public static void main(String[] args) {

        int[][] num1 = new int[][]
                {
                        {3,1,2,4,5},
                        {1,2,3,4},
                        {3,4,5,6},
                        {3,4,5,6}
                };


        System.out.println(intersctionMultipleArrays(num1));

    }

    public static List<Integer> intersctionMultipleArrays(int[][] nums){
        // hash map store each number exists in the first array with it's occurance
        // and loop through the entire and return the keys that their values are ==
        List<Integer> results = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        int count =1;
        for(int i=0; i<nums.length;i++){
            for (int j=0; j<nums[i].length;j++){
                if(!map.containsKey(nums[i][j])){
                    map.put(nums[i][j],1);
                }else {
                    count = map.get(nums[i][j]);
                    count ++;
                    map.put(nums[i][j],count);
                }
            }
        }

        var maxV = Collections.max(map.values());
        if(maxV == 1){
            return results;
        }

        // loop through the hashMap & return the highest values
        for(var item : map.entrySet()){
            if(item.getValue() == maxV){
                results.add(item.getKey());
            }
        }
        Collections.sort(results);
        return results;
    }


}
