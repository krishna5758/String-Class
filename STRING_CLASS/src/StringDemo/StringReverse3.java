package StringDemo;

public class StringReverse3 {

	public static void main(String[] args) {
		
		String str = "Kulkarni";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--) {
			
			sb.append(str.charAt(i));
		}
		
		System.out.println("Reversed Styring : "+sb);
	}
}
