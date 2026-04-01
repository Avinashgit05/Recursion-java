public class SubSequenceOfString {
public static void subSequence0fString(String str, String result){
    if(str.length()==0){
        System.out.print(result+" , ");
        return ;
    }
     subSequence0fString(str.substring(1),result);
    subSequence0fString(str.substring(1),result + str.charAt(0));

}
    public static void main(String args[]){
subSequence0fString("avinash","");
    }
}