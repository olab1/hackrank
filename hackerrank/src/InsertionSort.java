
public class InsertionSort {
	
	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		is.sort();
	}
	
	public void sort(){
		Utils.print();
		int gap = 3;
		for(int i=1; i<Utils.size();i++){
			if(Utils.nums[i-1]>Utils.nums[i] ){
				for(int j=i; (j>0) && (Utils.nums[j]<Utils.nums[j-1]);j--){
					Utils.swap(Utils.nums, j, j-1);
				}
			}
		}
		
		Utils.print();
	}
}
