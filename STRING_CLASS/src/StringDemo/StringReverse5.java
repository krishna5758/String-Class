package StringDemo;

public class StringReverse5 {

	public static void main(String[] args) {
		
		String str = "Krishna";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = str.length()-1; i >= 0; i--) {
			
			sb.append(str.charAt(i));
		}
		
		System.out.println("Revered String :  "+sb);
	}
}
