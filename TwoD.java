public class TwoD {
    

    // Function to add two 2D arrays
    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
        return result;
    }
    
    // Function to subtract two 2D arrays
    public static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        int[][] additionResult = addMatrices(matrix1, matrix2);
        int[][] subtractionResult = subtractMatrices(matrix1, matrix2);
        
        System.out.println("Addition Result:");
        for (int i = 0; i < additionResult.length; i++) {
            for (int j = 0; j < additionResult[0].length; j++) {
                System.out.print(additionResult[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Subtraction Result:");
        for (int i = 0; i < subtractionResult.length; i++) {
            for (int j = 0; j < subtractionResult[0].length; j++) {
                System.out.print(subtractionResult[i][j] + " ");
            }
            System.out.println();
        }
    }
}

