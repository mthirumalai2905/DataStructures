package Stack;

import java.util.Stack;

public class ParanthesisMatching {
    private static boolean isValid(String input){
        Stack<Character> stack = new Stack<>();
        
        for(char c : input.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if(!stack.isEmpty() && isMatching(stack.peek(), c)){
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char opening, char closing){
        return (opening == '(' && closing == ')') || (opening == '{' && closing == '}') || (opening == '[' && closing == ']');
    }
    public static void main(String[] args) {
        String input1 = "(){}[]";
        String input2 = "{[()]}";
        String input3 = "{[()]";
        String input4 = "([)]";

        System.out.println(input1 + " is valid: " + isValid(input1));
        System.out.println(input2 + " is valid: " + isValid(input2));
        System.out.println(input3 + " is valid: " + isValid(input3));
        System.out.println(input4 + " is valid: " + isValid(input4));
    }
}
