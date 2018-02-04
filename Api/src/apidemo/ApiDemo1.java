package apidemo;

public class ApiDemo1 {
	public static void main(String[] args) {
		/*
		 * Getting a Substring from a String
		 */
		int start = 1;
		int end = 4;
		String substr = "aString".substring(start, end); // str,截取字符串，从起始值开始,但不包含最后end.
		System.out.println(substr);
		
		/* 
		 * searching a string for a character or a substring
		 *   */
		String string= "Madam,i am Adam";
		//character
		//first occurrence of a c
		int index=string.indexOf("a"); //1
		System.out.println(index);
		//last occurrence 
		index=string.lastIndexOf("a");  //14
		System.out.println(index);
		//notfound
		index=string.lastIndexOf("z");//-1
		System.out.println(index); 
		//substrings
	//first occurrence 第一个出现
		index=string.indexOf("dam");
		System.out.println(index);  //2
		//last occurrence  最后一个出现
		index=string.lastIndexOf("dam"); //12
		System.out.println(index);
		//notfound  未找到
		index=string.indexOf("z");
		System.out.println(index);
		
		/*e75 replacing character in a String
		 * since Strings are immutable ,the replace() method create a new String with the replaced characters
		*/
		// replacing all occurrence of "a" with "o"
		String newstring=string.replace('a','o');
		//e77 Converting a String to Upper or Lower case;
		//Convert to Upper case
		String upper=string.toUpperCase();
		
	}
	//e76 replacing substrings in a string
			//see also e429 quintessential regular expression search and replace program
	static String replace(String str,String pattern,String replace){
		int s=0;
		int e=0;
		StringBuffer result=new StringBuffer();//实例化缓存流StringBuffer
		while((e=str.indexOf(pattern,s))>=0){
			result.append(str.substring(s,e));
			result.append(replace);
			s=e+pattern.length();
		}
		result.append(str.substring(s));
		return result.toString();
	}
}
