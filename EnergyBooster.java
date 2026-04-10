public class EnergyBooster {
    static long power(long a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
    public static void main(String[] args) {
        long a = 2;   
        int n = 5;    
        long result = power(a, n);
        System.out.println("Power is: " + result);
    }
}
// energy booster.