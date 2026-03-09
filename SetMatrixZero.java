public class SetMatrixZero {

    public static int[][] setZeroes(int[][] matrix) {
        int rowlen = matrix.length;
        int collen = matrix[0].length;

        boolean[] rows = new boolean[rowlen];
        boolean[] cols = new boolean[collen];

        for(int row = 0; row < rowlen; row++){
            for(int col = 0; col < collen; col++){
                if(matrix[row][col] == 0){
                    rows[row] = true;
                    cols[col] = true;
                }
            }
        }

        for(int r = 0; r < rowlen; r++){
            for(int c = 0; c < collen; c++){
                if(rows[r] || cols[c]){
                    matrix[r][c] = 0;
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        int[][] result = setZeroes(matrix);

        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}