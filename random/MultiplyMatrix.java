public class main {
    public static void main(String[] args) {
        int[][] m1 = {
        		{4,2},
        		{3,1}
        };
        int[][] m2 = {
        		{5,6},
        		{3,8}
        };
        
        int[][] resultMatrix = matrix(m1, m2);
        
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] matrix(int[][] m1, int[][] m2) {
        int[][] result = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
        	for (int j = 0; j < 2; j++) {
        		result[i][j] = m1[i][0] * m2[0][j] + m1[i][1] * m2[1][j];
        	}
        }
        return result;
    }
}
// Inefficient and needs working on
