/* Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
*/

import java.io.*;
class Problem2{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		String str = br.readLine();

		String result="";

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='e'){
				result = result+'i';
			}else{
				result = result+str.charAt(i);
			}
		}

		System.out.println(result);
	}
}
