public class Solution {

	public static void main(String[] args) {
		
		if(args ==null || args.length==0){
			System.out.println("Input array should not be empty");
			return;
		}
		
		Solution solution = new Solution();
		System.out.println(solution.sumCommonInt(args));
		 
	}
	
	public int sumCommonInt(String[] args) {
		int high = -Integer.parseInt(args[0]);
		int low = Integer.parseInt(args[0]);

		// Find the minimum and maximum value in the given array
		for (int i = 0; i < args.length; i++) {
			int num = Integer.parseInt(args[i]);

			if (num < low) {
				low = num;
			}

			if (num > high) {
				high = num;
			}
		}

		//  Create a count array to store count of individual this will hold all possible values, from low to high
 		int[] counts = new int[high - low + 1];

		int maxIntNum = 0;
		int maxOccurrence  = 0;

		for (int i = 0; i < args.length; i++) {
			int index = Integer.parseInt(args[i]);
			// Store count of each integer in the given array and index minus(-) low so the lowest possible value is always 0
			counts[index - low]++;

			// Compare occurrence of current integer  with recorded highest occurrence, 
			// Reassign both maxIntNum and maxOccurrence if the occurrence of current integer has higher value 
			if (counts[index - low] > maxOccurrence) {
				maxIntNum = index;
				maxOccurrence = counts[index - low];
			}
		}

		return maxIntNum * maxOccurrence;
	}
}
