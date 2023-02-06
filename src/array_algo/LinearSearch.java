package array_algo;

public class LinearSearch {
	
	static boolean linearSearch(int item, int[] arr) {
		for(int i: arr) {
			if(i == item) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7};
		
		System.out.println(linearSearch(3,arr));
		System.out.println(linearSearch(8,arr));
	}
}
