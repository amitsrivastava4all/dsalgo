
public class CheckArrayIsSorted04 {
	static boolean isSorted(int arr[]) {
		// In this Problem Base case can be N
		if(arr.length==1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int paritialArray [] = new int[arr.length-1];
		for(int i=0; i<paritialArray.length; i++) {
			paritialArray[i] = arr[i+1];
		}
		boolean result = isSorted(paritialArray);
		return result;
		
		
	}
	
	static boolean isSorted2(int arr[], int startIndex) {
		// In this Problem Base case can be N
		if(startIndex>=arr.length-1) {
			return true;
		}
		if(arr[startIndex]>arr[startIndex+1]) {
			return false;
		}
		startIndex++;
		boolean result = isSorted2(arr, startIndex);
		return result;
		
		
	}

	public static void main(String[] args) {
		int arr[] = {10,20,30,4,50};
		System.out.println(isSorted2(arr,0));

	}

}
