package Easy;

public class RomanToInteger {


    public static void main(String[] args) {
        String I = "1";
        String III = "III";
        String LVIII = "LVIII";
        String MCMXCIV = "MCMXCIV";
        System.out.println(romanToInt(MCMXCIV));
    }


    public static int romanToInt(String s) {
        int sum = 0;
        for (int i=0; s.length() > i; i++) {
            int current = getRomanValue(s.charAt(i));
            if (s.length() > i+1){
                int nextVal= getRomanValue(s.charAt(i+1));
                if (nextVal > current){
                    sum -= current;
                }else {
                    sum += current;
                }
            }else {
                sum += current;
            }
        }
        return sum;
    }

    private static int getRomanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // Invalid character, should never happen
        }
    }
}
