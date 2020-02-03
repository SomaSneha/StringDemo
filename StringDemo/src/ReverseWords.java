
public class ReverseWords {
public static void main(String[] args) {
	String str="Hello";
	String[] c=str.split(" ");
	for(String t:c) {
	for(int i=t.length()-1;i>=0;i--) {
		System.out.print(t.charAt(i));
	}
}
}
}