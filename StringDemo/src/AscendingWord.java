/* Convert string into Ascending order*/


public class AscendingWord {
public static void main(String[] args) {
	
	String str="Hello Testing Shastra";
	String name=str.toLowerCase();
	char[] asc=name.toCharArray();
	for(int i=0;i<asc.length;i++) {
		for(int j=i+1;j<asc.length;j++) {
			if(asc[i]>asc[j]) {
				char temp=asc[i];
				asc[i]=asc[j];
				asc[j]=temp;
			}
		}
		
	}
	for(int i=0;i<asc.length;i++) {
		System.out.print(asc[i]);
	}

}
}