package Practice;

public class stringfunctions {

	public static void main(String[] args) {
		String str ="vikram";
		System.out.println(str.length());//prints 6

		String s1="vik";
		String s2="ram";
		String s3=s1.concat(s2);//concatenates strings s1 &s2
		System.out.println(s3);
		
		System.out.println(str.indexOf("k"));//prints 2
		System.out.println(str.charAt(5));//prints m
		System.out.println(str.toUpperCase());//converts uppercase
		System.out.println(str.toLowerCase());//converts Lowercase
	}

	
}
