class MyEqualsDemo{

	 static boolean myEquals(String str1, String str2){

		 int minlength = Math.min(str1.length(),str2.length());

		 for(int i=0;i<minlength;i++){
			 char char1 = str1.charAt(i);
			 char char2 = str2.charAt(i);

			 if(char1 == char2){
				 return true;
			 }else{
				 return false;
			 }
			 
		 }
		return false;
	 }

	 public static void main(String[] args){

		 String str1 = "Abcd";
		 String str2 = new String("Abcd");

		 System.out.println(myEquals(str1,str2));
	 }
}
