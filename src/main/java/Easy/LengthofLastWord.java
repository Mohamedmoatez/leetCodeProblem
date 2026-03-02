package Easy;

public class LengthofLastWord {

    public static void main(String[] args) {
        String s = "Hello World";
        String w = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(w));
    }

    public static int lengthOfLastWord(String s) {
        String[] split = s.trim().split(" ");
        return split[split.length-1].length();
    }
}
