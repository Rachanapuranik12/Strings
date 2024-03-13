class MytoCharArray{

	static void mytoCharArray(String str1){

		for(int i=0;i<str1.length();i++){

			System.out.print(str1.charAt(i));
		}

		System.out.println();
	}

	public static void main(String[] args){

		String str1 = "Rachana";

		mytoCharArray(str1);
	}
}
