public class Strings {
    public static void main(String[] args) {
    
        //concatenation of strings
        String firstName = "Anuradha";
        String lastName = "Kumari";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);  

        //length of string
        int length = fullName.length();
        System.out.println("Length of Full Name: " + length);  

        //character at specific index
        char characterAtIndex = fullName.charAt(3);
        System.out.println("Character at index 3: " + characterAtIndex);

        //compare two strings
        boolean isEqual = firstName.equals(lastName);
        System.out.println("Are the  " + firstName + " and " + lastName + " equal? " + isEqual);

        //substring of string
        String substring = fullName.substring(0, 7);
        System.out.println("Substring of Full Name: " + substring);

    }

}
