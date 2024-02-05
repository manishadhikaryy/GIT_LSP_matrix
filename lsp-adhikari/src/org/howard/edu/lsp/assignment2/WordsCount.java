// Name: Manish Adhikari

package org.howard.edu.lsp.assignment2;


import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class WordsCount {

	public static void main(String[] args) {
		
		String filePath = "lsp-adhikari/src/words.txt";
		
//		String inputString = "My name is Manish manish 123";
		
		HashMap<String, Integer> wordCount = new HashMap<>();
		
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            
			String line;
           
			while ((line = reader.readLine()) != null) {
		
		
		
        String[] inputWords = line.split("[\\s']+");
		
		for (String word: inputWords) {
			
			word = word.toLowerCase();
			
			if (isAlpha(word) && word.length() > 3) {
			
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
			}
		}
            }
		}
            catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
		
//		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

		wordCount.forEach((key, value) -> System.out.println(key + " " + value));		
		
		
	}
	
	 private static boolean isAlpha(String str) {
	        return str.matches("[a-zA-Z]+");
	    }

}
