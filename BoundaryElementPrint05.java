
public class BoundaryElementPrint05 {

	public static void main(String[] args) {
		
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		
		for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) { 
                if (i == 0) 
                    System.out.print(a[i][j] + " "); 
                else if (i == a.length - 1) 
                    System.out.print(a[i][j] + " "); 
                else if (j == 0) 
                    System.out.print(a[i][j] + " "); 
                else if (j == a[i].length - 1) 
                    System.out.print(a[i][j] + " "); 
                else
                    System.out.print("  "); 
            } 
            System.out.println(""); 
        } 
	}

}
