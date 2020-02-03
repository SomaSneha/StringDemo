
public class StringDemo1 {
public static void main(String[] args) {
	String s="hello";
	String t="Hello";  // saved in SCP both s and t refer to hello
	// equal will compare the content
	if(s.equals(t)) {
		System.out.println("Address are Equal");
	}else {
		System.out.println("not equal address");
	}
}
}
