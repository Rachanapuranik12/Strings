class SubstringDemo{

	static void mySubstring(String str, int sindex, int eindex){
		

			for(int j=sindex;j<eindex;j++){

				System.out.print(str.charAt(j));
			}
			System.out.println();
	}




	public static void main(String args[]){

		String str = "Core2Web Tech";
		mySubstring(str,5,10);
		mySubstring(str,0,3);
		mySubstring(str,0,13);

	//	System.out.println(str.substring(5));
	//	System.out.println(str.substring(0,3));
	}
}
