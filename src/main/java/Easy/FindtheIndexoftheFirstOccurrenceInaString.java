package Easy;

public class FindtheIndexoftheFirstOccurrenceInaString {

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int res = 0;

        if (haystack == null || needle == null) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.contains(needle)) {
                return haystack.indexOf(needle) ;
            } else {
                res = -1;
            }
        }
        return res;
    }
}
