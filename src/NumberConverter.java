public class NumberConverter {
    public static String decimalToBinary(int decimalNum) {
        return Integer.toBinaryString(decimalNum);
    }

    public static int binaryToDecimal(String binaryNum) {
        return Integer.parseInt(binaryNum, 2);
    }

    public static void main(String[] args) {
        int decimalNum = 42;
        String binaryNum = decimalToBinary(decimalNum);
        System.out.println(decimalNum + " in decimal, is " + binaryNum + " in binary");

        int convertedDecimalNum = binaryToDecimal(binaryNum);
        System.out.println(binaryNum + " in binary, is " + convertedDecimalNum + " in decimal");
    }
}
