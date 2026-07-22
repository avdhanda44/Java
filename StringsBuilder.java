public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString());
        
        // Insert a string at a specific index
        sb.insert(5, ",");
        System.out.println(sb.toString());

        // Replace a substring
        sb.replace(5, 6, "!");
        System.out.println(sb.toString());

        // Delete a substring
        sb.delete(5, 6);
        System.out.println(sb.toString());

        // Reverse the string
        sb.reverse();
        System.out.println(sb.toString());

        // Get the length of the string
        int length = sb.length();
        System.out.println("Length of StringBuilder: " + length);

        // Convert StringBuilder to String
        String str = sb.toString();
        System.out.println("Converted String: " + str);

        // Convert String to StringBuilder
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println("Converted StringBuilder: " + sb2.toString());

        // Clear the StringBuilder
        sb.setLength(0);
        System.out.println("Cleared StringBuilder: " + sb.toString());

        // Check if StringBuilder is empty
        boolean isEmpty = sb.length() == 0;
        System.out.println("Is StringBuilder empty? " + isEmpty);

        // Append multiple strings
        sb.append("Java").append(" is").append(" awesome!");
        System.out.println(sb.toString());

        // Insert a string at the beginning
        sb.insert(0, "Learning ");
        System.out.println(sb.toString());

        // Replace a substring with another string
        sb.replace(9, 11, "rocks");
        System.out.println(sb.toString());        
    }
    
}
