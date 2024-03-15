/* Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/

import java.io.*;
class Problem3{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your email:");
		String str = br.readLine();
		
		System.out.print("Username is: ");

		for(int i=0;i<str.length();i++){

			if(str.charAt(i) == '@'){
				break;
			}else{
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
	}
}

