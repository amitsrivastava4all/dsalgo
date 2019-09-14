
public class ReverseAnArray01 {

	public static void main(String[] args) {
		int arr [] = {90, 1, 20,2, 4, 6,100};
		int temp = 0 ;
		for(int i = 0, j = arr.length-1; i<j; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
		}
		System.out.println("Reverse ");
		for(int i : arr){
			System.out.print(i+" ");
		}

	}

}
