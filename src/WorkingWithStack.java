import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {

        //creating a stack
        Stack<Integer> stack=new Stack<>();

        //insert //add to the stack

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(0);

        System.out.println(stack.get(2));

//        System.out.println(stack.peek());// to see which element on the top
//
//        // to get the stack size
//        System.out.println(stack.size());
//
//        // to delete the element on the top
//        System.out.println(stack.pop());
//
//        //to check if the stack is empty or not
//        System.out.println(stack.empty());

        //System.out.println(getMinInStack(stack));

        System.out.println(isValidParentheses(")("));

    }


    static int getMinInStack(Stack<Integer> stack){ // with O(N) where N is the size of the stack

        //get the min by looping through the entire stack

        int minValue = stack.get(0);

        for(int i=0;i<stack.size();i++){
            if( minValue > stack.get(i)){
             minValue = stack.get(i);
            }
        }

        return minValue;

    }


    static boolean isValidParentheses(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if( c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if ( c == ')' &&  !stack.isEmpty() && stack.peek() == '(' ) {
                stack.pop();
            }
            else if (c == '}' &&  !stack.isEmpty() && stack.peek() == '{' ) {
                stack.pop();
            }
            else if(c == ']' &&  !stack.isEmpty() && stack.peek() == '[' ) {
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }



}


