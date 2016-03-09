
public class Utils {
	
	public static int[] nums = new int[]
			 //{3,4,7,1,2,11,9,8,6,5,10};
	 {10,9,8,7,6,5,4,3,2,1};
	public static void print(){
		for(int x: nums){
			System.out.print(x+" ");
		}
		System.out.println();
	}

	public static int[] nums() {
		return nums;
	}
	
	public static int size() {
		return nums.length;
	}

	public static void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
}
