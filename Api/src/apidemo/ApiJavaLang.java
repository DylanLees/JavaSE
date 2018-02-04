package apidemo;

public class ApiJavaLang {
	public static void main(String[] args) {
		/*e70 Constructing a String
		 * if you are constructing a String several appends,it may be more efficient to construct it using a
		 * StringBuffer and then convert it to an immutable String object.
		 * */
		
		StringBuffer buf=new StringBuffer("java");
		//Append
		buf.append("Almanac v1/");     //java Almanac v1/
		buf.append(3);                 //java Almanac v1/3
		
		//Set
		int index=15;
		buf.setCharAt(index,'.');     //java Almanac v1.3
		
		//Insert
		index=5;
		buf.insert(index, "Developers");  //java Developers Almanac v1.3
		
		//Replace
		int start=27;
		int end=28;
		buf.replace(start, end, "4");     //java Developers Almanac v1.4
		
		//Delete
		start=24;
		end=25;
		buf.delete(start, end);      //java Developers Almanac v1.4
		
		//Convert to String
		String s=buf.toString();
		/*   e71 Comparing Strings
		 * see also e306 comparing Strings in a Locale-Independent Way.
		 * 
		 * */
		String s1="a";
		String s2="A";
		String s3="B";
		
		//check if identical，判断两个字符串是否相等
		boolean b=s1.equals(s2);  //false
		
		//check if identical ignore case,忽略大小，判断两个字符串是否相等
		b=s1.equalsIgnoreCase(s2);  //true
		
		//check order of two Strings ，对两个字符串进行比较排序
		int i=s1.compareTo(s2);   //32;lowercase follows uppercase
		if(i<0){
			//s1 precedes s2
		}else if(i>0){
			//s1 follows s2
		}
		else{
			//s1 equals s2
		}
		
		//check order of two String ignoring case
		i=s1.compareToIgnoreCase(s3);  //-1
		if(i<0){
			//s1 precedes s3
		}else if(i>0){
			//s1 follows s3
		}else{
			//s1 equals s3
		} 
		
		//a String can also be compared with a StringBuffer
		//see e70 Constructing a String
		StringBuffer sbuf=new StringBuffer("a");
		b=s1.contentEquals(sbuf);   //true
		
		/* e72 Determining If a String Contains a Substring 
		 * see also e423 Quintessential Regular Expression Search Program
		 *   */
		String string="Madam, I am Adam";
		//starts with
		boolean c=string.startsWith("mad"); //true
		//ends with
		c=string.endsWith("dam");
		//anywhere
		c=string.indexOf("i am")>0; //true
		//To ignore case ,regular expressions must be used
		//starts with
		c=string.matches("(?i)mad.*");
		//ends with
		c=string.matches("(?i).*adam");
		//anywhere
		c=string.matches("(?i).*i am.*");
	}
	
}
