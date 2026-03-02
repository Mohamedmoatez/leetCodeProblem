package Easy;

import java.math.BigInteger;

public class AddBinary {


    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

//    public static String addBinary(String a, String b) {
//        int b1 = Integer.parseInt(a,2);
//        int b2 = Integer.parseInt(b,2);
//        int sum = b1 + b2;
//        return Integer.toBinaryString(sum);
//
//    }
    public static String addBinary(String a, String b) {
        BigInteger b1 = new BigInteger(a, 2);
        BigInteger b2 = new BigInteger(b, 2);
        BigInteger sum = b1.add(b2);
        return sum.toString(2);
    }
}
