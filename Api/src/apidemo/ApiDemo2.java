package apidemo;

import java.io.UnsupportedEncodingException;

public class ApiDemo2 {
	public static void main(String[] args) {
		// e77 Converting a String to Upper or Lower case;
		// Convert to Upper case ,转换为大写字母
		String string = "abcdef";
		String upper = string.toUpperCase();
		// Convert to Lower case ,转换为小写字母
		String lower = string.toLowerCase();
		/*
		 * e78 Converting a primitive type value to a String there are two ways
		 * to convert a primitive type value into a string.The explicit way is
		 * to call String.valueOf().The implicit way is to use the string
		 * concatenation operator '+'.
		 */
		// use String.valueOf();
		String s = String.valueOf(true); // true
		System.out.println(s);
		s = String.valueOf((byte) 0x12); // 18
		System.out.println(s);
		s = String.valueOf((byte) 0xff); // -1
		System.out.println(s);
		s = String.valueOf('a'); // a
		System.out.println(s);
		s = String.valueOf((short) 123);// 123
		System.out.println(s);
		s = String.valueOf(123);// 123
		s = String.valueOf(123L);// 123
		s = String.valueOf(1.23F);// 1.23
		s = String.valueOf(1.23D);// 1.23

		// use +
		s = " " + true;// true
		s = " " + (byte) 0x12;
		s = " " + (byte) 0xff;
		s = " " + 'a';
		s = " " + (short) 123;
		s = " " + 123;
		s = " " + 123L;
		s = " " + 1.23F;
		s = " " + 1.23D;
		System.out.println(s);

		// e79 Converting between Unicode and UTF-8
		try {
			// convert from Unicode to UTF-8
			String str = "abc\u5639\u563b";
			byte[] utf8 = str.getBytes("UTF-8");
			// convert from UTF-8 to Unicode
			str = new String(utf8, "UTF-8");

		} catch (UnsupportedEncodingException e) {

		}

		// e80 Determining a Character's Unicode Block
		char ch = '\u5639';
		Character.UnicodeBlock block = Character.UnicodeBlock.of(ch);
		
		//e81 some examples
		boolean b=isJavaIdentifier("my_var"); //true
		System.out.println(b);
		b= isJavaIdentifier("my_var.1");//false
		System.out.println(b);
		b= isJavaIdentifier("$my_var");  //true
		System.out.println(b);
		b= isJavaIdentifier("\u0391var"); //true
		System.out.println(b);
		b= isJavaIdentifier("_");  //true
		System.out.println(b);
		b= isJavaIdentifier("$");  //true
		System.out.println(b);
		b= isJavaIdentifier("1$my_var");  //false
		System.out.println(b);

	}

	/*
	 * Determining if a String Is a Legal Java Identifier Briefly,a valid
	 * identifier must start with a Unicode letter,underscore,or dollar sign($).
	 * The other characters ,if any, can be Unicode letter,underscore,dollar
	 * sign($),or digit.
	 */

	// Return true if s is a Java identifier.
	public static boolean isJavaIdentifier(String s) {
		if (s.length() == 0 || !Character.isJavaIdentifierStart(s.charAt(0))) {
			return false;
		}
		for (int i = 1; i < s.length(); i++) {
			if (!Character.isJavaIdentifierPart(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
