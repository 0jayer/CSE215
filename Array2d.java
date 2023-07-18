
public class Array2d {

	public static void main(String[] args) {
		int [][] arr = {{3,4,9},{2,9,11},{4,6,0}};
		int row = arr.length;
		int column = arr[0].length;
		int prindiag = 0;
		int secdiag = 0;
		for(int i = 0; i < row; i++)
		{
			int sumrow = 0;
			int sumcol = 0;
			
			for(int j=0;j<column;j++) {
				sumrow += arr[i][j];
				sumcol += arr[j][i];
				if(i==j)
					prindiag +=arr[i][j];
				if(j == (row-1)-i) {
					secdiag+= arr[i][j];
				}
			}
			System.out.println("Sum of row " + (i+1) +" is: " + sumrow);
			System.out.println("Sum of col " + (i+1) +" is: " + sumcol);
			
		}
		System.out.println();
		System.out.println("Sum of principal diagonal is: " + prindiag);
		System.out.println("Sum of secondary diagonal is: " + secdiag);
		
	}

}
