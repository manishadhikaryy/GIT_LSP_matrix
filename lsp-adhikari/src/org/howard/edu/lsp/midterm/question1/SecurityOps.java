package org.howard.edu.lsp.midterm.question1;

/**
 * Utility class for security operations.
 */
public class SecurityOps {
    
    /**
     * Encrypts the given text by filtering out non-letter and non-digit characters,
     * then constructing a new string by alternating even and odd characters.
     *
     * @param text the text to encrypt
     * @return the encrypted text with even and odd characters alternating
     */
    public static String encrypt(String text) {
        String filteredText = "";
        String evenChars = "";
        String oddChars = "";

        // Filter out non-letter and non-digit characters
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                filteredText += c;
            }
        }

        // Construct even and odd characters
        for (int i = 0; i < filteredText.length(); i++) {
            char c = filteredText.charAt(i);
            if (i % 2 == 0) {
                evenChars += c;
            } else {
                oddChars += c;
            }
        }

        return evenChars + oddChars;
    }
}
