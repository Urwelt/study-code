import java.util.Scanner;

public class StringToStringBuffer {
    public static void main(String[] args) {
    	final String addString = "Best in";
    	
    	try(Scanner in = new Scanner(System.in)){
    		StringBuffer buf = new StringBuffer();
    		String inputStr = in.nextLine();
    		buf.append(addString);
    		buf.append(" ");
    		buf.append(inputStr); 
    		System.out.println(buf);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}    	    
   	}
}