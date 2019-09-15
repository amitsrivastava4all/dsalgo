import java.util.Arrays;

public class ElementAppearOnceInArrayByAmazon07 {

	public static void main(String[] args) {
		int arr[] = {65, 2, 1, 2 ,3 ,50 ,4 ,3 ,50 ,1, 65};
		Arrays.sort(arr);
		int hash[] = new int[100];
		for(int i = 0; i<arr.length; i++) {
			hash[arr[i]] = ++hash[arr[i]];
		}
		for(int i =0 ; i<hash.length; i++) {
			if(hash[i]==1) {
				System.out.println("Once Appear "+i);
				break;
			}
		}

	}

}
