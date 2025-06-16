import java.util.Scanner;

public class Bitmanipulation {
    // leftshift Multiply by 2 and Rightshift divided by 2
    public static void getBit() {
        // Get Bit: to know that bit is 0 or 1 at any index
        /* Get Bit Operation */
        int number = 5; // 0101
        int pos = 3;
        int Bitmask = 1 << pos;
        if ((Bitmask & number) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }

    public static void setBit() {
        // Set Bit: Make any Bit * 1 * either that is 0 or 1
        /* Set Bit Operation */
        int number = 5; // 0101
        int posi = 1;
        int Bitm = 1 << posi;
        int newNumber = Bitm | number;
        System.out.println(newNumber);
    }

    public static void clearBit() {
        // Clear Bit: Make a specific bit zero
        /* Clear Bit Operation */
        int number = 5; // 0101
        int pos = 2;
        int Bitm = 1 << pos;
        int tildawitbitmask = ~Bitm;
        int result = tildawitbitmask & number;
        System.out.println(result);
    }

    public static void updateBit() {
        // Update Bit: Update specific bit if bit 0 then make 1, if bit is 1 then make 0
        /* Update Bit Operation */
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Operation 1 or 0");
        int operation = in.nextInt();
        if (operation == 1) {
            setBit();
        } else {
            clearBit();
        }
    }

    public static void checkNumPwOf2() {
        int numInBinary = 101;
        if ((numInBinary & (numInBinary - 1)) == 0) {
            System.out.println("Number is power of 2");
        } else {
            System.out.println("Number is not a power of 2");
        }

    }

    public static void togglePosition() {
        int number = 10;
        int pos = 2;
        int Bitmask = 1 << pos;
        int result = Bitmask | number;
        System.out.println(Integer.toBinaryString(result));
        System.out.println(Integer.toBinaryString(Bitmask));

    }

    public static void countOnes() {
        int number = 23;
        int originalNumber = number;
        int count = 0;
        while (number > 0) {
            if ((number & 1) == 1) {
                count++;
            }
            number >>= 1;
        }
        System.out.println("Number of ones of number " + originalNumber + " : " + count);

    }

    public static void main(String[] args) throws Exception {
        countOnes();
    }
}
