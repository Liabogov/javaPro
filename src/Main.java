import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scanner.next();
        System.out.println("Enter the symbol");
        String symbol = scanner.next();
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == symbol.charAt(0)) {
                count++;
            }
        }
        System.out.println("Count symbol " + count);


    }
}


