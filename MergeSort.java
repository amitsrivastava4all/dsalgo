
public class MergeSort {
	static void print(int arr[]) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	
	static void merge(int arr[], int l, int m , int r) {
		// find sizes of the two sub array to be merged
		int n1 = m - l + 1;
		int n2 = r - m;
		// create the two temp array
		int left []= new int[n1];
		int right[]= new int [n2];
		// copy the elements of original array in 2 sub arrays by looping
		for(int i = 0; i<n1; i++) {
			left[i] = arr[l + i];
		}
		for(int j = 0; j<n2; j++) {
			right[j] = arr[m + 1 + j];
		}
		int i = 0, j = 0;
		int k = l;
		while(i<n1 && j<n2) {
			if(left[i] <=right[j]) {
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		// Copy the Remaining Elements of Left Array
		while(i<n1) {
			arr[k]= left[i];
			i++;
			k++;
		}
		// Copy the Remaining Elements of Right Array
				while(j<n2) {
					arr[k]= right[j];
					j++;
					k++;
				}
		
	}
	static void sort(int arr[], int left, int right) {
		if(left<right) {
			int mid = (left + right)/2;
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			merge(arr,left, mid, right); 
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {38, 27,43,3,9,82,10};
		sort(arr, 0, arr.length-1);
		print(arr);
		

	}

}
