public class StringSearchAndReplace {
    public static String searchAndReplace(String str ,char search,char replace){
        if(str.length()==0){
            return "";
        }
        String result=searchAndReplace(str.substring(1) , search , replace);
        if(str.charAt(0)==search){
            return replace+result;
        }
        return str.charAt(0)+result;

    }
    public static void main(String[] args) {
        String str="Hello";
        char search='l';
        char replace='x';

        System.out.println(searchAndReplace(str, search ,replace));
    }
    
}
