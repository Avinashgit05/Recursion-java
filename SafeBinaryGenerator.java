public class SafeBinaryGenerator {
   public static void generate(int n, String curr) {
        if (curr.length() == n) {
            System.out.println(curr);
            return;
        }
        generate(n, curr + "0");
        if (curr.length() == 0 || curr.charAt(curr.length() - 1) == '0') {
            generate(n, curr + "1");
        }
    }

    public static void main(String[] args) {
        generate(3, "");
    }
}

