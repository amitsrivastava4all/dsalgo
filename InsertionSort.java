
public class InsertionSort {

	public static void main(String[] args) {
		int arr [] = {5,8,1,2,3,9,6};
		for(int i = 1; i<arr.length; i++) {
			int current = arr[i];
			int j = i -1;
			while(j>=0 && current<arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
		}
		System.out.println("After Insertion Sort");
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
