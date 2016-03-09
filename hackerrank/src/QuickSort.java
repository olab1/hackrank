
public class QuickSort {
	
	
			//{3,5,7,9,1,2,6,8,4};
			//{3,4,7,1,2,9,8,6,5};
	
	public static void main(String[] args) {
		Utils.print();
		QuickSort quickSort = new QuickSort();
		quickSort.sort(0, Utils.nums().length);
		Utils.print();
	}
	
	public void sort(int low,int high){
		
		if(high == low){
			return;
		}
		
		int priviot = Utils.nums[high-1];
		int split = low;
		
		for(int i=low;i<high-1;i++){
			if( Utils.nums[i]<priviot){
				Utils.swap( Utils.nums,i,split);
				split++;
			}
		}
		Utils.swap( Utils.nums,split,high-1);
		sort(low, split);
		sort( split+1, high);
	}
	
	
	
}
