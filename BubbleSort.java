
public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {5,8,1,6,9,2};
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = 0; j<arr.length-1 -i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("After Bubble Sort");
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		

	}

}
