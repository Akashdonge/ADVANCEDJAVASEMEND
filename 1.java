class stringconcept {
    public static void main(String arg[]) {
        stringconcept sc = new stringconcept();
        String names[] = {"vardhu", "Adhya", "Nanu"};
        sc.joinwords(names);
    }
    
    // Method moved outside of main and corrected
    private void joinwords(String names[]) {
        StringBuffer sb = new StringBuffer(""); // Using StringBuffer to append strings
        String sentence = ""; // String for storing the sentence

        // Corrected for-each loop
        for (String name : names) {
            sb.append(name); // Append each name to the StringBuffer
            sentence += name; // Append each name to the sentence String
            System.out.println("StringBuffer code: " + sb.hashCode()); // Corrected hashCode() method
            System.out.println("String code: " + sentence.hashCode()); // Corrected hashCode() method
        }

        // Print the final results
        System.out.println("Final StringBuffer: " + sb.toString()); // Print the complete StringBuffer content
        System.out.println("Final String: " + sentence); // Print the complete String content
    }
}
