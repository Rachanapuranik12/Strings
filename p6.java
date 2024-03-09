class CacheDemo{
	public static void main(String[] args){

		char ch='A';
		int x=65;


		System.out.println(System.identityHashCode(ch));

		System.out.println(System.identityHashCode(x));
	}

}
//It prints different hashcode for both char and int, because hashcode internally calls a method
//valueof() whic is actully responsible creating new string objects.
//and whenever new keyword is used new object will be created even if content is same so different hashcodes 
//are printed.

