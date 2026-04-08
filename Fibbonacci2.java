public class Fibbonacci2 {
    public int fib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fib(n - 1) + fib(n - 2);
}
public static void main(String[] args) {
   Fibbonacci2 sol = new Fibbonacci2();
    int n = 6; 
    int result = sol.fib(n);
    System.out.println(result);
}
}