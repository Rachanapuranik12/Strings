class lengthDemo{

	static int myLength(String str1){

	int len=0;
	
	for (char c : str1.toCharArray()) {
            // Increment length for each character
            len++;
        }

	return len;
	}


	public static void main(String[] args){

		String str1 = "rachana";
		System.out.println(str1.length());	//with using predefined function.
		int len = myLength(str1);	//without using predefined length function.
		System.out.println(len);
		}
}
