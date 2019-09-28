package sort;

public class BubbleSort01 {

	public static void main(String[] args) {
		int x[] = {10,20,1,90,2};
		
		for(int i = 0; i<x.length-1; i++) {
			for(int j=0; j<x.length-i-1; j++) {
				if(x[j]>x[j+1]) {
					int temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
			}
		}
		for(int i : x) {
			System.out.println(i);
		}

	}

}
