public class CountVowels {
    public static void main(String[] args) {
        String word = "Hello My Name Is Justin";

        System.out.println("Input: " + word);
        System.out.println("Vowel Count: " + countVowels(word));
    }

    public static int countVowels(String word) {
        // Convert the input word to lowercase for case insensitivity
        word = word.toLowerCase();
        int vowelsCount = 0;

        // Loop through each character in the word
        for (char c : word.toCharArray()) {
            // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
