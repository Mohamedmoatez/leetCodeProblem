package Easy;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "()";

        System.out.println(isValid(s));
    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If it's a closing bracket, check if the stack has a matching opening bracket
            else if (c == ')' || c == '}' || c == ']') {
                // Check if the stack is empty or the top of the stack doesn't match the current closing bracket
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // After processing all characters, the stack should be empty if all brackets were properly closed
        return stack.isEmpty();
    }
}
