package rxia.number.ana;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static org.mockito.Mockito.*;

import org.apache.commons.io.FileUtils;
import org.junit.Test;


public class TestCase {
	
	@Test
	public void startTEST() throws IOException{//aaaaa
		File file = new File("src\\rxia\\play\\number/sample.txt");
		//THIS IS RXIA TEST
		Solution solution = spy(  new Solution());
		List<String> lines = FileUtils.readLines(file);
		System.out.println(lines);
		//int[] x = new int[5000*100000*10];
		// doReturn(new Integer(Integer.parseInt(lines.get(0)))).when(solution).getLengthN();
		// doReturn(convert(lines.get(1).trim().split(" "))).when(solution).getArrayN(Long.parseLong(lines.get(0)));
		// doReturn(new Integer(Integer.parseInt(lines.get(2)))).when(solution).getLengthQ();
		// doReturn(convert(lines.get(3).trim().split(" "))).when(solution).getArrayQ(Long.parseLong(lines.get(2)));
		
		// System.out.println(solution.getLengthN()+" "+solution.getLengthQ());
		//solution.execute();
 		System.out.println("aa");
	}
	
	private Long[] convert(String[] array){
		Long[] temp = new Long[array.length];
		int x = 0;
		for(String a: array){
			temp[x++] = Long.parseLong(a);
		}
		return temp;
	}
}
