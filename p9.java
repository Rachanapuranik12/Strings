//Equals method

class StringMethod{
	public static void main(String[] args){

		String str1 = "abc";
		String str2 = new String("abc");

		if(str1.equals(str2)){
			System.out.println("Equal");
		}else{
			System.out.println("Not equals");
		}
	}
}

//This method compares actual content of 2 strings so it will return equal.
