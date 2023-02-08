package test.test;

import java.util.Stack;

public class BalanceChecker {
	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			char current = expression.charAt(i);
			if (current == '(' || current == '[' || current == '{') {
				stack.push(current);
			}
			if (current == ')' || current == ']' || current == '}') {
				if (stack.isEmpty()) {
					return false;
				}
				char last = stack.peek();
				if (current == ')' && last == '(' || current == ']' && last == '[' || current == '}' && last == '{') {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String expression1 = "([{est}])";
		String expression2 = "[aas]a[asas]asasas[{asa}]";
		String expression3 = "[[a}]";
		System.out.println(isBalanced(expression1));
		System.out.println(isBalanced(expression2));
		System.out.println(isBalanced(expression3));
	}
}
