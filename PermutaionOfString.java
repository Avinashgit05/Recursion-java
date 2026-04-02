public class PermutaionOfString {
    public static void permutaionOfString(String str, String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currStr=str.charAt(i);
            String remString=str.substring(0, i) + str.substring(i+1);
            permutaionOfString(remString, result+currStr);
        }

    }
    public static void main(String[] args) {
        permutaionOfString("abc","");
    }
}
