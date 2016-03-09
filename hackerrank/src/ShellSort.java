public class ShellSort {

	public static void main(String[] args) {
		ShellSort sl = new ShellSort();
		// System.out.println(1/2);
		sl.sort();
	}

	public void sort() {
		Utils.print();
		int gap = 3;

		while (gap > 0) {
			for(int i=gap; i<Utils.size();i=i+gap){
				if(Utils.nums[i-gap]>Utils.nums[i] ){
					for(int j=i; (j>0) && (Utils.nums[j]<Utils.nums[j-gap]);j =j-gap){
						Utils.swap(Utils.nums, j, j-gap);
					}
				}
			}
			Utils.print();
			gap = gap / 2;
		}


//		while (gap > 0) {
//			for(int i=1; i<Utils.size();i++){
//				if(Utils.nums[i-1]>Utils.nums[i] ){
//					for(int j=i; (j>0) && (Utils.nums[j]<Utils.nums[j-1]);j--){
//						Utils.swap(Utils.nums, j, j-1);
//					}
//				}
//			}
//			Utils.print();
//			gap = gap / 2;
//		}
//		
		// for(int i=1; i<Utils.size();i++){
		// if(Utils.nums[i-1]>Utils.nums[i] ){
		// for(int j=i; (j>0) && (Utils.nums[j]<Utils.nums[j-1]);j--){
		// Utils.swap(Utils.nums, j, j-1);
		// }
		// }
		// }

		// for (int i = 0; i < Utils.size(); i=i+gap) {
		// int inc = gap;
		//
		// if (Utils.nums[i + inc] < Utils.nums[inc]) {
		// for (int j = i + inc; (j > 0)
		// && (Utils.nums[j] < Utils.nums[j - inc]); j--) {
		// Utils.swap(Utils.nums, j, j - 1);
		// }
		// }
		//
		// gap = gap / 2;
		// }
		Utils.print();
	}
}
