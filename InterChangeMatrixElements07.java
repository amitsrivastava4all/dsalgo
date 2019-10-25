
public class InterChangeMatrixElements07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][] = { { 8, 9, 7, 6 }, 
                { 4, 7, 6, 5 }, 
                { 3, 2, 1, 8 }, 
                { 9, 9, 7, 7 } };
		int columnLength = m[0].length;
		for (int i = 0; i < columnLength; i++) { 
	        int temp = m[i][0]; 
	        m[i][0] = m[i][columnLength - 1]; 
	        m[i][columnLength - 1] = temp; 
	    } 
		
		for(int i = 0; i<m.length; i++) {
			for(int j = 0 ; j< m[i].length; j++) {
				
					System.out.print(m[i][j]+" ");
				
					
			}
			System.out.println();
		}

	}

}
