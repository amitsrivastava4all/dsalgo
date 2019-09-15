
public class TrappingWater08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr [] = {0,2,1,3,0,1,2,1,2,1};
		int arr []= {3,0,0,2,0,4};
		int leftPillar[] = new int[arr.length];
		int rightPillar[] = new int[arr.length];
		int maxLeft = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>maxLeft) {
				maxLeft = arr[i];
			}
			leftPillar[i] = maxLeft;
		}
		int maxRight = 0;
		for(int i =arr.length-1; i>=0; i--) {
			if(arr[i]>maxRight) {
				maxRight = arr[i];
			}
			rightPillar[i] = maxRight;
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : leftPillar) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : rightPillar) {
			System.out.print(i + " ");
		}
		System.out.println();
		int total = 0;
		for(int i = 0 ; i<arr.length; i++) {
			total+=Math.min(leftPillar[i], rightPillar[i]) - arr[i];
		}
		System.out.println("Total Water Trap "+total);
		

	}

}
