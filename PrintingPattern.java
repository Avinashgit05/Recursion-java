public class PrintingPattern {
    public static void  printingPattern(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        printingPattern(star-1);

    }
    public static void printLine(int lines){
        if(lines==0){
            return;
        }
        printLine(lines-1);
        printingPattern(lines);
        System.out.println();
    }
    public static void main(String[] args) {
        printLine(5);
    }
    
}
