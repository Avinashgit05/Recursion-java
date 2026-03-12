public class PrintAdajecentStar {
    public static String printAdajecentStar(String str){
        if(str.length()==1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return str.charAt(0)+"*"+printAdajecentStar(str.substring(1));
        }
        else{
            return str.charAt(0)+ printAdajecentStar(str.substring(1));
        }
    }
    public static void main(String[] args) {
         String str="AAABBBCCC";
        System.out.println(printAdajecentStar(str));
    }
    
}
