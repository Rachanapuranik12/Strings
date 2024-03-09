//Take input of string from user and print it using BufferedReader.

import java.io.*;
class StringInput{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter any string");

		String str = br.readLine();

		System.out.println(str);
	}
}
