package test.jc;

import java.util.Stack;

public class ParenthesesBalancer {

	//metod that sees if the parentheses are balanced
    public static boolean isBalanced(String s) {
    	//defyning a stack of characters
        Stack<Character> stack = new Stack<>();
        //iterate the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(foo [bar {baz}])")); // true
        System.out.println(isBalanced("foo bar {baz")); // false
        System.out.println(isBalanced("(foo bar [baz]")); // false
        System.out.println(isBalanced("foo bar baz)")); // false
        System.out.println(isBalanced("((((((())))))")); // false
        System.out.println(isBalanced("(())")); // true
    }
}