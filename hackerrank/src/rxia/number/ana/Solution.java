package rxia.number.ana;

import java.util.*;

public class Solution {

	static Scanner scanner = new Scanner(System.in);
	//I am here
	public static void main(String[] args) { //aa
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Solution  solution = new Solution();
		solution.execute();
		
		
		 
	}

	public void execute(){
		
		//fcrxzwscanmligyxyvym
		
		//jxwtrhvujlmrpdoqbisbwhmgpmeoke
		String s1 = "fcrxzwscanmligyxyvym";//getString1();
		String s2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";//getString2();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Map<Character,Integer> m1 = new HashMap<Character, Integer>();
		for(char c: c1){
			if(!m1.containsKey(c)){
				m1.put(c,1 );
			}else{
				int val = m1.get(c);
				val++;
				m1.put(c, val);
			}
		}
		
		Map<Character,Integer> m2 = new HashMap<Character, Integer>();
		for(char c: c2){
			if(!m2.containsKey(c)){
				m2.put(c,1 );
			}else{
				int val = m2.get(c);
				val++;
				m2.put(c, val);
			}
		}
		int total  = s1.length()+s2.length();
		for (int i =  'a'; i<='z'; i++ ){
			char ch = (char)i;
			
			int t1= m1.get(ch)==null?0:m1.get(ch);
			int t2 =m2.get(ch)==null?0:m2.get(ch);
			
			int temp = 2 * (Math.max(t1, t2) - (int)Math.abs(t1-t2));
			
			total = total -temp;
//			if(m1.get(ch) !=0 && m2.get(ch) !=0){
//				if(m1.get(ch)  == m2.get(ch)  ){
//					total = total+2;
//				}
//			}
		}
		
		System.out.println(total);
	}
	 
    public String getString1(){
    	return scanner.nextLine();
    }
    
    public String getString2(){
    	return scanner.nextLine();
    }

}