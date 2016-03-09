public class MergeSort1 {

	public static void main(String[] args) {
		Utils.print();
		MergeSort1 ms = new MergeSort1();
		ms.sort(Utils.nums(), 0, Utils.size()-1);
		Utils.print();
	}

//	public void sort(int[] nums, int left, int right) {
//
//		if (left <= right) {
//			return;
//		}
//
//		int split = (left + right) / 2;
//		int[] temArr = new int[nums.length];
//
//		int tempLeft = left;
//		// int tempRight = right;
//		int mid = split;
//		sort(nums, left, split);
//
//		sort(nums, split + 1, right);
//
//		while (left <= split && split <= right) {
//			if (temArr[tempLeft] <= nums[mid])
//				nums[tempLeft++] = temArr[m1++];
//			else
//				nums[tempLeft++] = nums[mid++];
//		}
//	}

	public void sort(int[] nums, int low, int high) {
		if (low >= high) 
			return;
		int split = (low + high) / 2;
		
		sort(nums, low, split);
		sort(nums, split+1, high);
		int[] temArr = new int[nums.length];
		for(int i=low;i<=high;i++){
			temArr[i] = nums[i];
		}
		// copy a[low ... split-1] to scratch array;

		int m1 = low;
		int m2 = split+1;
		int i = low;
		while (i <= split && m2 <= high)
			if (temArr[m1] <= nums[m2])
				nums[i++] = temArr[m1++];
			else
				nums[i++] = temArr[m2++];
		
		while (m1 <= split)
			nums[i++] = temArr[m1++];
	}
	/* DONE */

}

//public class MergeSort1 {
//
//	public void sort(int[] values) {
//
//		int[] numbers = Utils.nums;
//		mergesort(numbers, 0, Utils.size() - 1);
//	}
//
//	public static void main(String[] args) {
//		Utils.print();
//		MergeSort1 ms = new MergeSort1();
//		ms.sort(Utils.nums());
//		Utils.print();
//	}
//
//	private void mergesort(int[] numbers, int low, int high) {
//		// check if low is smaller then high, if not then the array is sorted
//		if (low >= high) {
//			return;
//		}
//		
//		
//		// Get the index of the element which is in the middle
//		int middle = (high + low) / 2;
//		// Sort the left side of the array
//		mergesort(numbers, low, middle);
//		// Sort the right side of the array
//		mergesort(numbers, middle + 1, high);
//		// Combine them both
//		merge(numbers, low, middle, high);
//
//	}
//
//	private void merge(int[] numbers, int low, int middle, int high) {
//		int[] tempArr = new int[numbers.length];
//		// Copy both parts into the helper array
//		for (int i = low; i <= high; i++) {
//			tempArr[i] = numbers[i];
//		}
//
//		int i = low;
//		int j = middle + 1;
//		int k = low;
//		// Copy the smallest values from either the left or the right side back
//		// to the original array
//		while (i <= middle && j <= high) {
//			if (tempArr[i] <= tempArr[j]) {
//				numbers[k++] = tempArr[i++];
//			} else {
//				numbers[k++] = tempArr[j++];
//			}
//		}
//		// Copy the rest of the left side of the array into the target array
//		while (i <= middle) {
//			numbers[k++] = tempArr[i++];
//		}
//
//	}
//}
