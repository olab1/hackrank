import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		Utils.print();
		MergeSort ms = new MergeSort();
		 ms.sort(Utils.nums,0,Utils.size()-1);
		Utils.print();
	}

	// {3,4,5,6,7,5,4,3,2,10,5,4,3,2,1};

	public void sort(int[] data, int low, int high) {
			
		if(low>=high){
			return;
		}
		 
		int split = (low + high) /2;
		
		sort(data,low,split);
		
		sort(data,split+1,high);
		
		int[] tempArr = new int[data.length];
		for(int i=low;i<=high;i++){
			tempArr[i] = data[i];
		}
		
		int m1 = low;
		int m2 = split+1;
		int i = low;
		
		while(m1<=split && m2<=high){
			if(tempArr[m1] < data[m2]){
				data[i++] = tempArr[m1++];
			}else{
				data[i++]= data[m2++];
			}
		}
		
		while(i<=high){
			data[i++] = tempArr[m1++];
		}
				
	}
}
