	
public class SearchElementInMatrix08 {

	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 30, 40 }, 
                { 15, 25, 35, 45 }, 
                { 27, 29, 37, 48 }, 
                { 32, 33, 39, 50 } };
		int i = 0;
		int j = mat[0].length-1;
		int search =33;
		while(i<mat.length && j>=0) {
			if(mat[i][j]==search) {
				System.out.println("Found "+search+ " at "+i+" "+j);
				return ;
			}
			if(mat[i][j]>search) {
				j--;
			}
			else {
				i++;
			}
			
		}
		System.out.println("Not Found...");

	}

}
