
public class Transpose04 {

	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int temp [][]  = new int[3][3];
		
		for(int i = 0;i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				temp[j][i] = arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("************************");
		
		for(int i = 0 ; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
