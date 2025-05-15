package Intro;

import java.util.HashMap;
import java.util.Map;

public class gpt {

	public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Step 1: Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first character with count = 1
        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch; // Return immediately when we find the first unique character
            }
        }

        return '\0'; // Return null character if no unique character is found
    }

    public static void main(String[] args) {
        String str = "swiss";
        char result = findFirstNonRepeatedChar(str);
        
        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No unique character found.");
        }
    }
}
