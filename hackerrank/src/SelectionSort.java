
public class SelectionSort {
	public static void main(String[] args) {
		Utils.print();
		SelectionSort ss = new SelectionSort();
		ss.sort();
 		Utils.print();
	}
	
	public void sort(){
		int min = 0;
		for(int i=0; i<Utils.size()-1;i++){
			 min = i;
			 for(int j=i+1;j<Utils.size();j++){
				 if(Utils.nums[j] < Utils.nums[min] ){
					 min = j;
				 }
			 }
			 
			 Utils.swap(Utils.nums, i,min);
		}
		 
	}
	
	
}
