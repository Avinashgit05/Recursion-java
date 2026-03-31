public class BoardProblem {
    public static void boardProblem(int currentVal, int endVal, String result){
        if(currentVal==endVal){
            System.out.print(result+ " , ");
            return;
        }
        if (currentVal>endVal){
            return ;
        }
        for(int dice=1;dice<=6;dice++){
            boardProblem(currentVal+dice, endVal, result+dice);
        }
    }

    public static void main(String[] args) {
    boardProblem( 0,10,"");
    }
}