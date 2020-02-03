
public class Immutable {
public static void main(String[] args) {
	String str="Hello"; // this will be save in SCP
	
	str.concat(" Testing shastra"); // this will be saved in SCP but it will be unreferenced
	
	System.out.println(str);
}
}
