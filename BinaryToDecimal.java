public class BinaryToDecimal {
    public static long binaryToDecimal(long n) {
        return helper(n, 0);
    }

    private static long helper(long n, int power) {
        if (n == 0) return 0;
        long lastDigit = n % 10;
        return (long)(lastDigit * Math.pow(2, power)) 
               + helper(n / 10, power + 1);
    }
    public static void main(String[] args) {

        long n = 1001; 
        long result = binaryToDecimal(n);
        System.out.println("Binary: " + n);
        System.out.println("Decimal value: " + result);
    }
}
