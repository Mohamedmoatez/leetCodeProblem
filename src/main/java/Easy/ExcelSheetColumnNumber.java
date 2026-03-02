package Easy;

public class ExcelSheetColumnNumber {


    public static void main(String[] args) {
        String info = "AA";
        System.out.println(titleToNumber(info));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);           // Get current character
            int value = c - 'A' + 1;                  // Convert 'A' to 1, ..., 'Z' to 26 ( You're subtracting the ASCII value of 'A' (which is 65) )
            result = result * 26 + value;             // Base-26 accumulation
        }

        return result;
    }

}
