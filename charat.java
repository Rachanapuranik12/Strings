class charAtDemo{

	static char mycharAt(String str, int index){

		char arr[] = str.toCharArray();
		if(index>=0 && index<str.length()){

			return arr[index];
		}else{
			return '\0';
		}
	}
	
	public static void main(String[] args){
		String str = "Rachana";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));

		int index = 5;

		System.out.println(mycharAt(str,index));

		
	}
}

