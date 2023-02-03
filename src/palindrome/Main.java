package palindrome;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isPalindrome(scanner.next()));
    }

    public static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());

    }
}
