package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {
        if (input == null) return null;
        String trimmed = input.trim();
        return new StringBuilder(trimmed).reverse().toString();
    }

    public String reverseWords(String input) {
        if (input == null) return null;

        String trimmed = input.trim();
        String[] words = trimmed.split("\\s+");

        StringBuilder result = new StringBuilder();
        result.append(words[words.length - 1]);

        for (int i = words.length - 2; i >= 0; i--) {
            result.append(" ").append(words[i]);
        }

        return result.toString();
    }
}