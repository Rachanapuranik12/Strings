class StringDemo{
	public static void main(String[] args){
	
	String str1 = "Core2Web";

	String str2 = new String("Core2Web");

	String str3 = "Core2Web";

	String str4 = new String("Core2Web");

	System.out.println(System.identityHashCode(str1));

	System.out.println(System.identityHashCode(str2));

	System.out.println(System.identityHashCode(str3));

	System.out.println(System.identityHashCode(str4));

	}
}

/* Hashcode - gives a unique number to every object
 * str1 and str3 goes in scp and in scp no duplicate objects are there so if both strings are having same content
 * then only 1 object will be created - so str1 and str3 hashcode will be same.
 * str2 and str4 both are created using new keyword so whenever new keyword is used a new object will be created everytime
 * even if content is same.
 */
