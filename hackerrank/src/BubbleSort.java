public class BubbleSort {
 	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		bs.sort();
	}
	
	public void sort(){
		Utils.print();
		int right = Utils.nums.length-1;
		int size = Utils.nums.length;
		for(int i=0; i<size;i++){
			
			for(int j=0; j<right;j++){
				if(Utils.nums[j]>  Utils.nums[j+1]){
					Utils.swap(Utils.nums, j, j+1);
				}
			}
			right --;
		}
		Utils.print();
	}

	 
}
