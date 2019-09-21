
public class ArrangeNegativeAndPositiveNumbers12 {

	public static void main(String[] args) {
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int temp = 0;
		for(int i = 0, j= 0;i<arr.length; i++ ) {
			if(arr[i]<0 && i!=j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}

	}

}
