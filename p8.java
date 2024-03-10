//double equal to operator(==). 

class StringsOperator{

	public static void main(String[] args){

		String str1 = "rachana";
		String str2 = new String("rachana");

		if(str1 == str2){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		
		}

	}
}

/* double equal to compares the identity hashcode of 2 strings and not actual content
 * so answer is not equal even if content is same because a unique code is assigned to
 * each object.
 */
