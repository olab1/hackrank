public class MergeSortTest {

	public static void main(String[] args) {
		int[] data = new int[] {10,9,8,7,6,5,4,3,2,1,0};
				//{ 5, 3, 6, 2, 1, 9, 4, 8, 7 };
		print(data);
		sort(data, 0, data.length - 1);
		System.out.println("排序后的数组：");
		print(data);
	}

	 

	public static void sort(int[] data, int left, int right) {
		if (left >= right)
			return;
		// 找出中间索引
		int split = (left + right) / 2;
		// 对左边数组进行递归
		sort(data, left, split);
		// 对右边数组进行递归
		sort(data, split + 1, right);
		// 合并
		int[] tmpArr = new int[data.length];
		// 右数组第一个元素索引
		int mid = split + 1;
		// third 记录临时数组的索引
		int tempArrIndex = left;
		// 缓存左数组第一个元素的索引
	    int tmp1 = left;
	    
		while (left <= split && mid <= right) {
			// 从两个数组中取出最小的放入临时数组
			if (data[left] <= data[mid]) {
				tmpArr[tempArrIndex++] = data[left++];
			} else {
				tmpArr[tempArrIndex++] = data[mid++];
			}
		}
		// 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
		while (mid <= right) {
			tmpArr[tempArrIndex++] = data[mid++];
		}
		while (left <= split) {
			tmpArr[tempArrIndex++] = data[left++];
		}
		// 将临时数组中的内容拷贝回原数组中
		// （原left-right范围的内容被复制回原数组）
		
		
		while (tmp1 <= right) {
			data[tmp1] = tmpArr[tmp1];
			tmp1++;
		}
		print(data);
	}

 

	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
	}

}