public class SignalLastOccurance {
    public int lastOccurrence(int[] arr, int index, int x) {
        if (index == arr.length) {
            return -1;
        }
        int ans = lastOccurrence(arr, index + 1, x);
        if (ans != -1) return ans;
        if (arr[index] == x) return index;
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 4, 4, 4};
        int x = 4;
        SignalLastOccurance obj = new SignalLastOccurance();
        System.out.println(obj.lastOccurrence(arr, 0, x));
    }
}
