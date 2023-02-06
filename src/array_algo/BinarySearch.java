package array_algo;

public class BinarySearch {
	
	static boolean binarySearch(int[]arr, int item) {
		int min = 0;
		int max = arr.length-1;
		while(min<=max) {
			int mid = (min+max)/2;
			if(arr[mid] == item) {
				return true;
			}
			else if(item < arr[mid]) {
				max = mid-1;
			}
			else {
				min = mid+1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,8,9};
		
		System.out.println(binarySearch (arr,6));
		System.out.println(binarySearch (arr,3));
		System.out.println(binarySearch (arr,9));

	}

}
