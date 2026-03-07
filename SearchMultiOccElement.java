public class SearchMultiOccElement {
    public static int[] findAllHelper(int arr[],int index, int search, int count){
        if(index==arr.length){
            int[] result=new int[count];
            return result;
        }
        if(arr[index]==search){
            count++;
        }
        int[] result=findAllHelper(arr,index+1,search,count);
        if(arr[index]==search){
            result[count-1]=index;
        }
        return result; 

    }
    public static int[] findAll(int arr[] ,int index ,int search){
       return findAllHelper(arr,index,search, 0);

    }
    public static void main(String args[]){
        int arr[]={10,60,50,80,50,70};
        int search=50;
        int index=0;
        int[] result=findAll(arr,index,search);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
    
}
