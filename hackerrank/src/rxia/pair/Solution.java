package rxia.pair;

import java.util.*;

public class Solution {
	
    static long pairs(long[] a,long k) {
      /* Complete this function */
    	Map<Long,Long> mapsBase = new HashMap<Long, Long>();
    	for(long x:a){
    		mapsBase.put(x, 0L);
    	}
    	
    	Map<Long,Long> mapsMinK = new HashMap<Long, Long>();
    	for(long x:a){
    		mapsMinK.put(x, x-k);
    	}
    	
    	Map<Long,Long> mapsPlusK = new HashMap<Long, Long>();
    	for(long x:a){
    		mapsPlusK.put(x, x+k);
    	}
    	
    	
     	
    	Set<String> totals = new TreeSet<String>();
    	
    	for(long min:mapsMinK.keySet()){
    		if(mapsBase.containsKey(mapsMinK.get(min))){
    			long x = min;
    			long y = mapsMinK.get(min);
    			String str = x>y?(x+","+y):(y+","+x);
    			totals.add(str);
    		}
    	}
    	
    	for(long max:mapsPlusK.keySet()){
    		if(mapsBase.containsKey(mapsPlusK.get(max)) ){
    			long x = max;
    			long y = mapsPlusK.get(max);
    			String str = x>y?(x+","+y):(y+","+x);
    			totals.add(str);
    		}
    	}
    	
        return totals.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long res;
        
        String n = in.nextLine();
        String[] n_split = n.split(" ");
        
        long _a_size = Long.parseLong(n_split[0]);
        long _k = Long.parseLong(n_split[1]);
        
        long[] _a = new long[(int) _a_size];
        long _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Long.parseLong(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = pairs(_a,_k);
        System.out.println(res);
    }
}