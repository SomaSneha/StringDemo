
public class Replace_digit_special_Chr {

	public static void main(String[] args) {
		String s="jjhigjdnkjnkj12!@%^&132a627";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (Character.isDigit(ch) || !Character.isLetterOrDigit(ch)) {
				System.out.print("X");
				
			}else {
				System.out.print(ch);
			}
			
		}

	}

}
 