import java.util.Arrays;

public class CountingSort{
 
	public static void main(String[] args) {
		CountingSort cs = new CountingSort();
		cs.sort();
	}
	
	private int[] data = new int[]
		 {3,4,5,6,7,5,4,3,2,10,5,4,3,2,1,-1};
	
	public void sort(){
		
		System.out.println(Arrays.toString(data));
		
		
		int min = data[0], max = data[0];
		
		for(int i=0;i<data.length;i++){
			if(data[i] >= max){
				max = data[i];
			}else if(data[i]<=min){
				min = data[i];
			}
		}
		
		int[] bucket  = new int[max-min+1];
		for(int i=0;i<data.length;i++){
			int index = data[i]-min;
			bucket[index] ++; 
		}
		
	//	System.out.println(Arrays.toString(bucket));
		
		int current = 0;
		for(int i=0;i<bucket.length;i++){
//			 for(int j=0; j<bucket[i];j++){
//				 data[pos++] = i+min;
//			 } 
//			 
			 Arrays.fill(data, current, current + bucket[i],   i+min); // fills counts[i] elements of value i + low in current
		     current += bucket[i]; // leap forward by counts[i] steps
		}
		
		System.out.println(Arrays.toString(data));
	}
	
	
}