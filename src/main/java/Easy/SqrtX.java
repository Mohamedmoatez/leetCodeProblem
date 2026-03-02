package Easy;

public class SqrtX {
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.


    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));

    }

    public static int mySqrt(int x) {
        int result = (int) Math.sqrt(x);
        return result;
    }

}
