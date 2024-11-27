package StringDemo;

public class StringReverse6 {

	public static void main(String[] args) {
		
		String str = "my name is Krishna";
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length()-1; i >= 0; i--) {
			
			sb.append(str.charAt(i));
		}
		
		System.out.println("Reversed String : "+sb);
	}
}
