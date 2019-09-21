
public class ArrangeZeroAndOne09 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 1, 1, 1,0,1,1,0,0 };
		int count = 0;
		for(int i : arr) {
			if(i==0) {
				count++;
			}
		}
		for(int i = 0; i<count; i++) {
			arr[i] = 0;
		}
		for(int i = count; i<arr.length; i++) {
			arr[i] = 1;
		}
		System.out.println("Arrange Array is ");
		for(int i : arr) {
			System.out.print(i+ " ");
		}

	}

}
