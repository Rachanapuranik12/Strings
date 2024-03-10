class StringDemo{
	public static void main(String[] args){

		String str1 = "rachana";
		String str2 = "puranik";

		System.out.println(str1+str2);

		String str3 = "rachanapuranik";
		String str4 = str1+str2;

		System.out.println(System.identityHashCode(str3));

		System.out.println(System.identityHashCode(str4));
	}

}
/* 
 * Both  identity hash codes will be different even if content is same.
 * String str4 = str1+str2, here
 * String  str4 - of String class
 * str1+str2 = internally calls a method - append() - which is of StringBuilder class
 * But same type of class is required on both sides - so
 * append() calls a newString and so a new String object can be assigned to another class(i.e String class).
 */

