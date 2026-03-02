package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EncodeandDecodeStrings {


    public static void main(String[] args) {

        List<String> needToEncode = new ArrayList<>();
        needToEncode.add("neet");
        needToEncode.add("code");
        needToEncode.add("love");
        needToEncode.add("you");
        System.out.println(encode(needToEncode));
        String res = encode(needToEncode);
        System.out.println(decode(res));

    }

    // encode list of string to a single string
    public static String encode(List<String> strs) {
        char delimiter = '#';
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder.append(str.length());
            stringBuilder.append(delimiter);
            stringBuilder.append(str);
        }

        return String.valueOf(stringBuilder);

    }

    public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        char delimiter = '#';
        int i = 0;

        while (i < str.length()) {
            // Find the delimiter position
            int delimiterPos = str.indexOf(delimiter, i);

            // Extract the length
            int length = Integer.parseInt(str.substring(i, delimiterPos));

            // Move past the delimiter
            int startPos = delimiterPos + 1;

            // Extract the string of that length
            String word = str.substring(startPos, startPos + length);
            result.add(word);

            // Move to the next encoded string
            i = startPos + length;
        }

        return result;
    }
}
