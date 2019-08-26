package schoolWork;

public class matrix {

	static int fixed = (int)((Math.random()*100)+100);
	
		public static int[][] matrix1 = new int[(int)((Math.random()*100)+100)][fixed];
//	public static int[][] matrix1 = { {71,40,0} , {29,44,55} };
//	public static int[][] matrix2 = { {52,41,52,70} , {78,61,22,25} , {55,79,11,-15} };
		public static int[][] matrix2 = new int[fixed][(int)((Math.random()*100)+100)];
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] result = new int[matrix1.length][matrix2[0].length];
		
		fillMatrixInteger(matrix1,matrix2);
		result = calculateResult(matrix1,matrix2,result);
	
	}
	
	public static int[][] calculateResult(int[][] max1, int[][] max2, int[][] result) {
		int[][] temp = new int[result.length][result[0].length];
		
		for(int a = 0; a< max1.length; a++) {
			
			for(int b = 0; b < max2[0].length; b++) {
				
					int sum = 0;
				for(int c = 0; c < max2.length; c++) {
					
					sum += max1[a][c] * max2[c][b];
				}
				temp[a][b] = sum;
			}
		}
		
		
				return temp;
	}

	public static void fillMatrixInteger(int[][] max1, int[][] max2) {
		int a = 0 , b = 0;
		int rows = max1.length;
		int cols = max1[0].length;
		boolean flag = false;
		int temp[][] = new int[rows][cols];
		
		for(a = 0; a < rows; a++) {
			for(b = 0; b < cols; b++) {	
				
			
				temp[a][b] = (int)((Math.random()*100)-20);				
			}
			if(a == rows-1 && flag ==false) {
				matrix1 = temp;
				a = -1; 
				b = 0;
				rows = max2.length;
				cols = max2[0].length;
				temp = new int[rows][cols];
				flag = true;
			}
			
		}
		matrix2 = temp;
	}

}
