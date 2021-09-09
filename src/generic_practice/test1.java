package generic_practice;

import java.util.ArrayList;

public class test1 {
	
	public static void main(String[] args) {
		String s1 = "sukkiriJava";
		String s2 = "Java";
		String s3 = "java";
		
		if(s2.equals(s3)) {
			System.out.println("s2 = s3");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2 = se without case");
		}
		System.out.println("s1 length is " + s1.length() + " .");
		if(s1.isEmpty()) {
			System.out.println("s1 is empty.");
		}
		
		String s4 = "Java and JavaScript";
		if (s4.contains("Java")) {
			System.out.println("s4 contains Java");
		}
		if (s4.endsWith("Java")) {
			System.out.println("s4 ends with Java");			
		}
		System.out.println("s4 has Java in the number of " + s4.indexOf("Java") + ".");
		System.out.println("s4 has Java in the number of " + (s4.length() - s4.lastIndexOf("Java") - 1) + " in reverse order.");
		
		String s5 = "Java programming";
		System.out.println("the letter after 4th in s5 are " + s5.substring(3));
		System.out.println("the first 4th letter in s5 are " + s5.substring(0,5));
		
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; ++i) {
			sb.append("java");
		}
		String s = sb.toString();
		System.out.println(s);
		
		StringBuilder sb2 = new StringBuilder();
		for (int i = 1; i <= 100; ++i) {
			sb2.append(i);
			sb2.append(",");
		}
		String a = sb2.toString();
		System.out.println(a);

		
	
	}

}
