import java.util.*;

public class Mains {

    public static void main(String[] args) {

        //System.out.println(checkEpressions("<a>{}"));

        System.out.println(checkBalancedExpressionByStack("()()(()"));
    }

    static String reverseString(String s){
        if(s == null){
            throw new IllegalArgumentException();
        }

        //ahmed
        //demha
        // >> ahmed
        Stack<Character> stack = new Stack<>();
        StringBuffer result = new StringBuffer();

        for(var st :s.toCharArray()){
            stack.push(st);
        }
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }

        return  result.toString();


    }
    static Boolean checkEpressions(String s){
        Stack<Character> openStack = new Stack<>();

        for(char ch:s.toCharArray()){
            if(isLeftBracket(ch)){
                openStack.push(ch);
                if(isRightBracket(ch)){
                    if(openStack.empty()) return false;
                    var top=openStack.pop();
                    if(bracketsMatch(top,ch)) return false;
                }
            }
        }
        return openStack.empty();
    }
    static boolean isLeftBracket(char ch){
        var leftBrackets = Arrays.asList('(','<','{','[');
        return leftBrackets.contains(ch);
    }
    static boolean isRightBracket(char ch){
        return ch == ')' || ch == '>' || ch == '}' || ch == ']';
    }
    static boolean bracketsMatch(char left, char right){
        return (right == ')' && left != '(') ||
                (right == '}' && left != '{') ||
                (right == ']' && left != '[') ||
                (right == '>' && left != '<') ;
    }

    static boolean checkBalancedExpressionByStack(String s){
        // (())
        // (((
        // )()
        // (())(

        //1. create a stack >> inserting only openning brackets
        //2. check if s[0] == ')' return false;
        //3. loop through the string
        //4.    if( s ==  '(') >> push to the stack
        //5.    if( s == ')' & stack != empty) >> pop from the stack
        //6. if stack.empty >> return true
        //7. return false;

        Stack<Character> stack = new Stack<>();

        if(s.charAt(0) == ')') return false;

        for(int i=0; i<s.length();i++){ // ) ->
            if(s.charAt(i) == '(')
                stack.push(s.charAt(i));
            else if(s.charAt(i) == ')' && !stack.isEmpty()){
                stack.pop();
            }else {
                return false;
            }

        }
        return stack.isEmpty();
    }

}
