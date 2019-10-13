
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {7,8,5,4,9,2};
		for(int i =0; i<arr.length; i++) {
			int minValue = arr[i];
			int minIndex = i;
			for(int j = i; j<arr.length; j++) {
				if(arr[j]<minValue) {
					minValue = arr[j];
					minIndex = j;
				}
			}
			if(minValue<arr[i]) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		System.out.println("After Selection Sort ");
		for(int i : arr) {
			System.out.print(i+ " ");
		}

	}

}
