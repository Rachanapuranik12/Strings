class equalsIgnoreCaseDemo{

	static boolean myequalsIgnoreCase(String str1, String str2)
	
	{
		if(str1.length()!=str2.length()){
			return false;
		}
	
		int minlength = Math.min(str1.length(), str2.length());

		for(int i=0;i<minlength;i++){
			char char1 = str1.charAt(i);
			char char2 = str2.charAt(i);

			int diff = char1-char2;

			if(diff == -32 || diff == 32){
				return true;
			
		}
		}
		return false;
	}
		


	public static void main(String[] args){

		String str1 = "RACHANA";
		String str2 = "rachana";

		System.out.println(myequalsIgnoreCase(str1,str2));

		//]System.out.println(str1.equalsIgnoreCase(str2));
	}
}
