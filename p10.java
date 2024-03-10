//hashcode and identityhashcode

class StringDemo1{

	public static void main(String[] args){


		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}

//hashcode - only compares content of string so therefore if content is same hashcode will be same.
//Identityhashcode - gives a unique value to every object evenn if content is same.
