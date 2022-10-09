package WorkingWithArray;

import java.util.HashSet;

public class ArrayClass {
    private int[] items;
    private int count;
    public ArrayClass(int length){
       this.items = new int[length];
    }
    public void insert(int index){
        //if the array is full duplicate it >> so it will be dynamic array
        if(items.length == count){
            //create a new array that's double the size of the old array
            int[] newItems = new int[count*2];
            //copy the items from the old array to the new one
            for(int i =0;i<count;i++){
                newItems[i]=items[i];
            }
            items = newItems;
        }
        // insert this index to the array
        items[count] = index;
        count++;
    }
    public void print(){
        for(int i=0;i<count;i++){
            System.out.println(items[i]);
        }
    }
    public int indexOf(int index){
        //loop throw the items and find the item
        //return the index of the index
        //otherwise return -1
        for(int i=0;i<count;i++){
            if(items[index] == items[i]){
                return i;
            }
        }
        return -1;
    }
    public void removeAt(int index){
        //make sure this index is not out of bound
        if(index>=count || index<0){
            throw new IllegalArgumentException();
        }
        //shift the items to the left
        for(int i=index;i<count;i++){
            items[i] = items[i+1];
        }
        //shrink the array
        count--;
    }
    public int arrayMax(){
        int max = items[0];
        for(int i=1;i<count;i++){
                if(items[i]>max)
                {
                    max = items[i];
                }
        }
        return max;
    }
    public void reversedArray(){
        int [] reversedItems = new int[count];
        int j = count;
        for(int i=0;i<count;i++){
            reversedItems[j-1] = items[i];
            j--;
        }

        for(var i : reversedItems){
            System.out.println(i);
        }

    }
    public void intersect(int[] nums){
        //using sets >> allows only distinct elements in it
        // so when we put the elements of both the array into the set
        // we get only the distinct elements that are equal to the union operation over the array

        HashSet<Integer> s = new HashSet<>();

        for(int i=0;i<count;i++){
            s.add(items[i]);
        }
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        System.out.println(s.toString());

    }
    public void insertAt(int item,int index){

        //create a new array which the size greater than one the previous size
        //copy all elements from the prev into the new array till that position
        //insert at that
        //insert the rest
        int[] arr = new int[count+1];

        for(int i=0;i<count+1;i++){
            if(i<index-1)
            {
               arr[i] = items[i];
            }else if(i == index-1){
                arr[i]=item;
            }else {
                arr[i] = arr[i-1];
            }
        }

        for(var i :arr){
            System.out.println(i);
        }
    }

}
