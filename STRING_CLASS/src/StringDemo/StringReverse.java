package StringDemo;

    // 1. create a String.
   // 2. create a object of string builder.
  // 3. create a for loop.
 // 4. append to string builder.
//5. print with  String builder object.

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "Krishna";
		
		StringBuilder obj = new StringBuilder();
		
		for (int i = str.length()-1; i>= 0; i--) {
			
			obj.append(str.charAt(i));
		}
		
		System.out.println("Reversed String is : "+obj);
	}
}

   