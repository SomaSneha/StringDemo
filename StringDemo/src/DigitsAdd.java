/* Add digits from String */
 
import java.lang.*;
import java.util.Scanner;

public class DigitsAdd {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string:");
	String str=sc.nextLine();
	
	int count=0;
    for(int i=0;i<str.length();i++) {
    	
    	if(Character.isDigit(str.charAt(i))) {
    		
    		count=count+Integer.parseInt(String.valueOf(str.charAt(i)));
    			
    	}
    }

System.out.println(count);

}

}
