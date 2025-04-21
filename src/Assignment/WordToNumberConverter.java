package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordToNumberConverter {
    private static final Map<String, Integer> wordsToNumbers = new HashMap<>();
    private static final Map<String, Integer> multipliers = new HashMap<>();

    static {
        // Basic numbers
        wordsToNumbers.put("zero", 0);
        wordsToNumbers.put("one", 1);
        wordsToNumbers.put("two", 2);
        wordsToNumbers.put("three", 3);
        wordsToNumbers.put("four", 4);
        wordsToNumbers.put("five", 5);
        wordsToNumbers.put("six", 6);
        wordsToNumbers.put("seven", 7);
        wordsToNumbers.put("eight", 8);
        wordsToNumbers.put("nine", 9);
        wordsToNumbers.put("ten", 10);
        wordsToNumbers.put("eleven", 11);
        wordsToNumbers.put("twelve", 12);
        wordsToNumbers.put("thirteen", 13);
        wordsToNumbers.put("fourteen", 14);
        wordsToNumbers.put("fifteen", 15);
        wordsToNumbers.put("sixteen", 16);
        wordsToNumbers.put("seventeen", 17);
        wordsToNumbers.put("eighteen", 18);
        wordsToNumbers.put("nineteen", 19);
        wordsToNumbers.put("twenty", 20);
        wordsToNumbers.put("thirty", 30);
        wordsToNumbers.put("forty", 40);
        wordsToNumbers.put("fifty", 50);
        wordsToNumbers.put("sixty", 60);
        wordsToNumbers.put("seventy", 70);
        wordsToNumbers.put("eighty", 80);
        wordsToNumbers.put("ninety", 90);

        // Multipliers
        multipliers.put("hundred", 100);
        multipliers.put("thousand", 1000);
        multipliers.put("million", 1000000);
    }

    public static int convertToNumber(String input) {
        String[] words = input.toLowerCase().split("\\s+");
        int total = 0;
        int current = 0;

        for (String word : words) {
            if (wordsToNumbers.containsKey(word)) {
                current += wordsToNumbers.get(word);
            } else if (multipliers.containsKey(word)) {
                current *= multipliers.get(word);
                if (word.equals("thousand") || word.equals("million")) {
                    total += current;
                    current = 0;
                }
            }
        }

        return total + current;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String input = sc.next();
        System.out.println("Input: " + input);
        System.out.println("Output: " + convertToNumber(input)); // Expected Output: 123456
        sc.close();
    }
  
}
