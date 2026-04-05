public class ZeroHunter {
    public static int countZero(int n){
        if(n==0){
            return 0;
        }
        return (n%10==0 ? 1:0)+countZero(n/10);
    }

    public static void main(String args[]){
        System.out.println(countZero(102030));
    }
}