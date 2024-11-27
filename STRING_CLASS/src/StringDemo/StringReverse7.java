package StringDemo;

import java.util.Scanner;

public class StringReverse7 {

	public static void main(String[] args) {
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the String : ");
		 str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i= str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		
		System.out.println("reversed String : "+sb);
	}
}
