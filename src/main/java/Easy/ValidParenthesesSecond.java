package Easy;

import java.util.Stack;

public class ValidParenthesesSecond {

    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Stack<Character> seen = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                seen.push(bracket);
            } else if (seen.empty()) {
                return false;
            } else if (bracket == ')' && seen.peek() == '(') {
                seen.pop();
            } else if (bracket == '}' && seen.peek() == '{') {
                seen.pop();
            } else if (bracket == ']' && seen.peek() == '[') {
                seen.pop();
            } else {
                return false;
            }
        }
        return seen.isEmpty() ? true : false;
    }
}
