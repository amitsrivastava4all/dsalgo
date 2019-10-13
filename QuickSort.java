
public class QuickSort {
	static void sort(int arr[], int low, int high) {
		if(low<high) {
			int pi = partition(arr, low, high);
			sort(arr,low, pi - 1);
			sort(arr, pi+1, high);
		}
	}
	static void print(int arr[]) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	static int partition(int arr[], int low, int high) {
		int pivot = high;
		int i = low;
		int j = high-1;
		for(int k = low; k<high;k++) {
			if(arr[i]>arr[pivot] && arr[j]<arr[pivot]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
				i++;
				j--;
				
			}
			else if(arr[i]<arr[pivot]) {
					i++;
				}
				else if(arr[j]>arr[pivot]) {
						j--;
					}
					 if( i>=j) {
						int temp = arr[i];
						arr[i] = arr[pivot];
						arr[pivot] = temp;
						break;
					}
		}
		return i;
	}

	public static void main(String[] args) {
		int arr [] = {17, 41, 5, 22, 54, 6, 29, 3,13};
		sort(arr, 0, arr.length-1);
		print(arr);
		

	}

}
