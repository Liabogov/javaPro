package reverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scanner.next();
        String reversedString = new StringBuilder(string).reverse().toString();
        System.out.println("Reverse: " + reversedString);
    }
}