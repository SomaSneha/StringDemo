
public class EqualDemo {
public static void main(String[] args) {
	String s="hello";
	String t="Hello";  // saved in SCP both s and t refer to hello
	// == will compare the reference variable
	if(s==t) {
		System.out.println("Address are Equal");
	}else {
		System.out.println("not equal address");
	}
}
}
