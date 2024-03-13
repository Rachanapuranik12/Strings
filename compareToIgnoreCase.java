class mycompareToIgnoreCase{


        public static int mycompareToIgnoreCase(String str1, String str2) {
    int minLength = Math.min(str1.length(), str2.length());
    
    // Iterate through each character of the strings
    for (int i = 0; i < minLength; i++) {
        
	   char char1 = str1.charAt(i);
	   char char2 = str2.charAt(i);

	   int diff = char1-char2;
        // Compare characters
        if (diff == -32 || diff == 32){
		return 0;
	}else{
		return diff;
	}
    }
    
    // If the common prefix is the same, return the difference in lengths
    return str1.length() - str2.length();
}



        public static void main(String[] args){

                String str1 = "RACHANA";
                String str2 = "rachana";

                System.out.println(mycompareToIgnoreCase(str1,str2));
        }
}
