//Without using + operator - concat

class MyConcat1{

	public static void main(String[] args){
		
		String str1="hello";
		String str2="World";

		int len1 = str1.length();
		int len2 = str2.length();

		//creating char array to store concatenated strings.

		char result[] = new char[len1+len2];

		//copy char from 1st string
		for(int i=0;i<len1;i++){
			result[i] = str1.charAt(i);
		}

		//copy char from 2nd string
		for(int i=0;i<len2;i++){
			result[len1+i] = str2.charAt(i);
		}

		for(int i=0;i<result.length;i++){
		//String newstr = new String(result);

		System.out.print(result[i]);
		}
		System.out.println();

}
}

