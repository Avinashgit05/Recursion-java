public class HiReplaceWithHello {
    public static String hiReplaceWithHello(String str ){
        //base case.
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)=='H' && str.charAt(1)=='i'){
            String smallString = str.substring(2);
            String result= hiReplaceWithHello(smallString);
            return "hello"+ result;
        }
        else{
            String smallString = str.substring(1);
             String result=hiReplaceWithHello(smallString); 
             return str.charAt(0)+result;
        }

    }
    public static void main(String[] args) {
        String str = "Hi Avinash Hi Avinash";
       // String replace="Hello";
        System.out.println(hiReplaceWithHello( str));

    }
    
}
