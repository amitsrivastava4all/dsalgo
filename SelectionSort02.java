package sort;

public class SelectionSort02 {

	public static void main(String[] args) {
		int x[] = {10,20,1,90,2};
		
		for(int i = 0; i<x.length-1; i++) {
			
			for(int j=i+1; j<x.length; j++) {
				if(x[i]>x[j]) {
					
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		for(int i : x) {
			System.out.println(i);
		}

	}

}
