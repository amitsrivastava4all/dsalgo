// Search Element in R+C Time
public class SearchElement05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { { 10, 20, 30, 40 }, 
                { 15, 25, 35, 45 }, 
                { 27, 29, 37, 48 }, 
                { 32, 33, 39, 50 } };
		int x = 33;
		int n = mat.length;
		int i = 0, j = n - 1; 
        while (i < n && j >= 0) { 
            if (mat[i][j] == x) { 
                System.out.print("n Found at " + i + " " + j); 
                return; 
            } 
            if (mat[i][j] > x) 
                j--; 
            else // if mat[i][j] < x 
                i++; 
        } 
  
        System.out.print("n Element not found");
	}

}
