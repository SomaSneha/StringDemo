

//convert first letter in capital other in small

import java.lang.*;
public class FirstCaps {
public static void main(String[] args) {
	String str="hEllow TEsting shastRa";
	String[] ch=str.split(" ");

	for(int i=0;i<ch.length;i++) {
		ch[i]=(ch[i].substring(0,1).toUpperCase())+(ch[i].substring(1).toLowerCase());
		
	}
	System.out.print(String.join(" ",ch));
}
}
