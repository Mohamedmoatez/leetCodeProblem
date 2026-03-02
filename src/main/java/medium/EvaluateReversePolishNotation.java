package medium;

import java.util.*;

public class EvaluateReversePolishNotation {


    public static void main(String[] args) {

        String[] arr = {"1", "2", "+", "3", "*", "4", "-"};
        System.out.println(evalRPN(arr));

    }


    public static int evalRPN(String[] tokens) {

        int result = 0;
        Stack<String> stack = new Stack<>();
        String[] oper = {"+", "-", "*", "/"};
        Set<String> operators = new HashSet<>(Arrays.asList(oper));

        StringBuilder stringBuilder = new StringBuilder();
        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < tokens.length; i++) {

//            for (int j=1 ;j<)
            if (operators.contains(tokens[i])) {
                stack.push(tokens[i]);
            } else {
                if (!stack.isEmpty()) {
                    map.put(i - 2, stack.pop());
                }
                map.put(i, tokens[i]);
            }

        }


        System.out.println(map);

        return result;
    }


}
