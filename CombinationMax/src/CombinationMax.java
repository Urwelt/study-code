import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class CombinationMax {
    public static void main(String[] args) {    	
    	
    	try(Scanner in = new Scanner(System.in)){
    		String[] inputLine = in.nextLine().split(" ");
    		int[] inputNum = Stream.of(inputLine).mapToInt(Integer::parseInt).toArray();
    		List<Integer> list = new ArrayList<>();
    		
    		for(int num : inputNum) list.add(num);    		    		
    		Collections.sort(list , (a,b) -> b-a);
    		int sum = list.get(0) * 10 + list.get(list.size()-1) +
    				list.get(1) * 10 + list.get(list.size()-2);    		    	
    		System.out.println(sum);    		    		
    	}catch(Exception e) {
    		e.printStackTrace();
    	}    	    
   	}
}