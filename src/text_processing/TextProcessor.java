package text_processing;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("I love Java");
        reverseString("stop");
    }

    public static void countWords(String text) {
        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
