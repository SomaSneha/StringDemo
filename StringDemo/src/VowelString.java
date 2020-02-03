
public class VowelString {
public static void main(String[] args) {
	String str="Hello Testing shastra";
	int count=0;
	char[] a=str.toCharArray();
	for(int i=0;i<str.length();i++) {
		if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U') {
			//System.out.println("vowel");
			count++;
	}
		if(count>0) {
			System.out.println("vowel: " +a[i]);
			}
	}
		System.out.println("There are "+count+" vowels");
}
}

