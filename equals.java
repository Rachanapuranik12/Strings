class EqualsDemo{
	public static void main(String[] args){

		String str1 = "efgh";
		String str2 = new String("Abcd");

		System.out.println(str1.equals(str2));
	}
}

//This methhod only checks the content of 2 strings even if boths strings goes in
//different locations inside JVM.

