//Concat function - Without using any predefined method.

class MyConcat{

		static String myConcat(String str1,String str2){
			String str3 = str1+str2;
			return str3;
		}

		public static void main(String[] args){

		String str1 = "hello";
		String str2 = "World";

		//String str = myConcat(str1,str2);

		System.out.println(myConcat(str1,str2));
	}
}
