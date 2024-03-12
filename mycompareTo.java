class mycompareTo{


        public static int mycompareTo(String str1, String str2) {
    int minLength = Math.min(str1.length(), str2.length());

    // Iterate through each character of the strings
    for (int i = 0; i < minLength; i++) {
        char char1 = str1.charAt(i);
        char char2 = str2.charAt(i);

        // Compare characters
        if (char1 != char2) {
            return char1 - char2;
        }
    }

    // If the common prefix is the same, return the difference in lengths
    return str1.length() - str2.length();
}
        public static void main(String[] args){

                String str1 = "mychar";
                String str2 = "myc";

                System.out.println(mycompareTo(str1,str2));
        }
}
