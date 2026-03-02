package Easy;

public class ValidPalindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

//        Easy.isPalindrome(input);
        System.out.println(isPalindrome(input));
    }


//    public static boolean Easy.isPalindrome(String s) {
//        boolean result = false;
//        String after = s.replaceAll("[-+.^:,]", "");
//        String noSpace = after.replaceAll(" ", "").toLowerCase(Locale.ROOT);
//        int length = noSpace.length() / 2;
//        List<String> arr1 = new ArrayList<>();
//        List<String> arr2 = new ArrayList<>();
//
//        for (int i = 0; i < length ; i++) {
//            arr1.add(String.valueOf(noSpace.charAt(i)));
//        }
//
//        for (int i = length - 1; i >= 0; i--) {
//            arr2.add(String.valueOf(noSpace.charAt(i)));
//        }
//        if (arr1.equals(arr2)) {
//            result = true;
//        }
//        return result;
//    }


    public static boolean isPalindrome(String s) {
        // Step 1: Normalize the string
        // [^a-zA-Z0-9] means: "any character that is not a letter or digit"

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Check if the cleaned string is a palindrome ( Check for Palindrome with Two Pointers)
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;   // Move the left pointer one step right
            right--;  // Move the right pointer one step left
        }

        return true;
    }

}
