package medium;

import java.util.*;

public class GroupAnagrams {


    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(arr));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> sMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            sMap.putIfAbsent(sorted, new ArrayList<>());
            sMap.get(sorted).add(str);
        }
        return new ArrayList<>(sMap.values());

    }
}
