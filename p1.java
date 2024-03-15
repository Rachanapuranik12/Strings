/* Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
 */

import java.io.*;
class Problem1{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array");
		int size = Integer.parseInt(br.readLine());

		String arr[] = new String[size];

		int len=0;

		System.out.println("Enter Strings:");

		for(int i=0;i<size;i++){
			arr[i] = br.readLine();

			len = len+arr[i].length();
		}

		System.out.println(len);
	}
}

