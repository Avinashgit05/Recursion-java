public class RemoveConsDup {
    public static String removeConsDup(String str){
        if(str.length()==1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return removeConsDup(str.substring(1));
        }
        else{
            return str.charAt(0)+removeConsDup(str.substring(1));
        }
    } 
    public static void main(String[] args) {
        String str="AAABBBCCC";
        System.out.println(removeConsDup(str));
    }
    
}
