package sort;

public class InsertionSort03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {10,20,1,90,2};
		int temp = 0;
		for(int i = 1; i<x.length; i++) {
			int current = x[i];
			int j = i-1;
			
			while( j>=0 && current<x[j]) {
				temp = x[j];
				x[j] = x[j+1];
				x[j+1]= temp;
				j--;
			}
			
		}
		for(int i : x) {
			System.out.println(i);
		}
		

	}

}
