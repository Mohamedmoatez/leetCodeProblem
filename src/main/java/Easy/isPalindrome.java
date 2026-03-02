package Easy;

import java.util.ArrayList;
import java.util.List;

public class isPalindrome {


    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String right = String.valueOf(x);
        List<Character> left = new ArrayList<>();
        System.out.println(right);
        for (int i = right.length() - 1; i >= 0; i--) {
            left.add(right.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : left) {
            sb.append(ch);
        }
        System.out.println(sb);
        if (sb.toString().equals(right)) {
            return true;
        } else {
            return false;
        }

    }
}
 