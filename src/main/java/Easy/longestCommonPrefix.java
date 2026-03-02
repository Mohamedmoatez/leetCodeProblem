package Easy;

public class longestCommonPrefix {



    public static void main(String[] args) {
        String[] arr ={"flower","flow","flight"};
        System.out.println(longestPrefix(arr));
    }

    
    public static String longestPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start by assuming the first string is the longest common prefix
        String prefix = strs[0];

        // Compare the prefix with each string
        for (int i = 1; i < strs.length; i++) {
            // Check if the current prefix is a common prefix of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
