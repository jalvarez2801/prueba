package test.test;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

	public static Map<String, Integer> countWords(String sentence) {
		Map<String, Integer> wordCount = new HashMap<>();
		StringBuilder cleanedSentence = new StringBuilder();
		sentence = sentence.toLowerCase();
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (Character.isLetter(c) || Character.isDigit(c) || c == ' ') {
				cleanedSentence.append(c);
			}
		}
		String[] words = cleanedSentence.toString().split(" ");
		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}
		return wordCount;
	}

	public static void main(String[] args) {
		String sentence = "La vida de la mujer es muy dura";
		Map<String, Integer> wordCount = countWords(sentence);
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}