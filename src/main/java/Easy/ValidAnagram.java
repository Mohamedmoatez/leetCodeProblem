package Easy;

import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        String str1 = "aa";
        String str2 = "a";

        System.out.println(isAnagram(str1,str2));



    }


    public static boolean isAnagram(String s, String t) {


        if  (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }

        if  (sMap.equals(tMap)) {
            return true;
        }
        return false;

    }



}
