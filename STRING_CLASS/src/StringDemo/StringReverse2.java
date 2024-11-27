package StringDemo;

public class StringReverse2 {

	public static void main(String[] args) {
		
		String str = " I  am a Java Developer";
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length()-1; i >= 0; i--) {
			
			sb.append(str.charAt(i));
			
			
		}
		System.out.println("Reversed String : "+sb);
	}
}
