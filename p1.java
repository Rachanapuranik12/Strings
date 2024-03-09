class StringsDemo{

	public static void main(String[] args){

		String str1 = "Core2Web";  //goes in SCP - String Constant Pool
		String str2 = new String("Core2Web"); //goes in heap section

		char str3[] = {'C','2','W'}; //char array will go internally as int only.
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
