package guessWord;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main (String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" ,
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"
        };
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        //System.out.println(randomWord);
        System.out.println("Enter the word : ");
        String word = scanner.next().toLowerCase();
        while (!randomWord.equals(word)){
            String screenWord = "";
            for(int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == word.charAt(i)) {
                    screenWord = screenWord + randomWord.charAt(i);
                } else {
                    screenWord = screenWord + "#";
                }
            }
            System.out.println(screenWord + "###############");
            System.out.println("Try again!");
            word = scanner.next().toLowerCase();

        }
        if (randomWord.equals(word)) {
            System.out.println("Yes it's: " + word);
        }
    }
}
