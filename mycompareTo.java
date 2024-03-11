class mycompareTo{

	static int mycompareTo(String str1, String str2){

		int len1 = str1.length();
		int len2 = str2.length();

		for(int i=0;i<len1;i++){
			for(int j=0;j<len2;j++){

				if(str1.charAt(i)>str2.charAt(j)){
					return str1.charAt(i) - str2.charAt(j);
				}else if(str2.charAt(j)>str1.charAt(i)){
					return str2.charAt(j) - str1.charAt(i);
				}else{
					return 0;
				}
			}
		
		}
		return 0;
	}

	public static void main(String[] args){

		String str1 = "cello";
		String str2 = "hello";

		System.out.println(mycompareTo(str1,str2));
	}
}
