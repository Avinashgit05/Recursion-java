public class FindMinMax {
    public static int[] findMinMaxHelper(int arr[],  int index, int min ,int max){
        if(index==arr.length){
            int[] result ={min,max};
            return result; 
        }
        if(arr[index]<min){
            min = arr[index];
        }
        if(arr[index]>max){
            max = arr[index];
        }
        return findMinMaxHelper(arr, index+1,min,max);
    }
    public static int[] findMinMax(int arr[],int index ){
        return findMinMaxHelper(arr, index, arr[0],arr[0]);
    }
    public static void main(String args[]){
        int[] arr={10,20,30,40,50};
        int index=0;
        int[] result=findMinMax(arr, index);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        
    }
    
}
