public class isSorted {
     public boolean issorted(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return issorted(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5}; 
       isSorted obj = new isSorted();
        if (obj.issorted(arr, 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    } 
}
