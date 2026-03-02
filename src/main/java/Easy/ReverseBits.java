package Easy;

public class ReverseBits {
    public static void main(String[] args) {
        int n =43261596;
        System.out.println(reverseBits(n));
    }



    public static int reverseBits(int n) {
//        String binaryString = Integer.toBinaryString(n);
        String binaryString = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(binaryString);
        stringBuilder.reverse();
        String reverse = stringBuilder.toString();
        return Integer.parseInt(reverse,2);

    }

}
