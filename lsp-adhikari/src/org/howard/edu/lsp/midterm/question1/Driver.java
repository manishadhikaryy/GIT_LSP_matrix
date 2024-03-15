package org.howard.edu.lsp.midterm.question1;

/**
 * Driver class to test the functionality of the SecurityOps class.
 */
public class Driver {
    
    /**
     * Main method to test the encrypt method in the SecurityOps class.
     * 
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args) {
        // Test the encrypt method
        String text1 = "I love CSCI363";
        String encryptedText1 = SecurityOps.encrypt(text1);
        System.out.println("Encrypted text: " + encryptedText1);
        
        String text2 = "I don't love PHY311";
        String encryptedText2 = SecurityOps.encrypt(text2);
        System.out.println("Encrypted text: " + encryptedText2);
    }
}
