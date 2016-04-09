import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SolutionTest {
	
	String[] nums;
	Solution solution;
	
	@Before
	public void setup(){
		solution = new Solution();
	}
	
	@Test
	public void sumCommonIntCaseOneTest(){
		nums = new String[] { "1", "2", "3", "4", "5", "1", "8"};
		int total = solution.sumCommonInt(nums);
		Assert.assertEquals(2, total);
	}
	
	@Test
	public void sumCommonIntCaseTwoTest(){
		nums = new String[] { "9", "2", "2", "4", "5", "1", "2","6"};
		int total = solution.sumCommonInt(nums);
		Assert.assertEquals(6, total);
	}
	
	@Test
	public void sumCommonIntCaseThreeTest(){
		nums = new String[] { "2", "2", "5", "4", "5", "1", "8","5"};
		int total = solution.sumCommonInt(nums);
		Assert.assertEquals(15, total);
	}
	
	@Test
	public void sumCommonIntCaseFourTest(){
		nums = new String[] { "3", "6","2", "3","6", "4", "5","6", "1","6", "8"};
		int total = solution.sumCommonInt(nums);
		Assert.assertEquals(24, total);
	}
	
	@Test
	public void sumCommonIntCaseFiveTest(){
		nums = new String[] {"3"};
		int total = solution.sumCommonInt(nums);
		Assert.assertEquals(3, total);
	}
	
	@Test
	public void sumCommonIntCaseSixTest(){
		nums = new String[] {"3","2","3"};
		int total = solution.sumCommonInt(nums);
		Assert.assertEquals(6, total);
	}
}
