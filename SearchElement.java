public class SearchElement {
    public static void searchElement1(int arr[], int target ,int index){
    if(index==arr.length){
        System.out.println("Not found");
        return;
    }
    if(arr[index]==target){
        System.out.println("Found at "+(index+1));
        return;
    }
     searchElement1(arr , target, index+1);
    }
    public static boolean searchElement2(int arr[], int target ,int index){
    if(index==arr.length){
        return false;
    }
    if(arr[index]==target){
        return true;
    }
     return searchElement2(arr , target, index+1);
    }

    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        int target=50;
        int index=0;
        searchElement1(arr,target,index);
        System.out.println(searchElement2(arr,target,index));
    }
    
}
